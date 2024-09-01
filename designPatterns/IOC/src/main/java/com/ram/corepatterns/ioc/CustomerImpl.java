package com.ram.corepatterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	
	private CreditCard creditCard;
	
	@Autowired
	public CustomerImpl(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	@Override
	public void payViaCard() {
		getCreditCard().makePayments();
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
