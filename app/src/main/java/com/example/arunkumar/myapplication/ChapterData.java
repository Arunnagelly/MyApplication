package com.example.arunkumar.myapplication;

/**
 * Created by LakshmiArun on 19-11-2017.
 */

public class ChapterData {

    private String chapter;
    private String chapterName;
    private int imageResourceId;

    public ChapterData(String ch,String cN,int no)
    {
        chapter=ch;
        chapterName=cN;
        imageResourceId=no;
    }

    public String getChapter() {
        return chapter;
    }

    public String getChapterName() {
        return chapterName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
