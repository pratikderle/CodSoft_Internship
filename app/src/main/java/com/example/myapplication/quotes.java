package com.example.myapplication;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class quotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quotes);

        // Get the ListView reference
        ListView listView = findViewById(R.id.listView);

        // Create an array of strings from strings.xml
        String[] strings = getResources().getStringArray(R.array.my_strings);

        // Create an ArrayAdapter to populate the ListView with the strings
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strings);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}
