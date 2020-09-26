package com.example.learningmiwok;

public class  word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED =-1;

    private int mAudioResourceId;

    public word (String defaultTranslation, String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }
    public word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {return  mMiwokTranslation;}

    public int getmImageResourceId(){ return mImageResourceId;}


    public  boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
    public  int getmAudioResourceId(){return mAudioResourceId;}
}

