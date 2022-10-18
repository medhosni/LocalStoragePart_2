package com.example.localstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.localstorage.Entity.User;
import com.example.localstorage.database.AppDataBase;

public class MainActivity extends AppCompatActivity {
    private EditText login, pwd;
    private Button valider, clear;
    private AppDataBase database;

    //  private SharedPreferences sp;
//    public static final String spFile = "Mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // sp = getSharedPreferences(spFile, MODE_PRIVATE);
        database = AppDataBase.getAppDatabase(getApplicationContext());
        login = findViewById(R.id.editTextTextPersonName);
        pwd = findViewById(R.id.editTextTextPassword);
        valider = findViewById(R.id.Login);

valider.setOnClickListener(e->{

    //database.userDao().insertOne(new User());
database.userDao().getAll();

});


        /* if(sp.contains("login")||sp.contains("pwd")){

            login.setText(sp.getString("login",""));
            pwd.setText(sp.getString("pwd",""));

        }

        valider.setOnClickListener(e -> {

            SharedPreferences.Editor ed = sp.edit();
            ed.putString("login", login.getText().toString());
            ed.putString("pwd", pwd.getText().toString());
            ed.apply();
        });

        clear.setOnClickListener(e ->{
          SharedPreferences.Editor editor = sp.edit();
          editor.clear();
          editor.apply();
          login.setText("");
          pwd.setText("");
        });

         */
    }
}