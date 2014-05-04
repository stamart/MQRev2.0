package com.mqrev20.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText questnametxt, nametxt, emailtxt, adress1txt, adress2txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questnametxt = (EditText) findViewById(R.id.txtQuestName);
        nametxt = (EditText) findViewById(R.id.txtName);
        emailtxt = (EditText) findViewById(R.id.txtemail);
        adress1txt = (EditText) findViewById(R.id.txtAdress);
        adress2txt = (EditText) findViewById(R.id.txtAdress2);
        Button addBtn = (Button) findViewById(R.id.addBtn);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
