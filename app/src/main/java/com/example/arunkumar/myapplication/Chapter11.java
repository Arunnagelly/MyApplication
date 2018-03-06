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

public class Chapter11 extends AppCompatActivity {
    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{ "Sloka 1 :\nmad-anugrahāya paramaḿ",
                "Sloka 2 :\nbhavāpyayau hi bhūtānāḿ",
                "Sloka 3 :\nevam etad yathāttha tvam",
                "Sloka 4 :\nmanyase yadi tac chakyaḿ",
                "Sloka 5 :\npaśya me pārtha rūpāṇi",
                "Sloka 6 :\npaśyādityān vasūn rudrān",
                "Sloka 7 :\nihaika-sthaḿ jagat kṛtsnaḿ",
                "Sloka 8 :\nna tu māḿ śakyase draṣṭum",
                "Sloka 9 :\nevam uktvā tato rājan gi",
                "Sloka 10 :\naneka-vaktra-nayanam",
                "Sloka 11 :\ndivya-mālyāmbara-dharaḿ",
                "Sloka 12 :\ndivi sūrya-sahasrasya",
                "Sloka 13 :\ntatraika-sthaḿ jagat kṛtsnaḿ",
                "Sloka 14 :\ntataḥ sa vismayāviṣṭo",
                "Sloka 15 :\npaśyāmi devāḿs tava deva",
                "Sloka 16 :\naneka-bāhūdara-vaktra-netraḿ",
                "Sloka 17 :\nkirīṭinaḿ gadinaḿ cakriṇaḿ",
                "Sloka 18 :\ntvam akṣaraḿ paramaḿ ",
                "Sloka 19 :\nanādi-madhyāntam ananta",
                "Sloka 20 :\ndyāv ā-pṛthivyor idam",
                "Sloka 21 :\namī hi tvāḿ sura-sańghā ",
                "Sloka 22 :\nrudrādityā vasavo ye ca",
                "Sloka 23 :\nrūpaḿ mahat te bahu-vaktra",
                "Sloka 24 :\nnabhaḥ-spṛśaḿ dīptam aneka",
                "Sloka 25 :\ndaḿṣṭrā-karālāni ca te",
                "Sloka 26 :\namī ca tvāḿ dhṛtarāṣṭrasya",
                "Sloka 27 :\nvaktrāṇi te tvaramāṇā",
                "Sloka 28 :\nyathā nadīnāḿ bahavo",
                "Sloka 29 :\nyathā pradīptaḿ jvalanaḿ",
                "Sloka 30 :\nlelihyase grasamānaḥ",
                "Sloka 31 :\nākhyāhi me ko bhavān ",
                "Sloka 32 :\nkālo 'smi loka-kṣaya-kṛt",
                "Sloka 33 :\ntasmāt tvam uttiṣṭha yaśo",
                "Sloka 34 :\ndroṇaḿ ca bhīṣmaḿ ca" ,
                "Sloka 35 :\netac chrutvā vacanaḿ",
                "Sloka 36 :\nsthāne hṛṣīkeśa tava",
                "Sloka 37 :\nkasmāc ca te na nameran",
                "Sloka 38 :\ntvam ādi-devaḥ puruṣaḥ",
                "Sloka 39 :\nvāyur yamo 'gnir varuṇaḥ",
                "Sloka 40 :\nnamaḥ purastād atha ",
                "Sloka 41 :\nsakheti matvā prasabhaḿ",
                "Sloka 42 :\nyac cāvahāsārtham asat",
                "Sloka 43 :\npitāsi lokasya carācarasya",
                "Sloka 44 :\ntasmāt praṇamya praṇidhāya",
                "Sloka 45 :\nadṛṣṭa-pūrvaḿ hṛṣito 'smi",
                "Sloka 46 :\nkirīṭinaḿ gadinaḿ cakra",
                "Sloka 47 :\nmayā prasannena tavārjunedaḿ",
                "Sloka 48 :\nna veda-yajñādhyayanair na",
                "Sloka 49 :\nmā te vyathā mā ca vimūḍha",
                "Sloka 49 :\nity arjunaḿ vāsudevas",
                "Sloka 50 :\nity arjunaḿ vāsudevas",
                "Sloka 51 :\ndṛṣṭvedaḿ mānuṣaḿ rūpaḿ",
                "Sloka 52 :\nsu-durdarśam idaḿ rūpaḿ",
                "Sloka 53 :\nnāhaḿ vedair na tapasā",
                "Sloka 54 :\nbhaktyā tv ananyayā śakya",
                "Sloka 55 :\nmat-karma-kṛn mat-paramo"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 11001,3);
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
