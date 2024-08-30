package com.upiita.portadarelativejava;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia al RelativeLayout en el layout XML
        RelativeLayout relativeLayout = findViewById(R.id.rlMain);



        // ImageView 1 - Logo IPN
        ImageView imag1 = new ImageView(this);
        imag1.setId(ImageView.generateViewId());
        imag1.setImageResource(R.drawable.logo_ipn);
        RelativeLayout.LayoutParams paramsImag1 = new RelativeLayout.LayoutParams(200, 200);
        paramsImag1.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
        imag1.setLayoutParams(paramsImag1);

        // TextView 1 - Título
        TextView txt1 = new TextView(this);
        txt1.setId(TextView.generateViewId());
        txt1.setText("                Instituto Politécnico \n              Nacional");
        txt1.setGravity(Gravity.CENTER_HORIZONTAL);
        txt1.setTextSize(25);
        txt1.setTextColor(Color.rgb(113, 28, 69));
        RelativeLayout.LayoutParams paramsTxt1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsTxt1.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
        txt1.setLayoutParams(paramsTxt1);

        // ImageView 2 - Logo UPIITA
        ImageView imag2 = new ImageView(this);
        imag2.setId(ImageView.generateViewId());
        imag2.setImageResource(R.drawable.logo_upiita);
        RelativeLayout.LayoutParams paramsImag2 = new RelativeLayout.LayoutParams(200, 200);
        paramsImag2.addRule(RelativeLayout.ALIGN_PARENT_END, RelativeLayout.TRUE);
        imag2.setLayoutParams(paramsImag2);

        // Agregar vistas al RelativeLayout
        relativeLayout.addView(imag1);
        relativeLayout.addView(txt1);
        relativeLayout.addView(imag2);

        // TextView 2 - Descripción UPIITA
        TextView txt2 = new TextView(this);
        txt2.setId(TextView.generateViewId());
        txt2.setText("Unidad Profesional Interdisciplinaria en Ingeniería y Tecnologías Avanzadas");
        txt2.setGravity(Gravity.CENTER);
        txt2.setTextSize(25);
        txt2.setTextColor(Color.rgb(179,150,0));
        txt2.setBackgroundColor(Color.rgb(128,0,66));
        RelativeLayout.LayoutParams paramsTxt2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsTxt2.addRule(RelativeLayout.BELOW, txt1.getId());
        paramsTxt2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt2.setLayoutParams(paramsTxt2);
        relativeLayout.addView(txt2);

        // ImageView 3 - Otro logo o imagen
        ImageView imag3 = new ImageView(this);
        imag3.setId(ImageView.generateViewId());
        imag3.setImageResource(R.drawable.logo_lugar);
        RelativeLayout.LayoutParams paramsImag3 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 300);
        paramsImag3.addRule(RelativeLayout.BELOW, txt2.getId());
        imag3.setLayoutParams(paramsImag3);
        relativeLayout.addView(imag3);

        // TextView 3 - Curso
        TextView txt3 = new TextView(this);
        txt3.setId(TextView.generateViewId());
        txt3.setText("Programación de dispositivos móviles\nGrupo:2TM9");
        txt3.setTextSize(25);
        txt3.setBackgroundColor(Color.rgb(255,255,225));
        txt3.setTextColor(Color.rgb(113, 28, 69));
        RelativeLayout.LayoutParams paramsTxt3 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsTxt3.addRule(RelativeLayout.BELOW, imag3.getId());
        paramsTxt3.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt3.setLayoutParams(paramsTxt3);
        relativeLayout.addView(txt3);

        // TextView 4 - Nombre del alumno
        TextView txt4 = new TextView(this);
        txt4.setId(TextView.generateViewId());
        txt4.setText("\nNombre: Deciga Garcia Rafael");
        txt4.setTextSize(25);
        txt4.setTextColor(Color.rgb(64, 140, 255));
        RelativeLayout.LayoutParams paramsTxt4 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsTxt4.addRule(RelativeLayout.BELOW, txt3.getId());
        paramsTxt4.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt4.setLayoutParams(paramsTxt4);
        relativeLayout.addView(txt4);

        // ImageView 4 - Foto del alumno
        ImageView imag4 = new ImageView(this);
        imag4.setId(ImageView.generateViewId());
        imag4.setBackgroundColor(Color.rgb(117,9,65));
        imag4.setImageResource(R.drawable.logo_alumno);
        RelativeLayout.LayoutParams paramsImag4 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 800);
        paramsImag4.addRule(RelativeLayout.BELOW, txt4.getId());
        imag4.setLayoutParams(paramsImag4);
        relativeLayout.addView(imag4);
    }
}