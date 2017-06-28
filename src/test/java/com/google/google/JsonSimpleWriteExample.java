package com.google.google;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class JsonSimpleWriteExample {

	 public static void main(String[] args) {


	        JSONParser parser = new JSONParser();

	        try {

	         JSONObject obj = null;
				try {
					obj = (JSONObject) parser.parse(new FileReader("/home/qainfotech/db.json"));
				} catch (org.json.simple.parser.ParseException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}

				

				
	            JSONObject jsonObject = (JSONObject) obj;
	            
	           // System.out.println(jsonObject);
	            
	            
	            
	            
	            
	            
	            
	            JSONArray second =(JSONArray) jsonObject.get("individuals");
	            
	            System.out.println(jsonObject.get("individuals"));
	            
	            
	            
	            
	            JSONObject firstobjteam = (JSONObject) second.get(0);

	            System.out.println(firstobjteam.get("name"));
	            
	            
	            

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	    }
	
}
