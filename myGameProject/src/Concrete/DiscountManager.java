package Concrete;

import Abstract.DiscountService;

public class DiscountManager implements DiscountService {

	
	@Override
	public double discountPriceCalculation(double price, double discount) {
		double result=price-(price*discount/100);
		return result;
	}

}
