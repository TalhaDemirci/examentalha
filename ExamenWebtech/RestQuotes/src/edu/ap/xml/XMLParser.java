package edu.ap.xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.InputSource;

import java.io.*;

public class XMLParser {
	
	private String INPUTFILE = "/Users/talha/workspace/RestQuotes/quotes.txt";
	
	/** Get all races from the txt file and return them 
	 * in html format 
	 */
	public String getRaces() {
		String alles="";
		try {
		    BufferedReader in = new BufferedReader(new FileReader("INPUTFILE"));
		    String str;
		    while ((str = in.readLine()) != null)
		    {
		       alles+=str;
		    }  
		    in.close();
		} catch (IOException e) {
		}
		return alles;
	}
}
