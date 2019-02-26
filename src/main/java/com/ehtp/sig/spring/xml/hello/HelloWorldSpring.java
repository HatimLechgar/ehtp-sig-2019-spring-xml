package com.ehtp.sig.spring.xml.hello;

import java.util.List;

public class HelloWorldSpring {

	private Person person;
	private List<String> paymentCards;

	public HelloWorldSpring() {
	}

	
	public String sayHay() {
		return "Spring Hello : " + this.person.getFirstName();
	}

	

	public List<String> getPaymentCards() {
		return paymentCards;
	}

	public void setPaymentCards(List<String> paymentCards) {
		this.paymentCards = paymentCards;
	}

	public String yourCards() {
		return "Hi:" + this.person.getFirstName() + " your cards are: " + paymentCards.toString();
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
