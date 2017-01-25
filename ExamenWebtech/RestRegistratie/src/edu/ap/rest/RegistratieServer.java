package edu.ap.rest;

import org.restlet.*;
import org.restlet.data.Protocol;

public class RegistratieServer {

	public static void main(String[] args) {
		
		try {
			
			// Create a new Component.
		    Component component = new Component();
	
		    // Add a new HTTP server listening on port 8181.
		    component.getServers().add(Protocol.HTTP, 8181);
	
		    // Attach the sample application.
		    component.getDefaultHost().attach("/reg", new RegistratieApplication());
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
