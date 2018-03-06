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

public class Chapter13 extends AppCompatActivity {
    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nprakṛtiḿ puruṣaḿ caiva",
                "Sloka 2 :\nidaḿ śarīraḿ kaunteya",
                "Sloka 3 :\nkṣetra-jñaḿ cāpi māḿ viddhi",
                "Sloka 4 :\ntat kṣetraḿ yac ca yādṛk ca",
                "Sloka 5 :\nṛṣibhir bahudhā gītaḿ",
                "Sloka 6 :\nmahā-bhūtāny ahańkāro",
                "Sloka 7 :\nicchā dveṣaḥ sukhaḿ duḥkhaḿ",
                "Sloka 8 :\namānitvam adambhitvam",
                "Sloka 9 :\nindriyārtheṣu vairāgyam",
                "Sloka 10 :\nasaktir anabhiṣvańgaḥ",
                "Sloka 11 :\nmayi cānanya-yogena",
                "Sloka 12 :\nadhyātma-jñāna-nityatvaḿ",
                "Sloka 13 :\njñeyaḿ yat tat pravakṣyāmi",
                "Sloka 14 :\nsarvataḥ pāṇi-pādaḿ tat",
                "Sloka 15 :\nsarvendriya-guṇābhāsaḿ",
                "Sloka 16 :\nbahir antaś ca bhūtānām",
                "Sloka 17 :\navibhaktaḿ ca bhūteṣu",
                "Sloka 18 :\njyotiṣām api taj jyotis",
                "Sloka 19 :\niti kṣetraḿ tathā jñānaḿ",
                "Sloka 20 :\nprakṛtiḿ puruṣaḿ caiva",
                "Sloka 21 :\nkārya-kāraṇa-kartṛtve",
                "Sloka 22 :\npuruṣaḥ prakṛti-stho hi",
                "Sloka 23 :\nupadraṣṭānumantā ca",
                "Sloka 24 :\nya evaḿ vetti puruṣaḿ",
                "Sloka 25 :\ndhyānenātmani paśyanti",
                "Sloka 26 :\nanye tv evam ajānantaḥ",
                "Sloka 27 :\nyāvat sañjāyate kiñcit",
                "Sloka 28 :\nsamaḿ sarveṣu bhūteṣu",
                "Sloka 29 :\nsamaḿ paśyan hi sarvatra",
                "Sloka 30 :\nprakṛtyaiva ca karmāṇi",
                "Sloka 31 :\nyadā bhūta-pṛthag-bhāvam",
                "Sloka 32 :\nanāditvān nirguṇatvāt",
                "Sloka 33 :\nyathā sarva-gataḿ saukṣmyād",
                "Sloka 34 :\nyathā prakāśayaty ekaḥ",
                "Sloka 35 :\nkṣetra-kṣetrajñayor evam"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 13001,3);
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
