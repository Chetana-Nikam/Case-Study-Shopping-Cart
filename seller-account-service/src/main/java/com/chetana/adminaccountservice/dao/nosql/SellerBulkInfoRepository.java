package com.chetana.adminaccountservice.dao.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chetana.adminraccountservice.entity.nosql.SellerBulkInfo;

public interface SellerBulkInfoRepository extends MongoRepository<SellerBulkInfo, Integer> {
}
