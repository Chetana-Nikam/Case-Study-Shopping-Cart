package in.bushansirgur.restapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.chetana.restapi.dao.ProductDAO;
import in.chetana.restapi.model.ProductModel;


@SpringBootTest
public class SpringBootMongodbRestApiApplicationTests {

	
	
	@Autowired
	private ProductDAO  productrepo;
	
	@Test
	public void addProduct() {
		
		ProductModel product = new ProductModel();
		product.setId((long) 1);
		product.setSellerId((long) 88);
		//product.setPublicationDate(01/02/1999);
		product.setPrice(555.00);
		product.setAvailableQuantity((long) 9);
		product.setDeliveryTime((long) 500);
		product.setRatings(3.2);
		product.setVerificationStatus(true);
		product.setName("Saree");
		product.setImageLocalPath("path");
		product.setImageURL("link");
		//product.setProductBrandCategory("Top");
		productrepo.save(product);
		assertNotNull(productrepo.findById((long) 1).get());	
	}

}

