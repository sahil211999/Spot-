package com.example.abdulghanipiracha.spot_;

import android.content.Intent;
        import android.support.annotation.NonNull;
        import android.support.design.widget.NavigationView;
        import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
        import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MenuItem;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {
    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mtoggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mdrawerlayout=(DrawerLayout) findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,mdrawerlayout,R.string.Open,R.string.Close);
        mdrawerlayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item)) {
            return true;

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_calender) {
            Intent intent = new Intent(this, Calendar.class);
            startActivity(intent);

        }
        if(id == R.id.nav_guide) {
            Intent intent = new Intent(this, Guide.class);
            startActivity(intent);

        }
        if(id == R.id.nav_map) {
            Intent intent = new Intent(this, Map.class);
            startActivity(intent);

        }
        if(id == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        return false;



    }



}
