package com.example.pract16;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.r1) {
            layout.setBackgroundColor(Color.RED);
            return true;
        } else if (id == R.id.g1) {
            layout.setBackgroundColor(Color.GREEN);
            return true;
        } else if (id == R.id.b1) {
            layout.setBackgroundColor(Color.BLUE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
