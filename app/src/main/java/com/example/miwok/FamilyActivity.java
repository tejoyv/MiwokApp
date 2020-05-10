package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word_Class> words=new ArrayList<Word_Class>();
        words.add(new Word_Class("father","әpә"));
        words.add(new Word_Class("mother","әṭa"));
        words.add(new Word_Class("son","angsi"));
        words.add(new Word_Class("daughter","tune"));
        words.add(new Word_Class("older brother","taachi"));
        words.add(new Word_Class("younger brother","chalitti"));
        words.add(new Word_Class("older sister","teṭe"));
        words.add(new Word_Class("younger sister","kolliti"));
        words.add(new Word_Class("grandmother","ama"));
        words.add(new Word_Class("grandfather","paapa"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
