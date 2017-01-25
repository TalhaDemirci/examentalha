package edu.ap.races;

import org.restlet.resource.ClientResource;

public class RaceClient {

     public static void main(String[] args) {
           
             try {
            	ClientResource resource = new ClientResource("http://localhost:8080/Races/race");
            	// Post a new race
            	resource.get();
            	
            }
            catch (Exception e) {
                System.out.println("In main : " + e.getMessage());
            }
        }
    }