package com.example.maimanhduy.internshipdai1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        String data;
        Intent myItent = getIntent();
        data = "Email: "+myItent.getStringExtra("mail")+"-Name: "+ myItent.getStringExtra("name")+"-Pass: "+ myItent.getStringExtra("pass")+"-Gender: "+ myItent.getStringExtra("gender");
        TextView dataView = (TextView)findViewById(R.id.idDuLieu);
        dataView.setText(data);
    }
}
