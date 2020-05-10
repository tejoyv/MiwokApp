package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("red","weṭeṭṭi"));
        words.add(new Word_Class("green","chokokki"));
        words.add(new Word_Class("brown","ṭakaakki"));
        words.add(new Word_Class("gray","ṭopoppi"));
        words.add(new Word_Class("black","kululli"));
        words.add(new Word_Class("white","kelelli"));
        words.add(new Word_Class("dusty yellow","ṭopiisә"));
        words.add(new Word_Class("mustard yellow","chiwiiṭә"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
