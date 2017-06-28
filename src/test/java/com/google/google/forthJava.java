package com.google.google;


import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class forthJava {
 

    public static void main(String... args) throws Exception{
       
    	
    	
    	
    	Document page = (Document) Jsoup.connect(
                "http://www.xe.com/currencyconverter/convert/?Amount="
                + args[0]
                + "&From=USD&To=INR"
        ).get();
        
        System.out.println(args[0] 
                + "USD == " 
                + ((Element) page).select("span.uccResultAmount").text() 
                + "INR"
        );
    }
}