package com.example.display;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog epicDialog;
    Button button;
    TextView textview,text;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        epicDialog = new Dialog(this);

        button = (Button) findViewById(R.id.buttton1);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Showdailog();
            }

            private void Showdailog() {

                epicDialog.setContentView(R.layout.errormessage);

                imageview = (ImageView) epicDialog.findViewById(R.id.img);
                textview = (TextView) epicDialog.findViewById(R.id.text8);
                text = (TextView) epicDialog.findViewById(R.id.text);

                imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        epicDialog.dismiss();
                    }
                });
                epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epicDialog.show();
            }
        });
    }

}
