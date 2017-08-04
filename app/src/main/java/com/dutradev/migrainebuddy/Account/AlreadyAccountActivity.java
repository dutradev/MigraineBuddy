package com.dutradev.migrainebuddy.Account;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.dutradev.migrainebuddy.Menu.MenuActivity;
import com.dutradev.migrainebuddy.R;

/**
 * Created by dutradev on 21/10/2016.
 */

public class AlreadyAccountActivity extends AppCompatActivity {
    private EditText txtEmail, txtPass;
    private LinearLayout btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_already_account);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }

        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPass = (EditText) findViewById(R.id.txtPass);
        btnNext = (LinearLayout) findViewById(R.id.btnNextMyProfile);

        txtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                btnNext.setBackgroundColor(getResources().getColor(R.color.color_bottom_menu));
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), MenuActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txtPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                btnNext.setBackgroundColor(getResources().getColor(R.color.color_bottom_menu));
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), MenuActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
