package com.example.admin.menuhamburguer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dw_drawer;
    private ActionBarDrawerToggle izqToggle;
    private ActionBarDrawerToggle derToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dw_drawer = (DrawerLayout) findViewById(R.id.dw_drawer);
        izqToggle = new ActionBarDrawerToggle(this,dw_drawer,R.string.abrirIzq,R.string.cerrarIzq);
        dw_drawer.addDrawerListener(izqToggle);
        izqToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (izqToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //enseñar menu derecho
        getMenuInflater().inflate(R.menu.menu_derecho,menu);
        return true;
    }
}
