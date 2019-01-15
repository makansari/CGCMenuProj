package com.ansari.cgcmenuproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       int id = item.getItemId();

       if(id==R.id.idToast){
           Toast.makeText(this, "The toast item is selected", Toast.LENGTH_SHORT).show();
       }

       if(id==R.id.idActivity){

       }
        return super.onOptionsItemSelected(item);
    }
}
