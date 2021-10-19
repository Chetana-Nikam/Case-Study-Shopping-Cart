package com.chetana.adminaccountservice.service;


import com.chetana.adminaccountservice.entity.sql.SellerInfo;
import com.chetana.adminraccountservice.entity.nosql.SellerBulkInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

