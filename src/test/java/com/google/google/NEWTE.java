package com.google.google;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class NEWTE {

	
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
     
        JSONObject myObject = new JSONObject();
        
        JSONArray my1 = new JSONArray();
        JSONArray my2 = new JSONArray();
        
        JSONObject obj1 = new JSONObject();
        
        
        obj1.put("id", 1201);
        obj1.put("name", "John Doe");
        obj1.put("active", true);
        
        my1.add(obj1);
        

              
        myObject.put("individuals", my1);
        myObject.put("teams", my2);
        
        
        
        

        try (FileWriter file = new FileWriter("/home/qainfotech/db.json")) {

            file.write(myObject.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }
	
}
