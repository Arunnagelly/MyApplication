package com.example.arunkumar.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;




/**
 * Created by LakshmiArun on 15-11-2017.
 */



public class Sloka_display extends AppCompatActivity {
    MediaPlayer mediaPlayer1=new MediaPlayer();
    Utility ch1=new Utility(this);
    ImageButton prev,next;
    Button playPause;
    TextView textEng,textSAN;
    int Intentnum;
    int num;
    int check;
    int slokaidwbw;
    int slokaidnor;
    Switch switchAB;
    int eSlokaFormat;
    int sSlokaFormat;
    int audioSlow;
    int audioNorm;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slokadisplay);
        switchAB=(Switch)findViewById(R.id.app_bar_switch);
        textEng= findViewById(R.id.textENG);
        textSAN= findViewById(R.id.textSAN);
        prev= findViewById(R.id.imageButton4);
        next= findViewById(R.id.imageButton3);
        playPause=(Button)findViewById(R.id.playpausebutton);
        final Sloka_data sloka_data= getIntent().getParcelableExtra("Sloka_data");

        System.out.println(check);
        textEng.setMovementMethod(new ScrollingMovementMethod());
        textSAN.setMovementMethod(new ScrollingMovementMethod());

        textEng.setText(sloka_data.getEslokaText());
        textSAN.setText(sloka_data.getSslokaText());
        Intentnum=sloka_data.getSlokaNum();
        num=Intentnum;
        check=sloka_data.getCheck();
        slokaidnor=sloka_data.getGetgAudioResourceId();
        slokaidwbw=sloka_data.getgAudioResourceIdWbw();

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff000000));

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer1!=null){ mediaPlayer1.stop();
                    mediaPlayer1.release();}
                playPause.setText("Play");
                goToPrevSong(0);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mediaPlayer1!=null){ mediaPlayer1.stop();
                    mediaPlayer1.release();}
                playPause.setText("Play");
                goToNextSong(0);
            }
        });



        playPause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if(check==3) check=1;
                if(check==0) {
                    if((mediaPlayer1.isPlaying()))
                    {
                        mediaPlayer1.pause();

                        playPause.setText("Play");
                    }else{
                        loadsong(check);
                        playPause.setText("pause");
                        mediaPlayer1.start();
                    }
                }else if(check==1) {
                    if((mediaPlayer1.isPlaying()))
                    {
                        mediaPlayer1.pause();
                        playPause.setText("play");
                    }else{
                        loadsong(check);
                        playPause.setText("pause");
                        mediaPlayer1.start();
                    }

                    mediaPlayer1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer song) {
                            mediaPlayer1.release();
                            System.out.println("on complete2"+check);
                            if(check==1)   goToNextSong(1);



                        }
                    });
                }


            }
        });
    }

    @Override
    public void onBackPressed ()
    {

        if (mediaPlayer1 != null)
            mediaPlayer1.stop();

        super.onBackPressed();

        if(num>18000)
        {
            startActivity(new Intent(this,Chapter18.class));
        }else if(num>17000)
        {
            startActivity(new Intent(this,Chapter17.class));
        }else if(num>16000)
        {
            startActivity(new Intent(this,Chapter16.class));
        }else if(num>15000)
        {
            startActivity(new Intent(this,Chapter15.class));
        }else if(num>14000)
        {
            startActivity(new Intent(this,Chapter14.class));
        }else if(num>13000)
        {
            startActivity(new Intent(this,Chapter13.class));
        }else if(num>12000)
        {
            startActivity(new Intent(this,Chapter12.class));
        }else if(num>11000)
        {
            startActivity(new Intent(this,Chapter11.class));
        }else if(num>10000)
        {
            startActivity(new Intent(this,Chapter10.class));
        }else if(num>9000)
        {
            startActivity(new Intent(this,Chapter9.class));
        }else if(num>8000)
        {
            startActivity(new Intent(this,Chapter8.class));
        }else if(num>7000)
        {
            startActivity(new Intent(this,Chapter7.class));
        }else if(num>6000)
        {
            startActivity(new Intent(this,Chapter6.class));
        }else if(num>5000)
        {
            startActivity(new Intent(this,Chapter5.class));
        }else if (num>4000)
        {
            startActivity(new Intent(this,Chapter4.class));
        }else if(num>3000)
        {
            startActivity(new Intent(this,Chapter3.class));
        }else if(num>2000)
        {
            startActivity(new Intent(this,Chapter2.class));
        }else if(num>1000)
        {
            startActivity(new Intent(this,Chapter1.class));
        }


        finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        switchAB = (Switch)menu.findItem(R.id.app_bar_switch)
                .getActionView().findViewById(R.id.switchAB);

        //   if( switchAB.isChecked()) check=0; else check=1;

        switchAB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplication(), "Learn", Toast.LENGTH_SHORT)
                            .show();
                    check=0;
                    if(mediaPlayer1.isPlaying()){ mediaPlayer1.stop();
                        }
                    playPause.setText("Play");




                } else {
                    Toast.makeText(getApplication(), "Listen", Toast.LENGTH_SHORT)
                            .show();
                    check=1;
                    if(mediaPlayer1.isPlaying()){ mediaPlayer1.stop();
                        }
                    playPause.setText("Play");
                }
            }
        });
        return true;
    }

    void goToPrevSong(int sCheck)
    {

        if(num==1001){ Toast.makeText(getApplicationContext() ,"ReachedStart",Toast.LENGTH_SHORT).show();}
        else if(num==2001){num=1046;}
        else if(num==3001){num=2072;}
        else if(num==4001){num=3043;}
        else if(num==5001){num=4042;}
        else if(num==6001){num=5029;}
        else if(num==7001){num=6047;}
        else if(num==8001){num=7030;}
        else if(num==9001){num=8028;}
        else if(num==10001){num=9034;}
        else if(num==11001){num=10042;}
        else if(num==12001){num=11055;}
        else if(num==13001){num=12020;}
        else if(num==14001){num=13035;}
        else if(num==15001){num=14027;}
        else if(num==16001){num=15020;}
        else if(num==17001){num=16024;}
        else if(num==18001){num=17028;}
        else{

            num--;
            System.out.println(num);

        }

        loadsong(sCheck);

    }

    void goToNextSong(int sCheck){

        if(num==1047){num=2001;
            System.out.println(num);
        }
        else if(num==2072){num=3001;}
        else if(num==3014){num=4001;}
        else if(num==4042){num=5001;}
        else if(num==5029){num=6001;}
        else if(num==6047){num=7001;}
        else if(num==7030){num=8001;}
        else if(num==8028){num=9001;}
        else if(num==9034){num=10001;}
        else if(num==10042){num=11001;}
        else if(num==11055){num=12001;}
        else if(num==12020){num=13001;}
        else if(num==13035){num=14001;}
        else if(num==14027){num=15001;}
        else if(num==15020){num=16001;}
        else if(num==16024){num=17001;}
        else if(num==17028){num=18001;}
        else if(num==18078 ){num=999;Toast.makeText(getApplicationContext() ,"ReachedEnd",Toast.LENGTH_SHORT).show(); }
        else{
            num++;
            System.out.println(num);

        }
        if(num!=999) loadsong(sCheck);
        else{startActivity(new Intent(this,MainActivity.class));
        finish();}

    }
    void loadsong(int sCheck) {
        // deleteCache(getApplicationContext());

        getSupportActionBar().setTitle("BG:" + num);
        eSlokaFormat = this.getResources().getIdentifier("esloka" + Integer.toString(num), "string", "com.example.arunkumar.myapplication");
        sSlokaFormat = this.getResources().getIdentifier("ssloka" + Integer.toString(num), "string", "com.example.arunkumar.myapplication");
        audioSlow = this.getResources().getIdentifier("ssloka" + Integer.toString(num), "raw", "com.example.arunkumar.myapplication");
        audioNorm = this.getResources().getIdentifier("sloka" + Integer.toString(num), "raw", "com.example.arunkumar.myapplication");
        textSAN.setText(sSlokaFormat);
        textEng.setText(eSlokaFormat);
        mediaPlayer1 = new MediaPlayer();
        if (check == 1) {
            mediaPlayer1 = MediaPlayer.create(this, audioNorm);

        } else if (check == 0) {
            mediaPlayer1 = MediaPlayer.create(this, audioSlow);
        }
        if (sCheck == 1) {
            mediaPlayer1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer1) {
                    // Do something. For example: playButton.setEnabled(true);
                    mediaPlayer1.start();
                }
            });


            mediaPlayer1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer song) {
                    mediaPlayer1.release();
                    System.out.println("on complete1" + check);
                    goToNextSong(check);


                }
            });
        }
    }
  /*  public static void deleteCache(Context context) {

        try {
            File dir = context.getCacheDir();
            deleteDir(dir);
        } catch (Exception e) {}
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else if(dir!= null && dir.isFile()) {
            return dir.delete();
        } else {
            return false;
        }
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.about:
                Intent intent1 = new Intent(this,AboutActivity.class);
                this.startActivity(intent1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}





