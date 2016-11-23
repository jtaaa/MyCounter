package com.jallum.mycounter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            final ActionBar ab = getSupportActionBar();
            ab.setDisplayShowHomeEnabled(false); // show or hide the default home button
            ab.setDisplayHomeAsUpEnabled(false);
            ab.setDisplayShowCustomEnabled(true); // enable overriding the default toolbar layout
            ab.setDisplayShowTitleEnabled(false); // disable the default title element here (for centered title)

        }

    }

    public void add1(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        int curr_count = Integer.parseInt(count.getText().toString());
        curr_count += 1;
        count.setText(String.valueOf(curr_count));
    }
}
