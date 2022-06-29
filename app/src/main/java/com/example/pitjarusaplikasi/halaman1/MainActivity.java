package com.example.pitjarusaplikasi.halaman1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pitjarusaplikasi.Methods;
import com.example.pitjarusaplikasi.Model;
import com.example.pitjarusaplikasi.R;
import com.example.pitjarusaplikasi.RetrofitClient;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBTN;
//    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        loginBTN = (Button) findViewById(R.id.loginBTN);

//        dbHelper = new DBHelper(this);

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txUsername = username.getText().toString().trim();
                String txPassword = password.getText().toString().trim();

//                boolean res = dbHelper.checkUser(txUsername, txPassword);
                if (txUsername.equals( "pitjarus" ) && txPassword.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Methods methods = RetrofitClient.getRetrofitInstance().create(Methods.class);
                    Call<Model> call = methods.getAllData();
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));

                } else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public static Spanned fromHtml(String html) {
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }

    public static class MainMenuActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
        }
    }
}