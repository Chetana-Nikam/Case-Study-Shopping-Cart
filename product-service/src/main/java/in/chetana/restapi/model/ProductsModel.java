package in.chetana.restapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.sql.Timestamp;
import java.util.*;

public class ProductsModel {
	
	public static final String SEQUENCE_NAME = "productss_sequence"; 
	
	private int totalCount;
	private List<ProductModel> products;
	
	
	public ProductsModel(int totalCount, List<ProductModel> products) {
		super();
		this.totalCount = totalCount;
		this.products = products;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<ProductModel> getProducts() {
		return products;
	}
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	@Override
	public String toString() {
		return "ProductsModel [totalCount=" + totalCount + ", products=" + products + "]";
	}
	
	
}
