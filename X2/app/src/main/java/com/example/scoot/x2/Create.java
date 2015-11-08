package com.example.scoot.x2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.lang.Math;

/**
 * Created by Scoot on 11/7/2015.
 */
public class Create extends Activity {
    EditText name, description, date, location;
    String namex, descriptionx, datex, locationx;
     //int eventID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create);
    }

    /*public int getEventID()
    {
        return eventID;
    }*/
    // typecast EditTexts to Strings
    public void setStrings()
    {
        name = (EditText) findViewById(R.id.nameID);
        namex = name.getText().toString();
        description = (EditText) findViewById(R.id.descID);
        descriptionx = description.getText().toString();
        date = (EditText) findViewById(R.id.dateID);
        datex = date.getText().toString();
        location = (EditText) findViewById(R.id.locID);
        locationx = location.getText().toString();
        System.out.println(namex+" "+descriptionx);
    }

    //when done button is pressed goto events
    public void goToEvents(View v)
    {
        if (v.getId() == R.id.doneButton)
        {
           // eventID++;
            setStrings(); //Needs to be here to make sure strings are gotten
            Intent i = new Intent(this, MainActivity.class);
            //i.putExtra("newEID", eventID);
            //i.putExtra("rendezvous", new Rendezvous(namex, descriptionx, datex, locationx)); //better way then previous
            Rendezvous r = new Rendezvous(namex,descriptionx,datex,locationx); //create new Rendezvous object
            i.putExtra("rendezvous",r);
            String oID = Integer.toString(r.getID());
            System.out.println(r);
            //RelativeLayout mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeID);
            //EditText e1 = new EditText(this);
            //e1.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            //e1.setText("Event" + " " + oID);
            //System.out.println("just checking");
            //mRelativeLayout.addView(e1);
            //System.out.println("here");
            //e1.setWidth(200);
            //System.out.println("next");
            //e1.setHeight(200);
            //System.out.println("that");
            //e1.setX(500);
            //System.out.println("there");
            //e1.setY(900);
            //System.out.println("what");
            startActivity(i);
            //System.out.println("you suck");
        }

    }

}