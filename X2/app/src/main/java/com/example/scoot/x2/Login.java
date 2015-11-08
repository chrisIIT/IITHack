package com.example.scoot.x2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Scoot on 11/7/2015.
 */
public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void goToEvents(View v)
    {
        if (v.getId() == R.id.loginButton) //replace bID with the plus button
        {
            Intent i = new Intent(Login.this, Create.class);
            startActivity(i);
        }
    }
}