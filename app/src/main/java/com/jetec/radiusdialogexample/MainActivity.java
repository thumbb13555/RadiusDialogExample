package com.jetec.radiusdialogexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btOpen = findViewById(R.id.button);

        btOpen.setOnClickListener((v)->{
            AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(R.layout.dialog_item,null);
            Button btDialog = view.findViewById(R.id.buttonDialog);
            mBuilder.setView(view);
            AlertDialog dialog = mBuilder.create();
            btDialog.setOnClickListener(v1 -> {dialog.dismiss();});
            dialog.show();

            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);
            dialog.getWindow().setLayout(dm.widthPixels-230, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        });
    }
}
