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

public class Chapter8 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\narjuna uvāca",
                "Sloka 2 :\nadhiyajñaḥ kathaḿ ko \'tra",
                "Sloka 3 :\nśrī-bhagavān uvāca",
                "Sloka 4 :\nadhibhūtaḿ kṣaro bhāvaḥ",
                "Sloka 5 :\nanta-kāle ca mām eva",
                "Sloka 6 :\nyaḿ yaḿ vāpi smaran bhāvaḿ",
                "Sloka 7 :\ntasmāt sarveṣu kāleṣu",
                "Sloka 8 :\nabhyāsa-yoga-yuktena",
                "Sloka 9 :\nkaviḿ purāṇam anuśāsitāram",
                "Sloka 10 :\nprayāṇa-kāle manasācalena",
                "Sloka 11 :\nyad akṣaraḿ veda-vido vadanti",
                "Sloka 12 :\nsarva-dvārāṇi saḿyamya",
                "Sloka 13 :\noḿ ity ekākṣaraḿ brahma",
                "Sloka 14 :\nananya-cetāḥ satataḿ",
                "Sloka 15 :\nmām upetya punar janma",
                "Sloka 16 :\nā-brahma-bhuvanāl lokāḥ",
                "Sloka 17 :\nsahasra-yuga-paryantam",
                "Sloka 18 :\navyaktād vyaktayaḥ sarvāḥ",
                "Sloka 19 :\nbhūta-grāmaḥ sa evāyam",
                "Sloka 20 :\nparas tasmāt tu bhāvo \'nyo",
                "Sloka 21 :\navyakto 'kṣara ity uktas",
                "Sloka 22 :\npuruṣaḥ sa paraḥ pārtha",
                "Sloka 23 :\nyatra kāle tv anāvṛttim",
                "Sloka 24 :\nagnir jyotir ahaḥ śuklaḥ",
                "Sloka 25 :\ndhūmo rātris tathā kṛṣṇaḥ",
                "Sloka 26 :\nśukla-kṛṣṇe gatī hy ete",
                "Sloka 27 :\nnaite sṛtī pārtha jānan",
                "Sloka 28 :\nvedeṣu yajñeṣu tapaḥsu caiva"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 8001,3);
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
