package com.pricematrix;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixImpl {

	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object created....");
	}

	public double getItemPrice(String itemCode) {
		// code to fetch price for the given itemCode from db
		return 100.00;

	}

}
