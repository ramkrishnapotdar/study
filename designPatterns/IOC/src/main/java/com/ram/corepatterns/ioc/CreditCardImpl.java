package com.ram.corepatterns.ioc;

import org.springframework.stereotype.Component;

@Component 
public class CreditCardImpl implements CreditCard {

	@Override
	public void makePayments() {
		// TODO Auto-generated method stub
		System.out.println("paymentmade");
	}

}
