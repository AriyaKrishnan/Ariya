package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		ShoeShop shop = ctx.getBean("ashop", ShoeShop.class);
		System.out.println(shop.sellShoe());
	}

}

abstract class Shoe {
}

class LeatherShoe extends Shoe {
}

class SportsShoe extends Shoe {
}

abstract class Factory {
	public abstract Shoe makeshoe();
}

@Component("bsf")
class BataBrand extends Factory {
	public BataBrand() {
		System.out.println("Bata Brand Object created..");
	}

	@Override
	public Shoe makeshoe() {
		return new LeatherShoe();

	}
}

@Component("lsf")
class LakhaniBrand extends Factory {
	public LakhaniBrand() {
		System.out.println("Lakhani Brand Object created..");
	}

	@Override
	public Shoe makeshoe() {
		return new SportsShoe();
	}
}

abstract class ShoeShop {
	@Autowired
	@Qualifier("bsf")
	private Factory factory;

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public abstract Shoe sellShoe();
}

@Component("ashop")
class AnoudShop extends ShoeShop {
	public AnoudShop() {
		System.out.println("Anoud Shoe Shop Object Created..");

	}

	@Override
	public Shoe sellShoe() {
		System.out.println(getFactory());
		return getFactory().makeshoe();
	}

}
