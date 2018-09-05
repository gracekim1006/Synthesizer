package com.example.sythesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonA;
    private Button buttonBb;
    private Button buttonB;
    private Button buttonC;
    private Button buttonCs;
    private Button buttonD;
    private Button buttonDs;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFs;
    private Button buttonG;
    private Button buttonGs;
    private SoundPool soundPool;
    private int noteA;
    private int noteBb;
    private int noteB;
    private int noteC;
    private int noteCs;
    private int noteD;
    private int noteDs;
    private int noteE;
    private int noteF;
    private int noteFs;
    private int noteG;
    private int noteGs;


    public static final float DEFAULT_VOLUME= 1.0f;
    public static final float DEFAULT_RATE= 1.0f;
    public static final int DEFAULT_PRIORITY = 1;
    public static final int WHOLE_NOTE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sythesizer);

        wireWidgets();
        setListeners();
        initializeSoundPool();
    }

    private void initializeSoundPool() {
        soundPool = new SoundPool(10,
                AudioManager.STREAM_MUSIC, 0);
        noteA = soundPool.load(this, R.raw.scalea,1);
        noteBb = soundPool.load(this, R.raw.scalebb,1);
        noteB = soundPool.load(this, R.raw.scaleb,1);
        noteC = soundPool.load(this, R.raw.scalec,1);
        noteCs = soundPool.load(this, R.raw.scalecs,1);
        noteD = soundPool.load(this, R.raw.scaled,1);
        noteDs = soundPool.load(this, R.raw.scaleds,1);
        noteE = soundPool.load(this, R.raw.scalee,1);
        noteF = soundPool.load(this, R.raw.scalef,1);
        noteFs = soundPool.load(this, R.raw.scalefs,1);
        noteG = soundPool.load(this, R.raw.scaleg,1);
        noteGs = soundPool.load(this, R.raw.scalegs,1);

    }

    private void setListeners() {
        buttonA.setOnClickListener(this);
        buttonBb.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCs.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonDs.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonFs.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonGs.setOnClickListener(this);
    }

    private void wireWidgets() {
        buttonA = findViewById(R.id.button_syth_a);
        buttonBb = findViewById(R.id.button_syth_bb);
        buttonB = findViewById(R.id.button_syth_b);
        buttonC = findViewById(R.id.button_syth_c);
        buttonCs = findViewById(R.id.button_syth_cs);
        buttonD = findViewById(R.id.button_syth_d);
        buttonDs = findViewById(R.id.button_syth_ds);
        buttonE = findViewById(R.id.button_syth_e);
        buttonF = findViewById(R.id.button_syth_f);
        buttonFs = findViewById(R.id.button_syth_fs);
        buttonG = findViewById(R.id.button_syth_g);
        buttonGs = findViewById(R.id.button_syth_gs);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_syth_a:
                soundPool.play(noteA, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_bb:
                soundPool.play(noteBb, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_b:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_c:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_cs:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_d:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_ds:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_e:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_f:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_g:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_syth_gs:
                soundPool.play(noteB, 1.0f, 1.0f,
                        1, 0, 1.0f);
                break;
            case R.id.button_main_scale:
                playScale();
                break;
            }


    }
    private void playScale() {
        soundPool.play(noteA, DEFAULT_VOLUME, DEFAULT_VOLUME,DEFAULT_PRIORITY, 0, DEFAULT_RATE);

        playNote(noteA);
        delay(WHOLE_NOTE);
        playNote(noteBb);
        playNote(noteB);
        playNote(noteC);
        playNote(noteCs);
        playNote(noteD);
        playNote(noteDs);
        playNote(noteE);
        playNote(noteF);
        playNote(noteFs);
        playNote(noteG);
        playNote(noteGs);
    }

    private void delay(int duration){
        try {
            Thread.sleep(duration);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    private void playNote(int note, int loop) {
        soundPool.play(note, DEFAULT_VOLUME,DEFAULT_VOLUME, DEFAULT_PRIORITY,loop, DEFAULT_RATE);

    }
    private void playNote(int note){
        playNote(note, 0);
    }

}
