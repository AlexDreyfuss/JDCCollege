package com.hackathon.jdccollege.model;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hackathon.jdccollege.R;
import com.hackathon.jdccollege.entities.College;
import com.hackathon.jdccollege.entities.Course;



/**
 * Created by Yair on 2016-12-14.
 */

public class BusinessDetailsTab extends Fragment {
    College currentBusiness;
    Course currentAccount;

    TextView Id;
    TextView Name;
    TextView Web_Site;
    TextView Phone;
    TextView Address;


    public BusinessDetailsTab(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TODO get business object from BusinessActivity
        View rootView = inflater.inflate(R.layout.content_business_details, container, false);
        setCurrentBusiness(rootView);
        return rootView;
    }

    public void setBusiness(College toUpdate, Course currentaccount){
        currentBusiness = toUpdate;
        currentAccount = currentaccount;

    }

    public void setCurrentBusiness(View v) {
        Id = (TextView) v.findViewById(R.id.idTV);
        Name= (TextView) v.findViewById(R.id.nameTV);
        Address= (TextView) v.findViewById(R.id.addressTV);
        Phone= (TextView) v.findViewById(R.id.emailTV);
        Web_Site = (TextView) v.findViewById(R.id.websiteTV);
        Id.setText(currentBusiness.getID());
        Name.setText(currentBusiness.getName());
        Address.setText(currentBusiness.getAddress());
        Phone.setText(currentBusiness.getPhone());
        Web_Site.setText(currentBusiness.getWeb_Site());
    }
}
