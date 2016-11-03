package com.deust.applicontact;

import java.util.List; 
import android.content.Context; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.BaseAdapter; 
import android.widget.CheckBox;
import android.widget.LinearLayout; 
import android.widget.TextView; 

public class ContactAdapter extends BaseAdapter { 
//Une liste de contact
private List<Contact>mListP; 
//Le contexte dans lequel est pr�sent notre adapter
private Context  mContext; 
//Un m�canisme pour g�rer l'affichage graphique depuis un layout XML
private LayoutInflater mInflater ; 
//le constructeur
public ContactAdapter(Context context, List<Contact> aListP) { 
mContext= context; 
mListP= aListP; 
//Le LayoutInflater permet de parser un layout XML et de te transcoder en IHM Android.
mInflater= LayoutInflater.from(mContext); 
         } 
//Pour respecter l'interface BaseAdapter, il nous faut sp�cifier la m�thode "count()".
public int getCount() { 
return mListP.size(); 
         } 
public Object getItem(int position) { 
return mListP.get(position); 
         } 
public long getItemId(int position) { 
return position; 
         } 
//Maintenant il faut surcharger la m�thode pour renvoyer  "View"
//en fonction d'une position donn�e.
public View getView(int position, View convertView, ViewGroup parent) { 
           LinearLayout layoutItem; 
//(1) : R�utilisation des layouts
if(convertView == null) { 
//Initialisation de notre item � partir du  layout XML "main_contact.xml"
  layoutItem = (LinearLayout) mInflater.inflate(R.layout.main_contact, parent,false); 
           } 
else
{ 
               layoutItem = (LinearLayout) convertView; 
         } 
//(2) : R�cup�ration des TextView de notre layout
         CheckBox tv_checked = (CheckBox)layoutItem.findViewById(R.id.nom_prenom);

         TextView tv_telephone = (TextView)layoutItem.findViewById(R.id.telephone);
//(3) : Renseignement des valeurs
         tv_checked.setText(mListP.get(position).nom_prenom); 

         tv_telephone.setText(mListP.get(position).telephone); 
//On retourne l'item cr��.
return layoutItem; 
       } 
} 