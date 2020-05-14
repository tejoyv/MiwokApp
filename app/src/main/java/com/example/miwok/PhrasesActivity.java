package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word_Class> words = new ArrayList<Word_Class>();
        words.add(new Word_Class("Where are you going?","minto wuksus"));
        words.add(new Word_Class("What is your name?","tinnә oyaase'nә"));
        words.add(new Word_Class("My name is...","oyaaset..."));
        words.add(new Word_Class("How are you feeling?","michәksәs?"));
        words.add(new Word_Class("I’m feeling good.","kuchi achit"));
        words.add(new Word_Class("Are you coming?","әәnәs'aa?"));
        words.add(new Word_Class("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Word_Class("I’m coming.","әәnәm"));
        words.add(new Word_Class("Let’s go.","yoowutis"));
        words.add(new Word_Class("Come here.","әnni'nem"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
