package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrixImpl;

@Service
public class BillingImpl {


	
	@Autowired
	private PriceMatrixImpl price;


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
