package com.example.listview2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
    // main code goes in here....

    // on create for the whole menu...
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return  true;
    }

    // on create for the items selected

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int SelectedItem = item.getItemId();

        // on click on each item till the last one
        if (SelectedItem == R.id.menu1){
            Toast.makeText(this, "You Want to know more about Kenya!!", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (SelectedItem == R.id.menu2){
            Toast.makeText(this, "You want to know more about SouthSudan", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (SelectedItem == R.id.menu3){
            Toast.makeText(this, "You want to know more about Ethiopia", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (SelectedItem == R.id.menu4){
            Toast.makeText(this, "You want to know more about uganda", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (SelectedItem == R.id.menu5){
            Toast.makeText(this, "You want to know more about Tanzania", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (SelectedItem == R.id.menu6){
            Toast.makeText(this, "You want to know more about Rwanda", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (SelectedItem == R.id.menu7){
            Toast.makeText(this, "You want to know more about Burundi", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}