package com.example.robin.buildingtrial3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

public class Trial extends AppActivityBuilderMethods {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- Toolbar stuff, don't forget to set the name ---
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Y Building");
        setSupportActionBar(toolbar);

        // --- Gotta put these in the onCreate method ---
        LinearLayout topLayout = (LinearLayout) findViewById(R.id.topLayout);
        LinearLayout bodyLayout = (LinearLayout) findViewById(R.id.bodyLayout);

        // --- topLayout ---
        titleBuilder("Y Building", topLayout);
        isAccessible(topLayout);
        hasComputers(topLayout);

        // --- bodyLayout ---
        linkButtonBuilder("A link", "https://www.google.com/", false, bodyLayout);
        linkButtonBuilder("Another link", "https://www.google.com/", false, bodyLayout);
        linkButtonBuilder("Google", "https://www.google.com/", true, bodyLayout);
        linkButtonBuilder("More links", "https://www.google.com/", false, bodyLayout);

    }
}
