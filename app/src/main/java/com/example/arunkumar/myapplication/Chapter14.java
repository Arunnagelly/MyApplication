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

public class Chapter14 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nparaḿ bhūyaḥ pravakṣyāmi",
                "Sloka 2 :\nidaḿ jñānam upāśritya",
                "Sloka 3 :\nmama yonir mahad brahma",
                "Sloka 4 :\nsarva-yoniṣu kaunteya",
                "Sloka 5 :\nsattvaḿ rajas tama iti",
                "Sloka 6 :\ntatra sattvaḿ nirmalatvāt",
                "Sloka 7 :\nrajo rāgātmakaḿ viddhi",
                "Sloka 8 :\ntamas tv ajñāna-jaḿ viddhi",
                "Sloka 9 :\nsattvaḿ sukhe sañjayati",
                "Sloka 10 :\nrajas tamaś cābhibhūya",
                "Sloka 11 :\nsarva-dvāreṣu dehe \'smin",
                "Sloka 12 :\nlobhaḥ pravṛttir ārambhaḥ",
                "Sloka 13 :\naprakāśo \'pravṛttiś ca",
                "Sloka 14 :\nyadā sattve pravṛddhe tu",
                "Sloka 15 :\nyadā sattve pravṛddhe tu",
                "Sloka 16 :\nkarmaṇaḥ sukṛtasyāhuḥ",
                "Sloka 17 :\nsattvāt sañjāyate jñānaḿ",
                "Sloka 18 :\nūrdhvaḿ gacchanti sattva",
                "Sloka 19 :\nnānyaḿ guṇebhyaḥ kartāraḿ",
                "Sloka 20 :\nguṇān etān atītya trīn",
                "Sloka 21 :\nkair lińgais trīn guṇān etān",
                "Sloka 22 :\nprakāśaḿ ca pravṛttiḿ ca",
                "Sloka 23 :\nguṇair yo na vicālyate",
                "Sloka 24 :\nsama-duḥkha-sukhaḥ sva-sthah",
                "Sloka 25 :\nmānāpamānayos tulyas",
                "Sloka 26 :\nmāḿ ca yo 'vyabhicāreṇa",
                "Sloka 27 :\nbrahmaṇo hi pratiṣṭhāham"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 14001,3);
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
