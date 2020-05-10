package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("one","lutti"));
        words.add(new Word_Class("two","ottiko"));
        words.add(new Word_Class("three","tolookosu"));
        words.add(new Word_Class("four","oyyisa"));
        words.add(new Word_Class("five","massokka"));
        words.add(new Word_Class("six","temmokka"));
        words.add(new Word_Class("seven","kenekaku"));
        words.add(new Word_Class("eight","kawinta"));
        words.add(new Word_Class("nine","wo'e"));
        words.add(new Word_Class("ten","na'aacha"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
