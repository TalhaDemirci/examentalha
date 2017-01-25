package edu.ap.races;

import java.io.IOException;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

/**
 * This resource represents an individual race instance
 */
public class RaceResource extends ServerResource {

	@Get("txt")
	public String getRaces() {
		XMLParser parser = new XMLParser();
		return parser.getRaces();
	}
	
	
}
