package edu.ap.rest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class RegistratieResource extends ServerResource {

	
	private static final String FILENAME = "C:\\Users/talha/OneDrive/Bureaublad/ExamenWebtech/File.txt";
	
	@Get
	public String allStudents() {
		

		return ("GET WORKSss");
	}
	
	
	@Post("txt")
	public void newPatient(String json) throws IOException {
		
		
		
		JSONObject newPatient = new JSONObject(json);
		String firstname = newPatient.getString("DatumenUur");
		String lastname = newPatient.getString("NaamPatient");
		String Geboortedatum = newPatient.getString("Geboortedatum");
		String NaamVerpleegkundige = newPatient.getString("NaamVerpleegkundige");
		String Diagnose = newPatient.getString("Diagnose");
		
		String alles=firstname+lastname+Geboortedatum+NaamVerpleegkundige+Diagnose;
		
		File file=new File(FILENAME);
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bf=new BufferedWriter(fw);
		PrintWriter pr=new PrintWriter(bf);
		pr.print(newPatient.toString());
		pr.close();
		
		
	
		
	}
}