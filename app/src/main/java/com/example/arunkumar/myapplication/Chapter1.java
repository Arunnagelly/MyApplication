package com.example.arunkumar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter1 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data=new Sloka_data();
    Utility ut=new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\ndharma-kṣetre kuru-kṣetre", "Sloka 2 :\ndṛṣṭvā tu pāṇḍavānīkaḿ", "Sloka 3 :\npaśyaitāḿ pāṇḍu-putrāṇām", "Sloka 4 :\natra śūrā maheṣv-āsā",
                "Sloka 5 :\ndhṛṣṭaketuś cekitānaḥ", " Sloka 6 :\nyudhāmanyuś ca vikrānta", "Sloka 7 :\nasmākaḿ tu viśiṣṭā ye", "Sloka 8 :\nbhavān bhīṣmaś ca karṇaś ca",
                "Sloka 9 :\nanye ca bahavaḥ śūrā ", "Sloka 10 :\naparyāptaḿ tad asmākaḿ ", "Sloka 11 :\nayaneṣu ca sarveṣu", "Sloka 12 :\ntasya sañjanayan harṣaḿ",
                "Sloka 13 :\ntataḥ śańkhāś ca bheryaś ca", "Sloka 14 :\ntataḥ śvetair hayair yukte", "Sloka 15 :\npāñcajanyaḿ hṛṣīkeśo",
                "Sloka 16 :\nanantavijayaḿ rājā", " Sloka 17 :\nkāśyaś ca parameṣv-āsaḥ", "Sloka 18 :\ndrupado draupadeyāś ca", "Sloka 19 :\nsa ghoṣo dhārtarāṣṭrāṇāḿ", "Sloka 20 :\natha vyavasthitān dṛṣṭvā", "Sloka 21 :\nsenayor ubhayor madhye", "Sloka 22 :\nkair mayā saha yoddhavyam", "Sloka 23 :\nyotsyamānān avekṣe \\'haḿ", "Sloka 24 :\nevam ukto hṛṣīkeśo", "Sloka 25 :\nbhīṣma-droṇa-pramukhataḥ", "Sloka 26:\ntatrāpaśyat sthitān pārthaḥ", "Sloka 27 :\ntān samīkṣya sa kaunteyaḥ", "Sloka 28 :\ndṛṣṭvemaḿ sva-janaḿ kṛṣṇa", "Sloka 29 :\nvepathuś ca śarīre me", "Sloka 30 :\nna ca śaknomy avasthātuḿ", "Sloka 31 :\nna ca śreyo \\'nupaśyāmi"
                , "Sloka 32 :\nkiḿ no rājyena govinda", "Sloka 33 :\nta ime \\'vasthitā yuddhe", "Sloka 34 :\nmātulāḥ śvaśurāḥ pautrāḥ", "Sloka 35 :\napi trailokya-rājyasya", "Sloka 36 :\npāpam evāśrayed asmān", "Sloka 37 :\nyady apy ete na paśyanti", "Sloka 38 :\nkathaḿ na jñeyam asmābhiḥ","Sloka 39 :\nkathaḿ na jñeyam asmābhiḥ", "Sloka 40 :\nkula-kṣaye praṇaśyanti", "Sloka 41 :\nadharmābhibhavāt kṛṣṇa", "Sloka 42 :\nsańkaro narakāyaiva", "Sloka 43 :\ndoṣair etaiḥ kula-ghnānāḿ", "Sloka 44 :\nutsanna-kula-dharmāṇāḿ", "Sloka 45 :\naho bata mahat pāpaḿ", "Sloka 46 :\nyadi mām apratīkāram", "Sloka 47 :\nevam uktvārjunaḥ sańkhye"
                };
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i+1001,3);
                finish();


            }
        });
    }
    @Override
    public void onBackPressed ()
    {

        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


}
        
        






