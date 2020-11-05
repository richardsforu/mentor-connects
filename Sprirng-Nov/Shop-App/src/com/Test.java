package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "I01", "I02", "I03" };
		String[] cart2 = { "I01", "I02" };
		
		
		//-----------------------------------------
		
		PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency object
		
		//-----------------------------------------
		
		BillingImpl biller = new BillingImpl(); // Dependent object
		
		biller.setPrice(price); // Injecting dependency object (price) to the dependent object (biller) -> DI

		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
