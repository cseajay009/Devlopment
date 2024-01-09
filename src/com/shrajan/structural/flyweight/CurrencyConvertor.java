package com.shrajan.structural.flyweight;

public class CurrencyConvertor {

	public static void main(String[] args) {
		CurrencyFlyweight currencyFactory = new CurrencyFlyweight();

        // Exchange rates for currencies
        double usdToEurRate = 0.88; // 1 USD = 0.88 EUR
        double eurToUsdRate = 1.14; // 1 EUR = 1.14 USD

        // Perform currency conversions
        Currency usd = currencyFactory.getCurrency("USD");
        System.out.println( usd.convert(100, usdToEurRate)); // Converting 100 USD to EUR

        Currency eur = currencyFactory.getCurrency("EUR");
        System.out.println(eur.convert(200, eurToUsdRate)); // Converting 200 EUR to USD

        Currency usdAgain = currencyFactory.getCurrency("USD");
         // Reusing the currency, already created with the same name and rate
        System.out.println(usdAgain.convert(150, usdToEurRate));
	}

}
