package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTextView = (TextView)findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntent = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        TextView colorsTextView = (TextView)findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(getApplicationContext(),ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView familyTextView = (TextView)findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(getApplicationContext(),FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView phrasesTextView = (TextView)findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(getApplicationContext(),PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
