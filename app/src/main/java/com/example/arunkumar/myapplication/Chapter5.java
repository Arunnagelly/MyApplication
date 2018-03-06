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

public class Chapter5 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{ "Sloka 1 :\nsannyāsaḿ karmaṇāḿ kṛṣṇa",
                "Sloka 2 :\nsannyāsaḥ karma-yogaś ca",
                "Sloka 3 :\njñeyaḥ sa nitya-sannyāsī",
                "Sloka 4 :\nsāńkhya-yogau pṛthag bālāḥ",
                "Sloka 5 :\nyat sāńkhyaiḥ prāpyate sthānaḿ",
                "Sloka 6 :\nsannyāsas tu mahā-bāho",
                "Sloka 7 :\nyoga-yukto viśuddhātmā",
                "Sloka 8 :\nnaiva kiñcit karomīti",
                "Sloka 9 :\npralapan visṛjan gṛhṇann",
                "Sloka 10 :\nbrahmaṇy ādhāya karmāṇi",
                "Sloka 11 :\nkāyena manasā buddhyā",
                "Sloka 12 :\nyuktaḥ karma-phalaḿ tyaktvā",
                "Sloka 13 :\nsarva-karmāṇi manasā",
                "Sloka 14 :\nna kartṛtvaḿ na karmāṇi",
                "Sloka 15 :\nnādatte kasyacit pāpaḿ",
                "Sloka 16 :\njñānena tu tad ajñānaḿ",
                "Sloka 17 :\ntad-buddhayas tad-ātmānas",
                "Sloka 18 :\nvidyā-vinaya-sampanne",
                "Sloka 19 :\nihaiva tair jitaḥ sargo",
                "Sloka 20 :\nna prahṛṣyet priyaḿ prāpya",
                "Sloka 21 :\nbāhya-sparśeṣv asaktātmā",
                "Sloka 22 :\nye hi saḿsparśa-jā bhogā",
                "Sloka 23 :\nśaknotīhaiva yaḥ soḍhuḿ",
                "Sloka 24 :\nyo \'ntaḥ-sukho \'ntar-ārāmas",
                "Sloka 25 :\nlabhante brahma-nirvāṇam",
                "Sloka 26 :\nkāma-krodha-vimuktānāḿ",
                "Sloka 27 :\nsparśān kṛtvā bahir bāhyāḿś",
                "Sloka 28 :\nyatendriya-mano-buddhir",
                "Sloka 29 :\nbhoktāraḿ yajña-tapasāḿ"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 5001,3);
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