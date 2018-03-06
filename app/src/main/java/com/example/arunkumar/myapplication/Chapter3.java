package com.example.arunkumar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter3 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{" Sloka 1 :\njyāyasī cet karmaṇas te",
                "Sloka 2 :\nvyāmiśreṇeva vākyena",
                "Sloka 3 :\nloke \'smin dvi-vidhā niṣṭhā",
                "Sloka 4 :\nna karmaṇām anārambhān",
                "Sloka 5 :\nna hi kaścit kṣaṇam api",
                "Sloka 6 :\nkarmendriyāṇi saḿyamya",
                "Sloka 7 :\nyas tv indriyāṇi manasā",
                "Sloka 8 :\nniyataḿ kuru karma tvaḿ",
                "Sloka 9 :\nyajñārthāt karmaṇo \'nyatra",
                "Sloka 10 :\naha-yajñāḥ prajāḥ sṛṣṭvā",
                "Sloka 11 :\ndevān bhāvayatānena",
                "Sloka 12 :\niṣṭān bhogān hi vo devā",
                "Sloka 13 :\nyajña-śiṣṭāśinaḥ santo",
                "Sloka 14 :\nannād bhavanti bhūtāni",
                "Sloka 15 :\nkarma brahmodbhavaḿ viddhi",
                "Sloka 16 :\nevaḿ pravartitaḿ cakraḿ",
                "Sloka 17 :\nyas tv ātma-ratir eva syād",
                "Sloka 18 :\nnaiva tasya kṛtenārtho",
                "Sloka 19 :\ntasmād asaktaḥ satataḿ",
                "Sloka 20 :\nkarmaṇaiva hi saḿsiddhim",
                "Sloka 21 :\nyad yad ācarati śreṣṭhas",
                "Sloka 22 :\nna me pārthāsti kartavyaḿ",
                "Sloka 23 :\nyadi hy ahaḿ na varteyaḿ",
                "Sloka 24 :\nutsīdeyur ime lokā",
                "Sloka 25 :\nsaktāḥ karmaṇy avidvāḿso",
                "Sloka 26 :\nna buddhi-bhedaḿ janayed",
                "Sloka 27 :\nprakṛteḥ kriyamāṇāni",
                "Sloka 28 :\ntattva-vit tu mahā-bāho",
                "Sloka 29 :\nprakṛter guṇa-sammūḍhāḥ",
                "Sloka 30 :\nmayi sarvāṇi karmāṇi",
                "Sloka 31 :\nye me matam idaḿ nityam",
                "Sloka 32 :\nye tv etad abhyasūyanto",
                "Sloka 33 :\nsadṛśaḿ ceṣṭate svasyāḥ",
                "Sloka 34 :\nindriyasyendriyasyārthe",
                "Sloka 35 :\nśreyān sva-dharmo viguṇaḥ",
                "Sloka 36 :\natha kena prayukto \'yaḿ",
                "Sloka 37 :\nkāma eṣa krodha eṣa",
                "Sloka 38 :\ndhūmenāvriyate vahnir",
                "Sloka 39 :\nāvṛtaḿ jñānam etena",
                "Sloka 40 :\nindriyāṇi mano buddhir",
                "Sloka 41 :\ntasmāt tvam indriyāṇy ādau",
                "Sloka 42 :\nindriyāṇi parāṇy āhur",
                "Sloka 43 :\nevaḿ buddheḥ paraḿ buddhvā"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 3001,3);
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
