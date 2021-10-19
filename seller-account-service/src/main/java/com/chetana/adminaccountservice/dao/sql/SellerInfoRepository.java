package com.chetana.adminaccountservice.dao.sql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chetana.adminaccountservice.entity.sql.SellerInfo;

public interface SellerInfoRepository extends JpaRepository<SellerInfo, Integer> {
}
