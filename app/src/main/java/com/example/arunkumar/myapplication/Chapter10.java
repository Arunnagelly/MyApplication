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

public class Chapter10 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nbhūya eva mahā-bāho",
                "Sloka 2 :\nna me viduḥ sura-gaṇāḥ",
                "Sloka 3 :\nyo mām ajam anādiḿ ca",
                "Sloka 4 :\nbuddhir jñānam asammohaḥ",
                "Sloka 5 :\nahiḿsā samatā tuṣṭis",
                "Sloka 6 :\nmaharṣayaḥ sapta pūrve",
                "Sloka 7 :\netāḿ vibhūtiḿ yogaḿ ca",
                "Sloka 8 :\nahaḿ sarvasya prabhavo",
                "Sloka 9 :\nmac-cittā mad-gata-prāṇā",
                "Sloka 10 :\nteṣāḿ satata-yuktānāḿ",
                "Sloka 11 :\nteṣām evānukampārtham",
                "Sloka 12 :\nparaḿ brahma paraḿ dhāma",
                "Sloka 13 :\nāhus tvām ṛṣayaḥ sarve",
                "Sloka 14 :\nsarvam etad ṛtaḿ manye",
                "Sloka 15 :\nsarvam etad ṛtaḿ manye",
                "Sloka 16 :\nvaktum arhasy aśeṣeṇa",
                "Sloka 17 :\nkathaḿ vidyām ahaḿ yogiḿs",
                "Sloka 18 :\nvistareṇātmano yogaḿ",
                "Sloka 19 :\nhanta te kathayiṣyāmi",
                "Sloka 20 :\naham ātmā guḍākeśa",
                "Sloka 21 :\nādityānām ahaḿ viṣṇur",
                "Sloka 22 :\nvedānāḿ sāma-vedo 'smi",
                "Sloka 23 :\nrudrāṇāḿ śańkaraś cāsmi",
                "Sloka 24 :\npurodhasāḿ ca mukhyaḿ māḿ",
                "Sloka 25 :\nmaharṣīṇāḿ bhṛgur ahaḿ",
                "Sloka 26 :\naśvatthaḥ sarva-vṛkṣāṇāḿ",
                "Sloka 27 :\nuccaiḥśravasam aśvānāḿ",
                "Sloka 28 :\nāyudhānām ahaḿ vajraḿ",
                "Sloka 29 :\nanantaś cāsmi nāgānāḿ",
                "Sloka 30 :\nprahlādaś cāsmi daityānāḿ",
                "Sloka 31 :\npavanaḥ pavatām asmi",
                "Sloka 32 :\nsargāṇām ādir antaś ca",
                "Sloka 33 :\nakṣarāṇām a-kāro \'smi",
                "Sloka 34 :\nmṛtyuḥ sarva-haraś cāham",
                "Sloka 35 :\nbṛhat-sāma tathā sāmnāḿ",
                "Sloka 36 :\ndyūtaḿ chalayatām asmi",
                "Sloka 37 :\nvṛṣṇīnāḿ vāsudevo \'smi",
                "Sloka 38 :\ndaṇḍo damayatām asmi",
                "Sloka 39 :\nyac cāpi sarva-bhūtānāḿ",
                "Sloka 40 :\nnānto \'sti mama divyānāḿ",
                "Sloka 41 :\nyad yad vibhūtimat sattvaḿ",
                "Sloka 42 :\natha vā bahunaitena"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 10001,3);
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
