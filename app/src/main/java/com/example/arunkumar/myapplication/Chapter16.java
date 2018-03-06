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

public class Chapter16 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nabhayaḿ sattva-saḿśuddhir",
                "Sloka 2 :\nahiḿsā satyam akrodhas",
                "Sloka 3 :\ntejaḥ kṣamā dhṛtiḥ śaucam",
                "Sloka 4 :\ndambho darpo 'bhimānaś ca",
                "Sloka 5 :\ndaivī sampad vimokṣāya",
                "Sloka 6 :\ndvau bhūta-sargau loke ",
                "Sloka 7 :\npravṛttiḿ ca nivṛttiḿ ca",
                "Sloka 8 :\nasatyam apratiṣṭhaḿ te",
                "Sloka 9 :\netāḿ dṛṣṭim avaṣṭabhya",
                "Sloka 10 :\nkāmam āśritya duṣpūraḿ",
                "Sloka 11 :\ncintām aparimeyāḿ ca",
                "Sloka 12 :\nāśā-pāśa-śatair baddhāḥ",
                "Sloka 13 :\nidam adya mayā labdham",
                "Sloka 14 :\nasau mayā hataḥ śatru",
                "Sloka 15 :\nāḍhyo 'bhijanavān asmi",
                "Sloka 16 :\naneka-citta-vibhrāntā",
                "Sloka 17 :\nātma-sambhāvitāḥ stabdhā",
                "Sloka 18 :\nahańkāraḿ balaḿ darpaḿ",
                "Sloka 19 :\ntān ahaḿ dviṣataḥ krūrān",
                "Sloka 20 :\nāsurīḿ yonim āpannā",
                "Sloka 21 :\ntri-vidhaḿ narakasyedaḿ",
                "Sloka 22 :\netair vimuktaḥ kaunteya",
                "Sloka 23 :\nyaḥ śāstra-vidhim utsṛjya",
                "Sloka 24 :\ntasmāc chāstraḿ pramāṇaḿ te"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 16001,3);
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
