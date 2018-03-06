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

public class Chapter17 extends AppCompatActivity {
    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nye śāstra-vidhim utsṛjya",
                "Sloka 2 :\ntri-vidhā bhavati śraddhā",
                "Sloka 3 :\nsattvānurūpā sarvasya",
                "Sloka 4 :\nsattvānurūpā sarvasya",
                "Sloka 5 :\naśāstra-vihitaḿ ghoraḿ",
                "Sloka 6 :\nkarṣayantaḥ śarīra-sthaḿ",
                "Sloka 7 :\nāhāras tv api sarvasya",
                "Sloka 8 :\nāyuḥ-sattva-balārogya",
                "Sloka 9 :\nkaṭv-amla-lavaṇāty-uṣṇa",
                "Sloka 10 :\nyāta-yāmaḿ gata-rasaḿ",
                "Sloka 11 :\naphalākāńkṣibhir yajño",
                "Sloka 12 :\nabhisandhāya tu phalaḿ",
                "Sloka 13 :\nvidhi-hīnam asṛṣṭānnaḿ",
                "Sloka 14 :\ndeva-dvija-guru-prājña",
                "Sloka 15 :\nanudvega-karaḿ vākyaḿ",
                "Sloka 16 :\nmanaḥ-prasādaḥ saumyatvaḿ",
                "Sloka 17 :\nśraddhayā parayā taptaḿ",
                "Sloka 18 :\nsatkāra-māna-pūjārthaḿ",
                "Sloka 19 :\nmūḍha-grāheṇātmano yat",
                "Sloka 20 :\ndātavyam iti yad dānaḿ",
                "Sloka 21 :\nyat tu pratyupakārārthaḿ",
                "Sloka 22 :\nadeśa-kāle yad dānam",
                "Sloka 23 :\noḿ tat sad iti nirdeśo",
                "Sloka 24 :\ntasmād oḿ ity udāhṛtya",
                "Sloka 25 :\ntad ity anabhisandhāya",
                "Sloka 26 :\nsad-bhāve sādhu-bhāve ca",
                "Sloka 27 :\nyajñe tapasi dāne ca",
                "Sloka 28 :\naśraddhayā hutaḿ dattaḿ"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 17001,3);
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
