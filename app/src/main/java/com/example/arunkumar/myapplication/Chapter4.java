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

public class Chapter4 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{ "Sloka 1 :\nimaḿ vivasvate yogaḿ",
                "Sloka 2 :\nevaà paramparä-präptam",
                "Sloka 3 :\nsa evāyaḿ mayā te \'dya",
                "Sloka 4 :\naparaḿ bhavato janma",
                "Sloka 5 :\nbahūni me vyatītāni",
                "Sloka 6 :\najo \'pi sann avyayātmā",
                "Sloka 7 :\nyadā yadā hi dharmasya",
                "Sloka 8 :\nparitrāṇāya sādhūnāḿ",
                "Sloka 9 :\njanma karma ca me divyam ",
                "Sloka 10 :\nvīta-rāga-bhaya-krodhā ",
                "Sloka 11 :\nye yathā māḿ prapadyante",
                "Sloka 12 :\nkāńkṣantaḥ karmaṇāḿ siddhiḿ",
                "Sloka 13 :\ncātur-varṇyaḿ mayā sṛṣṭaḿ",
                "Sloka 14 :\nna māḿ karmāṇi limpanti",
                "Sloka 15 :\nevaḿ jñātvā kṛtaḿ karma",
                "Sloka 16 :\nkiḿ karma kim akarmeti",
                "Sloka 17 :\nkarmaṇo hy api boddhavyaḿ",
                "Sloka 18 :\nkarmaṇy akarma yaḥ paśyed",
                "Sloka 19 :\nyasya sarve samārambhāḥ",
                "Sloka 20 :\ntyaktvā karma-phalāsańgaḿ",
                "Sloka 21 :\nnirāśīr yata-cittātmā",
                "Sloka 22 :\nyadṛcchā-lābha-santuṣṭo",
                "Sloka 23 :\ngata-sańgasya muktasya",
                "Sloka 24 :\nbrahmārpaṇaḿ brahma havir",
                "Sloka 25 :\ndaivam evāpare yajñaḿ",
                "Sloka 26 :\nśrotrādīnīndriyāṇy anye",
                "Sloka 27 :\nsarvāṇīndriya-karmāṇi",
                "Sloka 28 :\ndravya-yajñās tapo-yajñā",
                "Sloka 29 :\napāne juhvati prāṇaḿ",
                "Sloka 30 :\nsarve \'py ete yajña-vido",
                "Sloka 31 :\nnāyaḿ loko \'sty ayajñasya",
                "Sloka 32 :\nevaḿ bahu-vidhā yajñā",
                "Sloka 33 :\nśreyān dravya-mayād yajñāj",
                "Sloka 34 :\ntad viddhi praṇipātena",
                "Sloka 35 :\nyaj jñātvā na punar moham",
                "Sloka 36 :\napi ced asi pāpebhyaḥ",
                "Sloka 37 :\nyathaidhāḿsi samiddho \'gnir",
                "Sloka 38 :\nna hi jñānena sadṛśaḿ",
                "Sloka 39 :\nśraddhāvāl labhate jñānaḿ",
                "Sloka 40 :\najñaś cāśraddadhānaś ca",
                "Sloka 41 :\nyoga-sannyasta-karmāṇaḿ",
                "Sloka 42 :\ntasmād ajñāna-sambhūtaḿ"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 4001,3);
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
