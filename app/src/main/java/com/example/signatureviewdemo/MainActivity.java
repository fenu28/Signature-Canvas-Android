package com.example.signatureviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kyanogen.signatureview.SignatureView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    private SignatureView signatureView;
    private Button save;
    private Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signatureView = findViewById(R.id.signature_view);
        save = findViewById(R.id.button_save);
        clear = findViewById(R.id.button_clear);

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }

    public void clear()
    {
        signatureView.clearCanvas();
    }
}