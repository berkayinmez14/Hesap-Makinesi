package com.berkus.hesapmakinem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button_Clear,button_parantezAc,button_parantezKapa,button_bolme;
    Button button_yedi,button_sekiz,button_dokuz,button_carpma;
    Button  button_dort,button_bes,button_alti,button_cikarma;
    Button button_bir,button_iki,button_uc,button_toplama;
    Button button_AC,button_sifir,button_nokta,button_esittir;
    TextView sonuc,cozum;
    boolean toplam,fark,bolum,carpim;

    float sayi1,sayi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonuc=findViewById(R.id.sonuc);
        cozum=findViewById(R.id.cozum);
        button_Clear=findViewById(R.id.button_Clear);
        button_parantezAc=findViewById(R.id.button_parantezAc);
        button_parantezKapa=findViewById(R.id.button_parantezKapa);
        button_bolme=findViewById(R.id.button_bolme);
        button_yedi=findViewById(R.id.button_yedi);
        button_sekiz=findViewById(R.id.button_sekiz);
        button_dokuz=findViewById(R.id.button_dokuz);
        button_carpma=findViewById(R.id.button_carpma);
        button_dort=findViewById(R.id.button_dort);
        button_bes=findViewById(R.id.button_bes);
        button_alti=findViewById(R.id.button_alti);
        button_cikarma=findViewById(R.id.button_cikarma);
        button_bir=findViewById(R.id.button_bir);
        button_iki=findViewById(R.id.button_iki);
        button_uc=findViewById(R.id.button_uc);
        button_toplama=findViewById(R.id.button_toplama);
        button_AC=findViewById(R.id.button_AC);
        button_sifir=findViewById(R.id.button_sifir);
        button_nokta=findViewById(R.id.button_nokta);
        button_esittir=findViewById(R.id.button_esittir);

        button_bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"1");
                cozum.setText(sonuc.getText());
            }
        });

        button_iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"2");
                cozum.setText(sonuc.getText());
            }
        });

        button_uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"3");
                cozum.setText((sonuc.getText()));
            }
        });

        button_dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"4");
                cozum.setText((sonuc.getText()));
            }
        });

        button_bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"5");
                cozum.setText((sonuc.getText()));
            }
        });

        button_alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"6");
                cozum.setText((sonuc.getText()));
            }
        });

        button_yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"7");
                cozum.setText((sonuc.getText()));
            }
        });

        button_sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"8");
                cozum.setText((sonuc.getText()));
            }
        });

        button_dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"9");
                cozum.setText((sonuc.getText()));
            }
        });

        button_sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"0");
                cozum.setText((sonuc.getText()));
            }
        });

        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+".");
                cozum.setText(sonuc.getText());
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(""); //değer boş kalacak
            }
        });

        button_toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sonuc==null){
                    sonuc.setText("");
                }else{
                    sayi1=Float.parseFloat(sonuc.getText()+"");
                    toplam=true;
                    sonuc.setText(null);
                }
            }
        });

        button_cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1=Float.parseFloat(sonuc.getText()+"");
                fark=true;
                sonuc.setText(null);
            }
        });

        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1=Float.parseFloat(sonuc.getText()+"");
                bolum=true;
                sonuc.setText(null);
            }
        });

        button_carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1=Float.parseFloat(sonuc.getText()+"");
                carpim=true;
                sonuc.setText(null);
            }
        });

        button_esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi2=Float.parseFloat(sonuc.getText()+"");
                if(toplam==true){
                    sonuc.setText(sayi1+sayi2+"");
                    cozum.setText(sayi1+"+"+sayi2);
                    toplam=false;//sürekli toplama yapmasın diye
                }
                if(fark==true){
                    sonuc.setText(sayi1-sayi2+"");
                    cozum.setText(sayi1+"-"+sayi2);
                    fark=false;
                }
                if(bolum==true){
                    sonuc.setText(sayi1/sayi2+"");
                    cozum.setText(sayi1+"/"+sayi2);
                    bolum=false;
                }
                if(carpim==true){
                    sonuc.setText(sayi1*sayi2+"");
                    cozum.setText(sayi1+"*"+sayi2);
                    carpim=false;
                }
            }
        });


    }
}