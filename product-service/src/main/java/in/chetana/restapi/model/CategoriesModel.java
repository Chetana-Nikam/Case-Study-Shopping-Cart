package in.chetana.restapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.sql.Timestamp;
import java.util.*;

class Apparel {
	int id;
	private String value;
	private int totalItems;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public Apparel(int id, String value, int totalItems) {
		super();
		this.id = id;
		this.value = value;
		this.totalItems = totalItems;
	}
	@Override
	public String toString() {
		return "Apparel [id=" + id + ", value=" + value + ", totalItems=" + totalItems + "]";
	}
	
	
	
	
}

@Document(collection = "categories")
public class CategoriesModel {
	
	public static final String SEQUENCE_NAME = "categories_sequence"; 
	
	@Id
	private Long id;
	
	private List<Apparel> apparels;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Apparel> getApparels() {
		return apparels;
	}

	public void setApparels(List<Apparel> apparels) {
		this.apparels = apparels;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	public CategoriesModel(Long id, List<Apparel> apparels) {
		super();
		this.id = id;
		this.apparels = apparels;
	}

	@Override
	public String toString() {
		return "CategoriesModel [apparels=" + apparels + "]";
	}
	
	
	
	
}
