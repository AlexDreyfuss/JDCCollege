package com.hackathon.jdccollege.model;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
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
import java.util.concurrent.ExecutionException;


/**
 * Created by Yair on 2016-12-14.
 */

public class AttractionListTab extends Fragment {

    College currentBusiness;
    Course currentAccount;


      TextView teuda;
      TextView duration;
      TextView rezifut;
      TextView names;
      TextView price ;
      TextView description;
      TextView preCourses;
      TextView area;


    public AttractionListTab(){
        currentBusiness = Currents.currentcollege;
        currentAccount = Currents.currentcourse;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TODO get business object from BusinessActivity
        View rootView = inflater.inflate(R.layout.content_course_details, container, false);
        setCurrentBusiness(rootView);
        return rootView;
    }

    public void setBusiness(College toUpdate, Course currentaccount){


    }

    public void setCurrentBusiness(View v) {

        names =(TextView)v.findViewById(R.id.idTV1);
        teuda=(TextView)v.findViewById(R.id.nameTV2);
        duration=(TextView)v.findViewById(R.id.addressTV3);
        rezifut=(TextView)v.findViewById(R.id.emailTV4);
        price=(TextView)v.findViewById(R.id.websiteTV5);
        preCourses=(TextView)v.findViewById(R.id.websiteTV6);
        area=(TextView)v.findViewById(R.id.websiteTV7);
        description=    (TextView)v.findViewById(R.id.websiteTV8);

        names.setText(Currents.currentcourse.getName());
        teuda.setText(Currents.currentcourse.getTeuda());
        duration.setText(Currents.currentcourse.getDuration());
        rezifut.setText(Currents.currentcourse.getRezifut());
        price.setText(Currents.currentcourse.getPrice());
        preCourses.setText(Currents.currentcourse.getPreCourses());
                area.setText(Currents.currentcourse.getArea());
        description.setText(Currents.currentcourse.getDescription());
    }
}
