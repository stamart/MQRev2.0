package com.mqrev20.app;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    EditText questnametxt, nametxt, emailtxt, adress1txt, adress2txt;
    List<ContactList> Contactlists = new ArrayList<ContactList>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questnametxt = (EditText) findViewById(R.id.txtQuestName);
        nametxt = (EditText) findViewById(R.id.txtName);
        emailtxt = (EditText) findViewById(R.id.txtemail);
        adress1txt = (EditText) findViewById(R.id.txtAdress);
        adress2txt = (EditText) findViewById(R.id.txtAdress2);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("addquest");
        tabSpec.setContent(R.id.tabaddquest);
        tabSpec.setIndicator("Add New Quest");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("list");
        tabSpec.setContent(R.id.tabContactList);
        tabSpec.setIndicator("Quest List");
        tabHost.addTab(tabSpec);





        final Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Your Quest has been created", Toast.LENGTH_SHORT).show();
                //Funkcja wyświetlająca tekst po wciśnięciu przycisku id addBtn
            }
        });

        questnametxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                addBtn.setEnabled(!questnametxt.getText().toString().trim().isEmpty());
            //Funkcja aktywująca przycisk id addBtn po wpisaniu tekstu w polu id:questnametxt
            //nie wiem dlaczego nie działą poprawnie ?
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private class ContacListAdapter extends ArrayAdapter<ContactList>;
        public ContacListAdapter(){
            super(MainActivity.this);
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
