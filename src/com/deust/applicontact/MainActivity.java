package com.deust.applicontact;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends Activity {

	 ListView monListView;
	 String[] mes_contacts = new String[]{
	            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
	            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
	            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
	            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
	            "Yann", "Zoé"
	       };
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        monListView= (ListView) findViewById(R.id.listViewContacts);
        
        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"
 
        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
        android.R.layout.simple_list_item_1, mes_contacts);
        monListView.setAdapter(adapter);*/
        
        //Récupération de la liste des personnes
        ArrayList<Contact> listP = Contact.Initialiser(); 
//Création et initialisation de l'Adapter pour les contact   
        ContactAdapter adapter = new ContactAdapter(this, listP); 
//Récupération du composant ListView
        ListView list = (ListView)findViewById(R.id.listViewContacts); 
//Initialisation de la liste avec les données
        list.setAdapter(adapter); 
        
        
        
        final Button monbutton1 = (Button) findViewById(R.id.button1);
        monbutton1.setOnClickListener(new OnClickListener() {
                   
        @Override
        public void onClick(View v) {
          Intent intent = new Intent(MainActivity.this, MainActivitySecond.class);
          startActivity(intent);
          }
      });
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
