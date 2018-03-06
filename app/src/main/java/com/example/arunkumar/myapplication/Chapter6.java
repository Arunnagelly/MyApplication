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

public class Chapter6 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{ "Sloka 1 :\nanāśritaḥ karma-phalaḿ",
                "Sloka 2 :\nyaḿ sannyāsam iti prāhur",
                "Sloka 3 :\nārurukṣor muner yogaḿ",
                "Sloka 4 :\nyadā hi nendriyārtheṣu",
                "Sloka 5 :\nuddhared ātmanātmānaḿ",
                "Sloka 6 :\nbandhur ātmātmanas tasya",
                "Sloka 7 :\njitātmanaḥ praśāntasya",
                "Sloka 8 :\njñāna-vijñāna-tṛptātmā",
                "Sloka 9 :\nsuhṛn-mitrāry-udāsīna",
                "Sloka 10 :\nyogī yuñjīta satatam ",
                "Sloka 11 :\nśucau deśe pratiṣṭhāpya",
                "Sloka 12 :\ntatraikāgraḿ manaḥ kṛtvā",
                "Sloka 13 :\namaḿ kāya-śiro-grīvaḿ",
                "Sloka 14 :\npraśāntātmā vigata-bhīr",
                "Sloka 15 :\nyuñjann evaḿ sadātmānaḿ",
                "Sloka 16 :\nnāty-aśnatas \'tu yogo \'sti",
                "Sloka 17 :\nyuktāhāra-vihārasya",
                "Sloka 18 :\nyadā viniyataḿ cittam",
                "Sloka 19 :\nyathā dīpo nivāta-stho",
                "Sloka 20 :\nyatroparamate cittaḿ",
                "Sloka 21 :\nsukham ātyantikaḿ yat tad",
                "Sloka 22 :\nyaḿ labdhvā cāparaḿ lābhaḿ",
                "Sloka 23 :\ntaḿ vidyād duḥkha-saḿyoga",
                "Sloka 24 :\nsańkalpa-prabhavān kāmāḿs",
                "Sloka 25 :\nśanaiḥ śanair uparamed",
                "Sloka 26 :\nyato yato niścalati",
                "Sloka 27 :\npraśānta-manasaḿ hy enaḿ",
                "Sloka 28 :\nyuñjann evaḿ sadātmānaḿ",
                "Sloka 29 :\nsarva-bhūta-stham ātmānaḿ",
                "Sloka 30 :\nyo māḿ paśyati sarvatra",
                "Sloka 31 :\nsarva-bhūta-sthitaḿ yo māḿ",
                "Sloka 32 :\nātmaupamyena sarvatra",
                "Sloka 33 :\nyo \'yaḿ yogas tvayā proktaḥ",
                "Sloka 34 :\ncañcalaḿ hi manaḥ kṛṣṇa",
                "Sloka 35 :\nasaḿśayaḿ mahā-bāho",
                "Sloka 36 :\nasaḿyatātmanā yogo",
                "Sloka 37 :\nayatiḥ śraddhayopeto",
                "Sloka 38 :\nkaccin nobhaya-vibhraṣṭaś",
                "Sloka 39 :\netan me saḿśayaḿ kṛṣṇa",
                "Sloka 40 :\npārtha naiveha nāmutra",
                "Sloka 41 :\nprāpya puṇya-kṛtāḿ lokān",
                "Sloka 42 :\natha vā yoginām eva",
                "Sloka 43 :\ntatra taḿ buddhi-saḿyogaḿ",
                "Sloka 44 :\npūrvābhyāsena tenaiva",
                "Sloka 45 :\nprayatnād yatamānas tu",
                "Sloka 46 :\ntapasvibhyo \'dhiko yogī",
                "Sloka 47 :\nyoginām api sarveṣāḿ"
                };
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 6001,3);
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