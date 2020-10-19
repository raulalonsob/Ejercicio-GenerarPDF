package com.raul.datos;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {

	
	
	
	public List<Persona> devolverPersonas(){
		
	ArrayList<Persona> listaPersona = new ArrayList();
	
	Persona per1 = new Persona ("raul","la Alberca");
	Persona per2 = new Persona ("Pedro","Salamanca");
	Persona per3 = new Persona ("Rober","Riomalo");
	Persona per4 = new Persona ("Juan","Salamanca");
	Persona per5 = new Persona ("Oscar","Valladolid");
	Persona per6 = new Persona ("Mario","Huesca");
	Persona per7 = new Persona ("Santi","Forfoleda");
	
	listaPersona.add(per1);
	listaPersona.add(per2);
	listaPersona.add(per3);
	listaPersona.add(per4);
	listaPersona.add(per5);
	listaPersona.add(per6);
	listaPersona.add(per7);
		
		
		
		return listaPersona;
		
	}

}
