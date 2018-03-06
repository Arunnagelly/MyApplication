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

public class Chapter9 extends AppCompatActivity {
    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nśrī-bhagavān uvāca",
                "Sloka 2 :\nrāja-vidyā rāja-guhyaḿ",
                "Sloka 3 :\naśraddadhānāḥ puruṣā",
                "Sloka 4 :\nmayā tatam idaḿ sarvaḿ",
                "Sloka 5 :\nna ca mat-sthāni bhūtāni",
                "Sloka 6 :\nyathākāśa-sthito nityaḿ",
                "Sloka 7 :\nsarva-bhūtāni kaunteya",
                "Sloka 8 :\nprakṛtiḿ svām avaṣṭabhya",
                "Sloka 9 :\nna ca māḿ tāni karmāṇi",
                "Sloka 10 :\nmayādhyakṣeṇa prakṛtiḥ",
                "Sloka 11 :\navajānanti māḿ mūḍhā",
                "Sloka 12 :\nmoghāśā mogha-karmāṇo",
                "Sloka 13 :\nmahātmānas tu māḿ pārtha",
                "Sloka 14 :\nsatataḿ kīrtayanto māḿ",
                "Sloka 15 :\njñāna-yajñena cāpy anye",
                "Sloka 16 :\nahaḿ kratur ahaḿ yajñaḥ",
                "Sloka 17 :\npitāham asya jagato",
                "Sloka 18 :\ngatir bhartā prabhuḥ sākṣī",
                "Sloka 19 :\ntapāmy aham ahaḿ varṣaḿ",
                "Sloka 20 :\ntrai-vidyā māḿ soma-pāḥ",
                "Sloka 21 :\nte taḿ bhuktvā svarga",
                "Sloka 22 :\nananyāś cintayanto māḿ",
                "Sloka 23 :\nye 'py anya-devatā-bhaktā",
                "Sloka 24 :\nahaḿ hi sarva-yajñānāḿ",
                "Sloka 25 :\nyānti deva-vratā devān",
                "Sloka 26 :\ń́́́patraḿ puṣpaḿ phalaḿ toyaḿ",
                "Sloka 27 :\nyat karoṣi yad aśnāsi",
                "Sloka 28 :\nśubhāśubha-phalair evaḿ",
                "Sloka 29 :\nsamo 'haḿ sarva-bhūteṣu",
                "Sloka 30 :\napi cet su-durācāro",
                "Sloka 31 :\nkṣipraḿ bhavati dharmātmā",
                "Sloka 32 :\nmāḿ hi pārtha vyapāśritya",
                "Sloka 33 :\nkiḿ punar brāhmaṇāḥ puṇyā",
                "Sloka 34 :\nman-manā bhava mad-bhakto"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 9001,3);
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
