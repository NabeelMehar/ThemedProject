package com.example.themedproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.horaapps.liz.ui.ThemedIcon;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.about_app_title) TextView aboutApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String name="NAbeel";

    }


//    @OnClick(R.id.about_app_title)
//    public void onReport(){
//        Toast.makeText(this, "Clicked Title", Toast.LENGTH_SHORT).show();
//    }
}
