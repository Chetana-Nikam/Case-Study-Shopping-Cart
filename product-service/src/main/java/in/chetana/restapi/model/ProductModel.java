package in.chetana.restapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.sql.Timestamp;
import java.util.*;


class ProductBrandCategory {
	private int id;
	private String type;
	public ProductBrandCategory() {
		super();
		this.id = 1;
		this.type = "test";
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "ProductBrandCategory [id=" + id + ", type=" + type + "]";
	}
	
	
	
}
@Document(collection = "products")
public class ProductModel {
	
	public static final String SEQUENCE_NAME = "products_sequence"; 
	
	@Id
	private Long id;
	private Long sellerId;
	private Date publicationDate;
	
	private Double price;
	private Long availableQuantity;
	
	private Long deliveryTime;
	private Double ratings;
	private Boolean verificationStatus;
	
	
	private String name;
	
	private String imageLocalPath;
	
	private String imageURL;
	
	private ProductBrandCategory productBrandCategory;
	
	private Integer category;

	public ProductModel() {
		super();
		this.productBrandCategory = new ProductBrandCategory();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Long getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Long deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	public Boolean getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(Boolean verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public String getImageLocalPath() {
		return imageLocalPath;
	}

	public void setImageLocalPath(String imageLocalPath) {
		this.imageLocalPath = imageLocalPath;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	

	public ProductBrandCategory getProductBrandCategory() {
		return productBrandCategory;
	}

	public void setProductBrandCategory(ProductBrandCategory productBrandCategory) {
		this.productBrandCategory = productBrandCategory;
	}
		

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", sellerId=" + sellerId + ", publicationDate=" + publicationDate + ", price="
				+ price + ", availableQuantity=" + availableQuantity + ", deliveryTime=" + deliveryTime + ", ratings="
				+ ratings + ", verificationStatus=" + verificationStatus + ", name=" + name + ", imageLocalPath="
				+ imageLocalPath + ", imageURL=" + imageURL + ", productBrandCategory=" + productBrandCategory
				+ ", category=" + category + "]";
	}
	
}
