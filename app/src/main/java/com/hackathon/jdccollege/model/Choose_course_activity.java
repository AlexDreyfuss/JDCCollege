package com.hackathon.jdccollege.model;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hackathon.jdccollege.R;
import com.hackathon.jdccollege.entities.Course;

import java.util.Random;

/**
 * Created by Arele-PC on 1/4/2017.
 */

public class Choose_course_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_course);
        getAccountfromIntent();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CollapsingToolbarLayout cbar = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        cbar.setTitle("התוצאות שלך");
    }

    private void getAccountfromIntent() {
    }

    @Override
    protected void onResume() {
        super.onResume();
        initItemByListView();
    }
    void initItemByListView() {
//        final Course[] myItemList = getCoursesListAsyncTask();
//        if(myItemList.length == 0) {
//            Toast.makeText(getApplicationContext(), "No Courses Found", Toast.LENGTH_LONG).show();
//            return;
//        }
//        ListView lv = (ListView) findViewById(R.id.itemsLV);
//        lv.setDivider(null);
//        lv.setDividerHeight(0);
//        ArrayAdapter<Course> adapter = new ArrayAdapter<Course>(this, R.layout.single_business_layout, myItemList) {
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
//            @Override
//            public View getView(final int position, View convertView, ViewGroup parent) {
//                if (convertView == null)
//                    convertView = View.inflate(Choose_course_activity.this, R.layout.single_business_layout, null);
//
//                setBusinessFields(position, convertView, myItemList);
//                convertView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        moveToBusinessActivity(myItemList[position]);
//                    }
//                });
//                return convertView;
//            }
//        };
//        lv.setAdapter(adapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void setBusinessFields(final int position, final View convertView, final Course[] myItemList) {
        Course curr = myItemList[position];
        /**TextView Name = (TextView) convertView.findViewById(R.id.tvName);
         TextView address = (TextView) convertView.findViewById(R.id.tvaddre);
         TextView email = (TextView) convertView.findViewById(R.id.tvEmail);
         Name.setText(curr.getBusinessName());
         address.setText(curr.getBusinessAddress().toString());
         email.setText(curr.getEmail());*/
        TextView name = (TextView) convertView.findViewById(R.id.notification_title);
//        TextView Description = (TextView) convertView.findViewById(R.id.notification_text);
//        name.setText(curr.getName());
//        Description.setText(curr.getCollegeId());
        convertView.findViewById(R.id.custom_notification).setBackgroundColor(getRandomColor());

    }

    private int getRandomColor() {
        Random r = new Random();
        switch (r.nextInt(3)) {
            case 0:
                return Color.RED;
            case 1:
                return  Color.CYAN;
            case 2:
                return Color.RED;
            default:
                return Color.GREEN;
        }
    }
    private void moveToBusinessActivity(Course toSend){
//        Intent intent = new Intent(getBaseContext(),CourseDeatilsActivity.class);
//        intent.putExtra("course", toSend);
//        startActivity(intent);
    }
}
