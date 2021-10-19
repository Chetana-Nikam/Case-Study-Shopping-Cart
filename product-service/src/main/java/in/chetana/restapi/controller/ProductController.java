package in.chetana.restapi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.chetana.restapi.dao.CategoriesDAO;
import in.chetana.restapi.dao.ProductDAO;
import in.chetana.restapi.model.CategoriesModel;
import in.chetana.restapi.model.ProductModel;
import in.chetana.restapi.model.ProductsModel;
import in.chetana.restapi.service.SequenceGeneratorService;


@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class ProductController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CategoriesDAO categoriesDAO;
	
	@Autowired
	SequenceGeneratorService seqGeneratorService;
	
	@PostMapping("/create")
	public ProductModel create(@RequestBody ProductModel newProductObject) {
		newProductObject.setId(seqGeneratorService.generateSequence(ProductModel.SEQUENCE_NAME));
		return productDAO.save(newProductObject);
	}
	
	@GetMapping("/read")
	public List<ProductModel> read(){
		return productDAO.findAll();
	}
	
	@GetMapping("/read/{id}")
	public ProductModel read(@PathVariable Long id) {
		Optional<ProductModel> productObj = productDAO.findById(id);
		if(productObj.isPresent()) {
			return productObj.get();
		}else {
			throw new RuntimeException("Product not found with id "+id);
		}
	}
	
	 @GetMapping(value = "/products", params = "q")
	    public ProductsModel getProductsByCategories(@RequestParam("q") String queryParams) {
		 int id;
		 String []str = queryParams.split("::");
		 String categories = "";
		 if(str.length >= 2 && str[1].contains("apparels")) {
			 categories = str[1].split("=")[1];	
			 System.out.println("**"+categories);
			 
			 List<ProductModel> products = productDAO.findAll();
			 
			 Iterator<ProductModel> it = products.iterator();

			 List<ProductModel> productFinal = new ArrayList<>();
			 
			 while( it.hasNext() ) {
			   ProductModel foo = it.next();
			   System.out.println("category"+ (int)foo.getCategory());
			   if(categories.contains(foo.getCategory().toString())) {productFinal.add(foo);		}
			 }
			 
			 return new ProductsModel(productFinal.size(), productFinal );
		 }
		 
		 List<ProductModel> productFinal = productDAO.findAll();
		 return new ProductsModel(productFinal.size(), productFinal);
		 
		 
	 }
	 
	 @GetMapping(value = "/filter", params = "q")
	    public Optional<CategoriesModel> getProductsByFilter(@RequestParam("q") String queryParams) {
		 return categoriesDAO.findById((long) 3);
		 
	 }
	 
	 @PostMapping("/filter")
	    public CategoriesModel createCategories(@RequestBody CategoriesModel newCategoriesObject) {
		 newCategoriesObject.setId(seqGeneratorService.generateSequence(CategoriesModel.SEQUENCE_NAME));
		 return categoriesDAO.save(newCategoriesObject);
		 
	 }
	 
	@GetMapping(value = "/products", params = "product_id")
	public Map<String, ProductModel> getProductsById(@RequestParam("product_id") String queryParams) {
		
		String[] productIds = queryParams.split(",");
		
		System.out.println("productIds" + productIds[0]);
		
		Optional<ProductModel> productObj = productDAO.findById(Long.parseLong(productIds[0]));
		if(productObj.isPresent()) {
			Map <String, ProductModel> map = new HashMap<String, ProductModel>();
			map.put(productIds[0],productObj.get());
			
			return map;
		}else {
			throw new RuntimeException("Product not found with id "+productIds[0]);
		}
	}
	
	
	@PutMapping("/update")
	public ProductModel update(@RequestBody ProductModel modifiedProductObject) {
		return productDAO.save(modifiedProductObject);
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		Optional<ProductModel> productObj = productDAO.findById(id);
		if(productObj.isPresent()) {
			productDAO.delete(productObj.get());
			return "Product deleted with id "+id;
		}else {
			throw new RuntimeException("Product not found for id "+id);
		}
	}
	
}
