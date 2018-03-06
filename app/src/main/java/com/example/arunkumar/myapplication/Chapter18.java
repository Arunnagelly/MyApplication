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

public class Chapter18 extends AppCompatActivity {
    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\nsannyāsasya mahā-bāho",
                "Sloka 2 :\nkāmyānāḿ karmaṇāḿ nyāsa",
                "Sloka 3 :\ntyājyaḿ doṣa-vad ity eke",
                "Sloka 4 :\nniścayaḿ śṛṇu me tatra",
                "Sloka 5 :\nyajña-dāna-tapaḥ-karma",
                "Sloka 6 :\netāny api tu karmāṇi",
                "Sloka 7 :\nniyatasya tu sannyāsaḥ",
                "Sloka 8 :\nduḥkham ity eva yat karma",
                "Sloka 9 :\nkāryam ity eva yat karma",
                "Sloka 10 :\nna dveṣṭy akuśalaḿ karma",
                "Sloka 11 :\nna hi deha-bhṛtā śakyaḿ",
                "Sloka 12 :\naniṣṭam iṣṭaḿ miśraḿ ca",
                "Sloka 13 :\npañcaitāni mahā-bāho",
                "Sloka 14 :\nadhiṣṭhānaḿ tathā kartā",
                "Sloka 15 :\nśarīra-vāń-manobhir yat",
                "Sloka 16 :\ntatraivaḿ sati kartāram",
                "Sloka 17 :\nyasya nāhańkṛto bhāvo",
                "Sloka 18 :\njñānaḿ jñeyaḿ parijñātā",
                "Sloka 19 :\njñānaḿ karma ca kartā ca",
                "Sloka 20 :\nsarva-bhūteṣu yenaikaḿ",
                "Sloka 21 :\npṛthaktvena tu yaj jñānaḿ",
                "Sloka 22 :\nyat tu kṛtsna-vad ekasmin",
                "Sloka 23 :\nniyataḿ sańga-rahitam",
                "Sloka 24 :\nyat tu kāmepsunā karma",
                "Sloka 25 :\nanubandhaḿ kṣayaḿ hiḿsām",
                "Sloka 26 :\nmukta-sańgo \'nahaḿ-vādī",
                "Sloka 27 :\nrāgī karma-phala-prepsur",
                "Sloka 28 :\nayuktaḥ prākṛtaḥ stabdhaḥ",
                "Sloka 29 :\nbuddher bhedaḿ dhṛteś caiva",
                "Sloka 30 :\npravṛttiḿ ca nivṛttiḿ ca",
                "Sloka 31 :\nyayā dharmam adharmaḿ ca",
                "Sloka 32 :\nadharmaḿ dharmam iti yā",
                "Sloka 33 :\ndhṛtyā yayā dhārayate",
                "Sloka 34 :\nyayā tu dharma-kāmārthān",
                "Sloka 35 :\nyayā svapnaḿ bhayaḿ śokaḿ",
                "Sloka 36 :\nsukhaḿ tv idānīḿ tri-vidhaḿ",
                "Sloka 37 :\nyat tad agre viṣam iva",
                "Sloka 38 :\nviṣayendriya-saḿyogād",
                "Sloka 39 :\nyad agre cānubandhe ca",
                "Sloka 40 :\nna tad asti pṛthivyāḿ vā",
                "Sloka 41 :\nbrāhmaṇa-kṣatriya-viśāḿ",
                "Sloka 42 :\nśamo damas tapaḥ śaucaḿ",
                "Sloka 43 :\nśauryaḿ tejo dhṛtir dākṣyaḿ",
                "Sloka 44 :\nkṛṣi-go-rakṣya-vāṇijyaḿ",
                "Sloka 45 :\nsve sve karmaṇy abhirataḥ",
                "Sloka 46 :\nyataḥ pravṛttir bhūtānāḿ",
                "Sloka 47 :\nśreyān sva-dharmo viguṇaḥ",
                "Sloka 48 :\nsaha-jaḿ karma kaunteya",
                "Sloka 49 :\nasakta-buddhiḥ sarvatra",
                "Sloka 50 :\nsiddhiḿ prāpto yathā brahma",
                "Sloka 51 :\nbuddhyā viśuddhayā yukto",
                "Sloka 52 :\nvivikta-sevī laghv-āśī",
                "Sloka 53 :\nahańkāraḿ balaḿ darpaḿ",
                "Sloka 54 :\nbrahma-bhūtaḥ prasannātmā",
                "Sloka 55 :\nbhaktyā mām abhijānāti",
                "Sloka 56 :\nsarva-karmāṇy api sadā",
                "Sloka 57 :\ncetasā sarva-karmāṇi",
                "Sloka 58 :\nmac-cittaḥ sarva-durgāṇi",
                "Sloka 59 :\nyad ahańkāram āśritya",
                "Sloka 60 :\nsvabhāva-jena kaunteya",
                "Sloka 61 :\nīśvaraḥ sarva-bhūtānāḿ",
                "Sloka 62 :\ntam eva śaraṇaḿ gaccha",
                "Sloka 63 :\niti te jñānam ākhyātaḿ",
                "Sloka 64 :\nsarva-guhyatamaḿ bhūyaḥ",
                "Sloka 65 :\nman-manā bhava mad-",
                "Sloka 66 :\nsarva-dharmān parityajya",
                "Sloka 67 :\nidaḿ te nātapaskāya",
                "Sloka 68 :\nya idaḿ paramaḿ guhyaḿ",
                "Sloka 69 :\nna ca tasmān manuṣyeṣu",
                "Sloka 70 :\nadhyeṣyate ca ya imaḿ",
                "Sloka 71 :\nśraddhāvān anasūyaś ca",
                "Sloka 72 :\nkaccid etac chrutaḿ pārtha",
                "Sloka 73 :\nnaṣṭo mohaḥ smṛtir labdhā",
                "Sloka 74 :\nity ahaḿ vāsudevasya",
                "Sloka 75 :\nvyāsa-prasādāc chrutavān",
                "Sloka 76 :\nrājan saḿsmṛtya saḿsmṛtya",
                "Sloka 77 :\ntac ca saḿsmṛtya saḿsmṛtya",
                "Sloka 78 :\nyatra yogeśvaraḥ kṛṣṇo"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 18001,3);
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
