package edu.ap.races;

import java.io.IOException;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

public class RacesResource extends ServerResource {

	@Get("txt")
	public String getRaces() throws IOException {
		XMLParser parser = new XMLParser();
		return parser.getRaces();
	}
	
	
	
	

}
