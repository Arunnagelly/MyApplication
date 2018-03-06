package com.example.arunkumar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by LakshmiArun on 15-11-2017.
 */

public class Chapter12 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nevaḿ satata-yuktā ye",
                "Sloka 2 :\nmayy āveśya mano ye māḿ",
                "Sloka 3 :\nye tv akṣaram anirdeśyam",
                "Sloka 4 :\nsanniyamyendriya-grāmaḿ",
                "Sloka 5 :\nkleśo 'dhikataras teṣām",
                "Sloka 6 :\nye tu sarvāṇi karmāṇi",
                "Sloka 7 :\nteṣām ahaḿ samuddhartā",
                "Sloka 8 :\nmayy eva mana ādhatsva",
                "Sloka 9 :\natha cittaḿ samādhātuḿ",
                "Sloka 10 :\nabhyāse 'py asamartho 'si",
                "Sloka 11 :\nathaitad apy aśakto 'si",
                "Sloka 12 :\nśreyo hi jñānam abhyāsāj",
                "Sloka 13 :\nadveṣṭā sarva-bhūtānāḿ",
                "Sloka 14 :\nsantuṣṭaḥ satataḿ yogī",
                "Sloka 15 :\nyasmān nodvijate loko",
                "Sloka 16 :\nanapekṣaḥ śucir dakṣa",
                "Sloka 17 :\nyo na hṛṣyati na dveṣṭi",
                "Sloka 18 :\nsamaḥ śatrau ca mitre ca",
                "Sloka 19 :\ntulya-nindā-stutir maunī",
                "Sloka 20 :\nye tu dharmāmṛtam idaḿ"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 12001,3);
                finish();


            }
        });
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
