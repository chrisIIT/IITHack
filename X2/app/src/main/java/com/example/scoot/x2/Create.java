package com.example.scoot.x2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Scoot on 11/7/2015.
 */
public class Create extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create);
    }

    public void goToEvents(View v)
    {
        /*if (v.getId() == R.id.bID) //replace bID with the plus button
        {
            Intent i = new Intent(Create.this, MainActivity.class);
            startActivity(i);
        }*/
    }
}