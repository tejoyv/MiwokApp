package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word_Class> words=new ArrayList<Word_Class>();
        words.add(new Word_Class("father","әpә",R.drawable.family_father,R.raw.family_father));
        words.add(new Word_Class("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word_Class("son","angsi",R.drawable.family_son,R.raw.family_son));
        words.add(new Word_Class("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word_Class("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word_Class("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word_Class("older sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word_Class("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word_Class("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word_Class("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word_Class word_class=words.get(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word_class.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
