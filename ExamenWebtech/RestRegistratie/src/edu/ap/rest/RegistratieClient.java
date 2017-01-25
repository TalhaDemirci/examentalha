package edu.ap.rest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class RegistratieClient {

    // http://hc.apache.org/
     public static void main(String[] args) {
           
             try {
            	ClientResource resource = new ClientResource("http://127.0.0.1:8181/reg/registratie");
            	// Post a new record
            	
            	JSONObject json = new JSONObject();
            	json.put("DatumenUur", "01/09/2017U15-27");
        		json.put("NaamPatient", "Talha");
        		json.put("Geboortedatum", "20/10/1993");
        		json.put("NaamVerpleegkundige", "Verpleegkundige");
        		json.put("Diagnose", "Zot");

        		resource.post(json.toString());
        		System.out.println(resource.getResponseEntity().getText());
        		
        		
            	JSONObject json2 = new JSONObject();
            	json2.put("DatumenUur", "01/09/2016U15-27");
        		json2.put("NaamPatient", "Talha2");
        		json2.put("Geboortedatum", "20/10/1996");
        		json2.put("NaamVerpleegkundige", "Verpleegkundige22");
        		json2.put("Diagnose", "Zot22");
        		resource.post(json2.toString());
        		System.out.println(resource.getResponseEntity().getText());
            	
            	// Write the response entity on the console
            	/*resource.get().write(System.out);
            	System.out.println();
            	// Process the resource
                JSONObject obj1 = new JSONObject(resource.get(String.class));
                JSONArray array1 = obj1.getJSONArray("result");
               
                for(int i = 0; i < array1.length(); i++) {
                    JSONObject obj2 = array1.getJSONObject(i);
                    System.out.println(obj2.toString());
                 }*/
            }
            catch (Exception e) {
                System.out.println("In main : " + e.getMessage());
            }
        }
    }
