package com.example.arunkumar.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LakshmiArun on 15-11-2017.
 */

public class Sloka_data implements Parcelable  {
        // Member variables
        private int slokaNum;
        private String eslokaText;
        private String sslokaText;
        private int gAudioResourceIdWbw;
        private int getgAudioResourceId;
        private int check;

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public int getSlokaNum() {
        return slokaNum;
    }

    public String getEslokaText() {
        return eslokaText;
    }

    public String getSslokaText() {
        return sslokaText;
    }

    public int getgAudioResourceIdWbw() {
        return gAudioResourceIdWbw;
    }

    public int getGetgAudioResourceId() {
        return getgAudioResourceId;
    }

    Sloka_data(){}
    Sloka_data(int slokaNum,String eslokaText,String sslokaText, int gAudioResourceIdWbw, int getgAudioResourceId,int check)
        {
            this.slokaNum=slokaNum;
            this.eslokaText=eslokaText;
            this.sslokaText=sslokaText;
            this.gAudioResourceIdWbw=gAudioResourceIdWbw;
            this.getgAudioResourceId=getgAudioResourceId;
            this.check=check;

        }

        // In constructor you will read the variables from Parcel.
        // Make sure to read them in the same sequence in which you have written them in Parcel.
        public Sloka_data(Parcel in) {
            slokaNum=in.readInt();
            eslokaText = in.readString();
            sslokaText = in.readString();
            gAudioResourceIdWbw = in.readInt();
            getgAudioResourceId=in.readInt();
            check=in.readInt();
        }

    @Override
    public int describeContents() {
        return 0;
    }

    // This is where you will write your member variables in Parcel. Here you can write in any order. It is not necessary to write all members in Parcel.
        @Override
        public void writeToParcel(Parcel dest, int flags) {
// Write data in any order
            dest.writeInt(slokaNum);
            dest.writeString(eslokaText);
            dest.writeString(sslokaText);
            dest.writeInt(gAudioResourceIdWbw);
            dest.writeInt(getgAudioResourceId);
            dest.writeInt(check);
        }
        // This is to de-serialize the object
        public static final Creator<Sloka_data> CREATOR = new Creator<Sloka_data>(){
            public Sloka_data createFromParcel(Parcel in) {
                return new Sloka_data(in);
            }

            public Sloka_data[] newArray(int size) {
                return new Sloka_data[size];
            }
        };
    }

