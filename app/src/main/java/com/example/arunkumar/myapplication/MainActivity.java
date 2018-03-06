package com.example.arunkumar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import android.view.MenuInflater;
import android.view.MenuItem;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =  findViewById(R.id.adyaya_list);


        ArrayList<ChapterData> chapterData = new ArrayList<ChapterData>();

        chapterData.add(new ChapterData("Chapter 1", "Arjuna Visada Yoga", R.drawable.arjunavisada));
        chapterData.add(new ChapterData("Chapter 2", "Sankhya Yoga", R.drawable.sankyayoga));
        chapterData.add(new ChapterData("Chapter 3", "Karma Yoga", R.drawable.jnanayoga));
        chapterData.add(new ChapterData("Chapter 4", "Jnana Yoga", R.drawable.karmayoga));
        chapterData.add(new ChapterData("Chapter 5", "Karma Vairagya Yoga", R.drawable.arjunavisada));
      chapterData.add(new ChapterData("Chapter 6", "Abhyasa Yoga", R.drawable.sankyayoga));
        chapterData.add(new ChapterData("Chapter 7", "Paramahamsa Vijnana Yoga",R.drawable.karmayoga));
        chapterData.add(new ChapterData("Chapter 8", "Aksara-Parabrahman Yoga",R.drawable.jnanayoga));
        chapterData.add(new ChapterData("Chapter 9","Raja-Vidya-Guhya Yoga",R.drawable.sankyayoga));
        chapterData.add(new ChapterData("Chapter 10", "Vibhuti-Vistara-Yoga",R.drawable.arjunavisada));
        chapterData.add(new ChapterData("Chapter 11","Visvarupa-Darsana Yoga",R.drawable.karmayoga));
        chapterData.add(new ChapterData("Chapter 12", "Bhakti Yoga",R.drawable.jnanayoga));
        chapterData.add(new ChapterData("Chapter 13","Ksetra-Ksetrajna Vibhaga Yoga",R.drawable.sankyayoga));
        chapterData.add(new ChapterData("Chapter 14","Gunatraya-Vibhaga Yoga",R.drawable.karmayoga));
        chapterData.add(new ChapterData("Chapter 15", "Purusottama Yoga",R.drawable.sankyayoga));
        chapterData.add(new ChapterData("Chapter 16","Daivasura-Sampad-Vibhaga Yoga",R.drawable.arjunavisada));
        chapterData.add(new ChapterData("Chapter 17","Sraddhatraya-Vibhaga Yoga",R.drawable.jnanayoga));
        chapterData.add(new ChapterData("Chapter 18","Moksa-Opadesa Yoga",R.drawable.karmayoga));




        /*String[] items = new String[] {"Chapter 1 : Visada Yoga", "Chapter 2 : Sankhya Yoga", "Chapter 3 : Karma Yoga","Chapter 4 : Jnana Yoga",
        "Chapter 5 : Karma Vairagya Yoga"," Chapter 6 : Abhyasa Yoga","Chapter 7 : Paramahamsa Vijnana Yoga","Chapter 8 : Aksara-Parabrahman Yoga",
       "Chapter 9 : Raja-Vidya-Guhya Yoga","Chapter 10 : Vibhuti-Vistara-Yoga", "Chapter 11 : Visvarupa-Darsana Yoga","Chapter 12 : Bhakti Yoga",
                "Chapter 13 : Ksetra-Ksetrajna Vibhaga Yoga","Chapter 14 : Gunatraya-Vibhaga Yoga","Chapter 15 : Purusottama Yoga",
        "Chapter 16 : Daivasura-Sampad-Vibhaga Yoga"," Chapter 17 : Sraddhatraya-Vibhaga Yoga","Chapter 18 : Moksa-Opadesa Yoga"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
       listView.setAdapter(adapter);*/
        Mainpage_adapter mainpage_adapter = new Mainpage_adapter(this, chapterData);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(mainpage_adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent();
                if (i == 0) {
                    myIntent = new Intent(view.getContext(), Chapter1.class);
                    startActivity(myIntent);
                }
                if (i == 1) {
                    myIntent = new Intent(view.getContext(), Chapter2.class);
                    startActivity(myIntent);
                }
                if (i == 2) {
                    myIntent = new Intent(view.getContext(), Chapter3.class);
                    startActivity(myIntent);
                }
                if (i == 3) {
                    myIntent = new Intent(view.getContext(), Chapter4.class);
                    startActivity(myIntent);
                }
                if (i == 4) {
                    myIntent = new Intent(view.getContext(), Chapter5.class);
                    startActivity(myIntent);
                }
                if (i == 5) {
                    myIntent = new Intent(view.getContext(), Chapter6.class);
                    startActivity(myIntent);
                }
              if (i == 6) {
                    myIntent = new Intent(view.getContext(), Chapter7.class);
                    startActivity(myIntent);
                }
                if(i==7){
                    myIntent=new Intent(view.getContext(),Chapter8.class);
                    startActivity(myIntent);
                }
                if(i==8){
                    myIntent=new Intent(view.getContext(),Chapter9.class);
                    startActivity(myIntent);
                }
                if(i==9){
                    myIntent=new Intent(view.getContext(),Chapter10.class);
                    startActivity(myIntent);
                }
                if(i==10){
                    myIntent=new Intent(view.getContext(),Chapter11.class);
                    startActivity(myIntent);
                }
                if(i==11){
                    myIntent=new Intent(view.getContext(),Chapter12.class);
                    startActivity(myIntent);
                }
                if(i==12){
                    myIntent=new Intent(view.getContext(),Chapter13.class);
                    startActivity(myIntent);
                }
                if(i==13){
                    myIntent=new Intent(view.getContext(),Chapter14.class);
                    startActivity(myIntent);
                }
                if(i==14){
                    myIntent=new Intent(view.getContext(),Chapter15.class);
                    startActivity(myIntent);
                }
                if(i==15){
                    myIntent=new Intent(view.getContext(),Chapter16.class);
                    startActivity(myIntent);
                }
                if(i==16){
                    myIntent=new Intent(view.getContext(),Chapter17.class);
                    startActivity(myIntent);
                }
                if(i==17){
                    myIntent=new Intent(view.getContext(),Chapter18.class);
                    startActivity(myIntent);
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.about:
                Intent intent1 = new Intent(this,AboutActivity.class);
                this.startActivity(intent1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
