package com.hackathon.jdccollege.model;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hackathon.jdccollege.R;
import com.hackathon.jdccollege.entities.College;
import com.hackathon.jdccollege.entities.Course;
import com.hackathon.jdccollege.entities.Currents;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Arele-PC on 1/4/2017.
 */

public class Choose_course_activity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_businesses);
        getAccountfromIntent();
        lv = (ListView) findViewById(R.id.itemsLV1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CollapsingToolbarLayout cbar = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        //setSupportActionBar(toolbar);
        cbar.setTitle("Your Results:");
    }

    private void getAccountfromIntent() {
    }

    @Override
    protected void onResume() {
        super.onResume();
        initItemByListView();
    }
    void initItemByListView() {
        final ArrayList<Course> myItemList = getCoursesList();
        if(myItemList.size()== 0) {
            Toast.makeText(getApplicationContext(), "No Courses Found", Toast.LENGTH_LONG).show();
            return;
        }

//        lv.setDivider(null);
//        lv.setDividerHeight(0);
        ArrayAdapter<Course> adapter = new ArrayAdapter<Course>(this, R.layout.single_business_layout, myItemList) {

            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                    convertView = View.inflate(Choose_course_activity.this, R.layout.single_business_layout, null);

                setBusinessFields(position, convertView, myItemList);
                convertView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        moveToBusinessActivity(myItemList.get(position));
                    }
                });
                return convertView;
            }
        };
        lv.setAdapter(adapter);
    }

    private ArrayList<Course> getCoursesList() {
        ArrayList<Course> tmp =  new ArrayList<Course>();
        tmp.add(new Course("2","Computer-Science","1", "B.Sc", "4 years","semesterial", "10568 per year","an excellent school with great job future","A-levels","Jerusalem"));
        tmp.add( new Course("1","Computer-Science", "2","B.A", "4 years","semesterial", "10568 per year","A-levels","an excellent school with great job future","Jerusalem"));
        tmp.add(new Course("6","Computer-Science", "3", "B.A", "12 month", "very intensive","5000 NIS","big learning curve","none", "Rehovot"));

        return tmp;
    }
    private ArrayList<College> getCollegeList(){
        ArrayList<College> tmp = new ArrayList<>();
        tmp.add(new College("1","JCT", "www.jct.ac.il","0532834295", "Havaad Haleumi 21","Jerusalem"));
        tmp.add(new College("2","Hebrew University", "www.new.huji.ac.il","023003002", "Haorpan 6","Jerusalem"));
        tmp.add(new College("3","Hebrew University", "www.new.huji.ac.il","036547888", "Hanahal 12","Rehovot"));
        return  tmp;

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void setBusinessFields(final int position, final View convertView, final ArrayList<Course> myItemList) {
        Course curr = myItemList.get(position);
        TextView name = (TextView) convertView.findViewById(R.id.notification_title);
        TextView college = (TextView) convertView.findViewById(R.id.notification_college);
        TextView extra = (TextView) convertView.findViewById(R.id.notification_text1);
        name.setText(curr.getName());

        college.setText(getCollegeList(curr.getCollegeId()));
        extra.setText(curr.getArea());
        //convertView.findViewById(R.id.custom_notification).setBackgroundColor(getRandomColor());

    }

    private String getCollegeList(String collegeId) {
        ArrayList<College> tmp = getCollegeList();
        for (int i =0; i< tmp.size();i++){
            if (tmp.get(i).getID().equals(collegeId))
                return tmp.get(i).getName();
        }
        return "";
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
        Intent intent = new Intent(Choose_course_activity.this,BusinessDeatilsActivitys.class);
        Currents.currentcourse= toSend;
        ArrayList<College> list = getCollegeList();
        for(int i =0; i< list.size();i++)
        {
            if(toSend.getCollegeId().equals(list.get(i).getID())){
                Currents.currentcollege = list.get(i);
            }
        }
        startActivity(intent);
    }
}
