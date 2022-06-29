package com.example.pitjarusaplikasi.halaman1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pitjarusaplikasi.R;

public class MenuActivity extends AppCompatActivity {

    private Button kunjunganBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        kunjunganBTN = (Button) findViewById(R.id.kunjunganBTN);

        kunjunganBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, VerifikasiStoreActivity.class));

            }
        });
    }
}
