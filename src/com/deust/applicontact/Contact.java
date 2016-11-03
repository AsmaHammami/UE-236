package com.deust.applicontact;

import java.util.ArrayList; 
public class Contact { 
	
public String nom_prenom ; 

public String telephone; 

public Contact(String aNomPrenom, String aTelephone) { 
		this.nom_prenom= aNomPrenom; 

		this.telephone= aTelephone; 
		}         
		public static ArrayList<Contact> Initialiser () { 
			
		           ArrayList<Contact> listContact = new ArrayList<Contact>(); 
		           
		           Contact MonContact = new Contact("Dupont Thierry","0124524521");           
		           listContact.add(MonContact); 
		           
		           MonContact = new Contact("Dupont Helene", "054878569"); 
		           listContact.add(MonContact);
		           
		           MonContact = new Contact("Dupont Benoit", "064878569"); 
		           listContact.add(MonContact);
		           
		           MonContact = new Contact("Dupont Cyril", "094878569"); 
		           listContact.add(MonContact);
		           
		           
		return listContact; 
		} 

}
