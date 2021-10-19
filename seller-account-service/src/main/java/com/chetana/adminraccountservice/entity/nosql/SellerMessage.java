package com.chetana.adminraccountservice.entity.nosql;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class SellerMessage {

    private Map<Integer, ArrayList<SellerMessageDetails>> msgThreadMap;

    public Map<Integer, ArrayList<SellerMessageDetails>> getMsgThreadMap() {
		return msgThreadMap;
	}

	public void setMsgThreadMap(Map<Integer, ArrayList<SellerMessageDetails>> msgThreadMap) {
		this.msgThreadMap = msgThreadMap;
	}

	public SellerMessage() {

        msgThreadMap = new HashMap<>();
    }
}