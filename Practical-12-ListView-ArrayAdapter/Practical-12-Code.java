package com.anu.listviewdemo;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView l;
    String[] days = {"sunday", "monday", "tue", "wend", "thru", "fri", "sat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.listview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                days
        );
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp = (TextView) view;
        Toast.makeText(this, temp.getText() + " " + position, Toast.LENGTH_SHORT).show();

        if (position == 0) {
            temp.setBackgroundColor(Color.BLUE);
        } else if (position == 1) {
            temp.setBackgroundColor(Color.RED);
        } else if (position == 2) {
            temp.setBackgroundColor(Color.CYAN);
        }
    }
}
