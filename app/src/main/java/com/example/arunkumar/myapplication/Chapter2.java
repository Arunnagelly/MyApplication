package com.example.arunkumar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter2 extends AppCompatActivity {

    ListView chpterSlokasList;
    Sloka_data sloka_data = new Sloka_data();
    Utility ut = new Utility(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokalist);

        chpterSlokasList = (ListView) findViewById(R.id.adyaya_list);
        String[] items = new String[]{"Sloka 1 :\ntaḿ tathā kṛpayāviṣṭam", "Sloka 2 :\nkutas tvā kaśmalam idaḿ", "Sloka 3 :\nklaibyaḿ mā sma gamaḥ pārtha", "Sloka 4 :\nkathaḿ bhīṣmam ahaḿ sańkhye",
                "Sloka 5 :\ngurūn ahatvā hi mahānubhāvān", " Sloka 6 :\nna caitad vidmaḥ kataran no garīyo", "Sloka 7 :\nkārpaṇya-doṣopahata-svabhāvaḥ", "Sloka 8 :\nna hi prapaśyāmi mamāpanudyād",
                "Sloka 9 : \nevam uktvā hṛṣīkeśaḿ", "Sloka 10 : \ntam uvāca hṛṣīkeśaḥ", "Sloka 11 :\naśocyān anvaśocas tvaḿ", "Sloka 12 :\nna tv evāhaḿ jātu nāsaḿ",
                "Sloka 13 :\ndehino 'smin yathā dehe", "Sloka 14 :\nmātrā-sparśās tu kaunteya", "Sloka 15 :\nyaḿ hi na vyathayanty ete",
                "Sloka 16 :\nnāsato vidyate bhāvo", " Sloka 17 :\navināśi tu tad viddhi", "Sloka 18 :\nantavanta ime dehā", "Sloka 19 :\nya enaḿ vetti hantāraḿ", "Sloka 20 :\nna jāyate mriyate vā kadācin", "Sloka 21 :\nvedāvināśinaḿ nityaḿ", "Sloka 22 :\nvāsāḿsi jīrṇāni yathā vihāya", "Sloka 23 :\nnainaḿ chindanti śastrāṇi", "Sloka 24 :\nacchedyo 'yam adāhyo 'yam", "Sloka 25 :\navyakto 'yam acintyo 'yam", "Sloka 26:\natha cainaḿ nitya-jātaḿ", "Sloka 27 :\njātasya hi dhruvo mṛtyur", "Sloka 28 :\navyaktādīni bhūtāni", "Sloka 29 :\nāścarya-vat paśyati kaścid enam", "Sloka 30 :\ndehī nityam avadhyo 'yaḿ", "Sloka 31 :\nsva-dharmam api cāvekṣya"
                , "Sloka 32 :\nyadṛcchayā copapannaḿ", "Sloka 33 :\natha cet tvam imaḿ dharmyaḿ", "Sloka 34 :\nakīrtiḿ cāpi bhūtāni", "Sloka 35 :\nbhayād raṇād uparataḿ", "Sloka 36 :\navācya-vādāḿś ca bahūn", "Sloka 37 :\nhato vā prāpsyasi svargaḿ", "Sloka 38 :\nsukha-duḥkhe same kṛtvā", "Sloka 39 :\neṣā te 'bhihitā sāńkhye", "Sloka 40 :\nnehābhikrama-nāśo 'sti", "Sloka 41 :\nvyavasāyātmikā buddhir", "Sloka 42 :\nyām imāḿ puṣpitāḿ vācaḿ", "Sloka 43 :\nkāmātmānaḥ svarga-parā", "Sloka 44 :\nbhogaiśvarya-prasaktānāḿ", "Sloka 45 :\ntrai-guṇya-viṣayā vedā", "Sloka 46 :\nyāvān artha udapāne", "Sloka 47 :\nkarmaṇy evādhikāras te"
                , "Sloka 48 :\nyoga-sthaḥ kuru karmāṇi", "Sloka 49 :\ndūreṇa hy avaraḿ karma", "Sloka 50 :\nbuddhi-yukto jahātīha", "Sloka 51 :\nkarma-jaḿ buddhi-yuktā hi", "Sloka 52 :\nyadā te moha-kalilaḿ", "Sloka 53 :\nśruti-vipratipannā te", "Sloka 54 :\nsthita-prajñasya kā bhāṣā", "Sloka 55 :\nprajahāti yadā kāmān", "Sloka 56 :\nduḥkheṣv anudvigna-manāḥ", "Sloka 57 :\nyaḥ sarvatrānabhisnehas", "Sloka 58 :\nyadā saḿharate cāyaḿ", "Sloka 59 :\nviṣayā vinivartante", "Sloka 60 :\nyatato hy api kaunteya", "Sloka 61 :\ntāni sarvāṇi saḿyamya","Sloka 62 :\ndhyāyato viṣayān puḿsaḥ", "Sloka 63 :\nkrodhād bhavati sammohaḥ","Sloka 64 :\nrāga-dveṣa-vimuktais tu", "Sloka 65 :prasāde sarva-duḥkhānāḿ", "Sloka 66 :\nnāsti buddhir ayuktasya","Sloka 67 :\nindriyāṇāḿ hi caratāḿ", "Sloka 68 :\ntasmād yasya mahā-bāho","Sloka 69 :\nyā niśā sarva-bhūtānāḿ", "Sloka 70 :\nāpūryamāṇam acala-pratiṣṭhaḿ","Sloka 71 :\nvihāya kāmān yaḥ sarvān", "Sloka 72 :\neṣā brāhmī sthitiḥ pārtha" };
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        chpterSlokasList.setAdapter(adapter);


        chpterSlokasList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ut.goToIntent(i + 2001,3);
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
