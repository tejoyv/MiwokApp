package com.example.miwok;

public class Word_Class {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //constructor
    public Word_Class(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    //getter methods
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}
