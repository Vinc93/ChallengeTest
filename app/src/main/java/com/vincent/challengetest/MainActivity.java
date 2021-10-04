package com.vincent.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChlTest(View view){

        EditText editName= findViewById(R.id.edtName);
        EditText editSurname= findViewById(R.id.edtSurname);
        EditText editEmail= findViewById(R.id.edtEmail);

        TextView textName= findViewById(R.id.txtName);
        TextView textSurname=findViewById(R.id.txtSurname);
        TextView textEmail=findViewById(R.id.txtEmail);

        textName.setText("First Name: "+editName.getText().toString());
        textSurname.setText("Last Name: "+editSurname.getText().toString());
        textEmail.setText("Email: "+editEmail.getText().toString());
    }

}