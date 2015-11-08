package com.example.scoot.x2;

import android.app.ActionBar;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import 	android.view.ViewGroup.LayoutParams;

import java.util.*;


public class MainActivity extends AppCompatActivity {
    private List<Rendezvous> rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            rs = extras.getParcelableArrayList("rendezvous");

//            LinearLayout ll = (LinearLayout)findViewById(R.id.buttonlayout);
//
//           for(int i = 0; i<rs.size();i++){
//               Rendezvous r = rs.get(i);
//               Button myButton = new Button(this);
//               myButton.setText(r.getName());
//
//
//           }


            System.out.println("made it to MainActivity");
        }else{
            rs = new ArrayList<Rendezvous>();
            System.out.println("created array");
        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.fab) //replace bID with the plus button
                {
                    Intent i = new Intent(MainActivity.this, Create.class);
                    i.putParcelableArrayListExtra("rendezvous", (ArrayList<? extends Parcelable>) rs);
                    startActivity(i);
                }
            }
        });


    }

    public void addNewEvent(View v)
    {
        /*if (v.getId() == R.id.bID) //replace bID with the plus button
        {
            Intent i = new Intent(MainActivity.this, Create.class);
            startActivity(i);
        }*/
    }
    //retrieve our eventID
    //Bundle extras = getIntent().getExtras();
    //int eventID = extras.getInt("newEID");
    //retrieve our rendezvous object
    //Rendezvous rendezvous = (Rendezvous)extras.getParcelable("rendezvous");
    //create List of objects
   //Intent i = getIntent();
   // Rendezvous rendezvous = (Rendezvous)i.getSerializableExtra("rendezvous");



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
