package com.hackathon.jdccollege.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hackathon.jdccollege.R;
import com.hackathon.jdccollege.SqlDatabase.FactoryDB;
import com.hackathon.jdccollege.SqlDatabase.SqlDatabase;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        SqlDatabase db = FactoryDB.getDatabase();
    }
}
