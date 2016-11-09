package com.example.maimanhduy.internshipdai1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Facebooks extends Activity {
    EditText name, pass;
    Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebooks);
        Anhxa();
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra("user",name.getText().toString());
                data.putExtra("pass",pass.getText().toString());
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
    public void Anhxa(){
        name = (EditText)findViewById(R.id.fbUser);
        pass = (EditText)findViewById(R.id.fbPass);
        btLogin = (Button) findViewById(R.id.fbLogin);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
