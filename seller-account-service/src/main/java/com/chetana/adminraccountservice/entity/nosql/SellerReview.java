package com.chetana.adminraccountservice.entity.nosql;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SellerReview {

	private double rating;
    private String comment;
    private String timestamp;
    
    public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public SellerReview(double rating, String comment, String timestamp) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.timestamp = timestamp;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	
}