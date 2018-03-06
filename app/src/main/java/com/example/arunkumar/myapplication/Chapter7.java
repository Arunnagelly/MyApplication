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

public class Chapter7 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nmayy āsakta-manāḥ pārtha",
                "Sloka 2 :\njñānaḿ te 'haḿ sa-vijñānam",
                "Sloka 3 :\nmanushyanam sahasreshu",
                "Sloka 4 :\nbhūmir āpo 'nalo vāyuḥ",
                "Sloka 5 :\napareyam itas tv anyām\n",
                "Sloka 6 :\netad-yonīni bhūtāni",
                "Sloka 7 :\nmattaḥ parataraḿ nānyat",
                "Sloka 8 :\nraso 'ham apsu kaunteya",
                "Sloka 9 :\npuṇyo gandhaḥ pṛthivyāḿ",
                "Sloka 10 :\nbījaḿ māḿ sarva-bhūtānāḿn ",
                "Sloka 11 :\nbalaḿ balavatāḿ cāhaḿ",
                "Sloka 12 :\nye caiva sāttvikā bhāvān",
                "Sloka 13 :\ntribhir guṇa-mayair bhāvair",
                "Sloka 14 :\ndaivī hy eṣā guṇa-mayī",
                "Sloka 15 :\nna māḿ duṣkṛtino mūḍhāḥ",
                "Sloka 16 :\ncatur-vidhā bhajante māḿ",
                "Sloka 17 :\nteṣāḿ jñānī nitya-yukta",
                "Sloka 18 :\nudārāḥ sarva evaite",
                "Sloka 19 :\nbahūnāḿ janmanām ante",
                "Sloka 20 :\nkāmais tais tair hṛta-jñānāḥ",
                "Sloka 21 :\nyo yo yāḿ yāḿ tanuḿ bhaktaḥ",
                "Sloka 22 :\nsa tayā śraddhayā yuktas",
                "Sloka 23 :\nantavat tu phalaḿ teṣāḿ",
                "Sloka 24 :\navyaktaḿ vyaktim āpannaḿ",
                "Sloka 25 :\nnāhaḿ prakāśaḥ sarvasya",
                "Sloka 26 :\nnāhaḿ prakāśaḥ sarvasya",
                "Sloka 27 :\nicchā-dveṣa-samutthena",
                "Sloka 28 :\nyeṣāḿ tv anta-gataḿ pāpaḿ",
                "Sloka 29 :\njarā-maraṇa-mokṣāya",
                "Sloka 30 :\nsādhibhūtādhidaivaḿ māḿ"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 7001,3);
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