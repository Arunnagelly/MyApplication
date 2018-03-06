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

public class Chapter15 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nūrdhva-mūlam adhaḥ-śākham",
        "Sloka 2 :\nadhaś cordhvaḿ prasṛtās tasya",
                "Sloka 3 :\nna rūpam asyeha tathopalabhyate",
                "Sloka 4 :\ntataḥ padaḿ tat parimārgitavyaḿ",
                "Sloka 5 :\nnirmāna-mohā jita-sańga",
                "Sloka 6 :\nna tad bhāsayate sūryo",
                "Sloka 7 :\nmamaivāḿśo jīva-loke",
                "Sloka 8 :\nśarīraḿ yad avāpnoti",
                "Sloka 9 :\nśrotraḿ cakṣuḥ sparśanaḿ ca",
                "Sloka 10 :\nutkrāmantaḿ sthitaḿ vāpi",
                "Sloka 11 :\nyatanto yoginaś cainaḿ",
                "Sloka 12 :\nyad āditya-gataḿ tejo",
                "Sloka 13 :\ngām āviśya ca bhūtāni",
                "Sloka 14 :\nahaḿ vaiśvānaro bhūtvā",
                "Sloka 15 :\nsarvasya cāhaḿ hṛdi",
                "Sloka 16 :\ndvāv imau puruṣau loke",
                "Sloka 17 :\nuttamaḥ puruṣas tv anyaḥ",
                "Sloka 18 :\nyasmāt kṣaram atīto 'ham",
                "Sloka 19 :\nyo mām evam asammūḍho",
                "Sloka 20 :\niti guhyatamaḿ śāstram"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 15001,3);
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
