package br.com.projetoweb.bean;

import javax.json.Json;
import javax.json.JsonObject;

import com.google.gson.Gson;

public class GeoJsonBEAN {

	public void createJson(){
	
	JsonObject creatingJson = Json.createObjectBuilder() //cria objeto {}
			.add("type","FeatureCollection")
			.add("features",Json.createArrayBuilder()// cria o array feature []
					.add(Json.createObjectBuilder() // cria objeto {}
					.add("type", "Feature")
					.add("properties", Json.createObjectBuilder()
							.add("id","1")
							.add("name", "AAAA")
							.add("description", "AAA"))
					.add("geometry", Json.createObjectBuilder()
							.add("type","Polygon")
							.add("coordinates",Json.createArrayBuilder()
									.add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add("La123,Lng321")
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add("La456,Lng654")
													
													)//each lat and lng of city	        
											)
																		
									)//array with all lat and lng of a city
							
							
							))// fecha  obj  geometry and obj properties
					
					
					).build();
	
	String result = creatingJson.toString();
	
	System.out.println(result);
	
	}
	
	
	
}
