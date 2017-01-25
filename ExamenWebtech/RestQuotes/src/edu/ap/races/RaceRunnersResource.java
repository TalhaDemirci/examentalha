package edu.ap.races;

import java.io.IOException;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

/**
 * This resource represents all runners for a race instance
 */
public class RaceRunnersResource extends ServerResource {

	
	@Get("html")
	public String getRaces() throws IOException {
		XMLParser parser = new XMLParser();
		return parser.getRaces();
	}
}
