package com.chetana.adminraccountservice.entity.nosql;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class SellerBulkInfo {

    @Id
    private int id;

    public SellerBulkInfo(int id, SellerMessage sellerMessage, ArrayList<SellerReview> sellerReview,
			ArrayList<SellerAccountNotification> sellerAccountNotification) {
		super();
		this.id = id;
		this.sellerMessage = sellerMessage;
		this.sellerReview = sellerReview;
		this.sellerAccountNotification = sellerAccountNotification;
	}

	private SellerMessage sellerMessage;

    private ArrayList<SellerReview> sellerReview;

    private ArrayList<SellerAccountNotification> sellerAccountNotification;
}
