package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2;
    private EditText pass,confirmpass,etName,etLname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Creating");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initialize();
        setOnClick();
    }


    public void initialize()
    {
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b1);
        etName=findViewById(R.id.etName);
        etLname=findViewById(R.id.etName);
        pass=findViewById(R.id.editText3);
        confirmpass=findViewById(R.id.editText4);


    }
 private void setOnClick()
 {
     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             if (etName.getText().toString().trim().length()==0){
                 etName.setError("please Enter Valid First  Name");
             }
             else  if (etLname.getText().toString().trim().length()==0){
                 etLname.setError("please Enter Valid Last Name");
             }

             else
                 {

                 if (pass.getText().toString().trim().equals(confirmpass.getText().toString().trim()))

                 { Intent i=new Intent(MainActivity.this,SecondActivity.class);
                     //i.putExtra("name",name);
                     startActivity(i);
                 }
                 else {
                     confirmpass.setError("Both passwords don't match");
                 }

                 }
                 }
     });
     {

     }
 }
}
