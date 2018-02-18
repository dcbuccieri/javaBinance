package myPackage;

import com.webcerebrium.binance.api.BinanceApi;
import com.webcerebrium.binance.api.BinanceApiException;


public class myClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!!!");
		try {
			  BinanceApi api = new BinanceApi();
			  System.out.println("ETH-BTC PRICE=" + api.pricesMap().get("ETHBTC"));
			  System.out.println(api.ping() );
			} catch (BinanceApiException e) {
			  System.out.println( "ERROR: " + e.getMessage());
			}
	}
}
