package com.example.robin.buildingtrial3;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppActivityBuilderMethods {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- Toolbar stuff, don't forget to set the name ---
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("X Building");
        setSupportActionBar(toolbar);

        // --- Gotta put these in the onCreate method ---
        LinearLayout topLayout = (LinearLayout) findViewById(R.id.topLayout);
        LinearLayout bodyLayout = (LinearLayout) findViewById(R.id.bodyLayout);



        String trialString = "Leverage agile frameworks to provide a robust synopsis for high level overviews. " +
                "Iterative approaches to corporate strategy foster collaborative thinking to further the overall value proposition. " +
                "Organically grow the holistic world view of disruptive innovation via workplace diversity and empowerment.";

        // --- topLayout ---
        titleBuilder("X Building", topLayout);
        hasAllGendersBathroom(topLayout);
        isAccessible(topLayout);
        hasHelp(topLayout);
        hasComputers(topLayout);

        // --- bodyLayout ---
        activityButtonBuilder("Hello", MainActivity.this, Trial.class, false, bodyLayout);
        textViewBuilder(trialString, bodyLayout);
        linkButtonBuilder("Google", "https://www.google.com/", false, bodyLayout);
        activityButtonBuilder("Hello", MainActivity.this, Trial.class, false, bodyLayout);
        phoneBuilder("Null Number", "0000000000", bodyLayout);
        activityButtonBuilder("This is another", MainActivity.this, Trial.class, true, bodyLayout);
        activityButtonBuilder("Forward button", MainActivity.this, Trial.class, false, bodyLayout);
        activityButtonBuilder("Different Text", MainActivity.this, Trial.class, false, bodyLayout);
        activityButtonBuilder("Can go in here", MainActivity.this, Trial.class, false, bodyLayout);
        activityButtonBuilder("Hello", MainActivity.this, Trial.class, true, bodyLayout);
        activityButtonBuilder("Hello", MainActivity.this, Trial.class, true, bodyLayout);
        activityButtonBuilder("Hello", MainActivity.this, Trial.class, false, bodyLayout);


    }


}
