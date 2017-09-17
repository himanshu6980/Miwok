
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view that shows number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //set a click listner on view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open numbers activity
                Intent numbersintent = new Intent(MainActivity.this, NumbersActivity.class);
                //start new activity
                startActivity(numbersintent);
            }
        });

        //find the view that shows family category
        TextView family = (TextView) findViewById(R.id.family);
        //set a click listner on view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open family activity
                Intent familysintent = new Intent(MainActivity.this, FamilyActivity.class);
                //start new activity
                startActivity(familysintent);
            }
        });

        //find the view that shows phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //set a click listner on view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open phrases activity
                Intent phrasesintent = new Intent(MainActivity.this, PhrasesActivity.class);
                //start new activity
                startActivity(phrasesintent);
            }
        });

        //find the view that shows colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //set a click listner on view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open colors activity
                Intent colorsintent = new Intent(MainActivity.this, ColorsActivity.class);
                //start new activity
                startActivity(colorsintent);
            }
        });

    }


    public void openNumbersList(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }


}
