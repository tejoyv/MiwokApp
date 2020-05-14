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
        words.add(new Word_Class("father","әpә",R.drawable.family_father));
        words.add(new Word_Class("mother","әṭa",R.drawable.family_mother));
        words.add(new Word_Class("son","angsi",R.drawable.family_son));
        words.add(new Word_Class("daughter","tune",R.drawable.family_daughter));
        words.add(new Word_Class("older brother","taachi",R.drawable.family_older_brother));
        words.add(new Word_Class("younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new Word_Class("older sister","teṭe",R.drawable.family_older_sister));
        words.add(new Word_Class("younger sister","kolliti",R.drawable.family_younger_sister));
        words.add(new Word_Class("grandmother","ama",R.drawable.family_grandmother));
        words.add(new Word_Class("grandfather","paapa",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
