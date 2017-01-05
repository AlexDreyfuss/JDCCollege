package com.hackathon.jdccollege.SqlDatabase;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.hackathon.jdccollege.entities.College;
import com.hackathon.jdccollege.entities.Course;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
//import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ParallelScanOptions;
import com.mongodb.ServerAddress;

import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;
/**
 * Created by Arele-PC on 1/4/2017.
 */

public class SqlDatabase {

    public DB db = null;
    SqlDatabase(){
//        try {
////            MongoClient mongoClient =null;
////            AsyncTask<Void,Void,MongoClient> as = new AsyncTask<Void, Void, MongoClient>() {
////                @Override
////                protected MongoClient doInBackground(Void... params) {
////
////                    return mongoClient;
////                }
////            };
////            as.execute();
//            MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://jdchackathon:XD8JRBOtiK5ITaSEm95eeNCnG2R21qtJkM1Z9Wm6Qor46U218dYuWW4hmI6tPJd3c6x273dZHv3xK0F1AKEYKA==@jdchackathon.documents.azure.com:10250/?ssl=true&sslInvalidHostNameAllowed=true"));
//
//         //   mongoClient = as.get();
//            db = mongoClient.getDB( "JCTHack" );
//
//
//        }
//        catch (Exception ex){
//            Log.d("problem", ex.toString());
//        }


    }

//    //region Interface Functions




//    public ArrayList<College> getCollegeList() throws Exception {
////        MatrixCursor accountCursor = new MatrixCursor(new String[]{Account.ID,Account.USERNAME,Account.PASSWORD });
//
////        for (int i =0; i < accountList.size();i++){
////            acc = accountList.get(i);
////            accountCursor.addRow(new Object[]{acc.getAccountNumber(),acc.getUserName(),acc.getPassword()});
////        }
////        return accountCursor;
////        MatrixCursor agenciesCursor = new MatrixCursor(new String[]{"_ID", "Name", "Country", "City", "Street", "HouseNumber", "PhoneNumber", "Email"});
////
//       ArrayList<College> collegelist = new ArrayList<>();
//        DBCollection coll = db.getCollection(Constraints.getcollege);
//        DBCursor cursor = coll.find();
//        List<DBObject> l = cursor.toArray();
//
//        for(int i=0; i < l.size();i++ ){
//            collegelist.add(new College(l.get(i).get(College.kid).toString(),l.get(i).get(College.kname).toString(),
//                    l.get(i).get(College.kwebsite).toString(),l.get(i).get(College.kphone).toString(),l.get(i).get(College.kadress).toString()));
//        }
//
//
//            return collegelist;
//    }


//    public ArrayList<College> getAccountList() {
//        ArrayList<College> toReturn = new ArrayList<>();
//        try {
//            Cursor ab = getAccountCursor();
//            String un,pw;
//            long id;
//
//            ArrayList<College> mArrayList = new ArrayList<College>();
//            for(ab.moveToFirst(); !ab.isAfterLast(); ab.moveToNext()) {
//                // The Cursor is now set to the right position
////                un = ab.getString(ab.getColumnIndex(College.USERNAME));
////                pw = ab.getString(ab.getColumnIndex(College.PASSWORD));
////                id = Long.parseLong(ab.getString(ab.getColumnIndex(Account.ID)));
////                toReturn.add(new College(id,un,pw));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toReturn;
//    }
//    public Account getAccount(long id) throws Exception {
//        ArrayList<Account> list = getAccountList();
//        for (Account curr:list) {
//            if(curr.getAccountNumber() == id){
//                return curr;
//            }
//
//        }
//        throw new Exception("Account not found");
//    }
//
//    public Account getAccount(String username) throws Exception {
//        Cursor accounts = getAccountCursor();
//        accounts.moveToFirst();
//        while (!accounts.isAfterLast()) {
//            String accountsString = accounts.getString(1);
//            if(accountsString.equals(username)){
//                return new Account(Long.parseLong(accounts.getString(0)),accounts.getString(1),accounts.getString(2));
//            }
//            accounts.moveToNext();
//        }
//        return null;
//    }
//
////
//    public Uri insert(Account ac) {
//        int id = addNewAccount(ac);
//        String a = String.valueOf(id);
//        return Uri.parse(a);
//    }
//
//
//    public ArrayList<Attraction> getAttractionList() {
//        ArrayList<Attraction> toReturn = new ArrayList<>();
//        try {
//            Cursor ab = getAttractionCursor();
//            String id,country,desc,bID;
//            Properties.AttractionType type;
//            String start,end,name;
//            float price;
//
//            for(ab.moveToFirst(); !ab.isAfterLast(); ab.moveToNext()) {
//                // The Cursor is now set to the right position
//                id = ab.getString(ab.getColumnIndex(Attraction.ID));
//                type = Properties.Valueof(ab.getString(ab.getColumnIndex(Attraction.TYPE)));
//                country = ab.getString(ab.getColumnIndex(Attraction.COUNTRY));
//                start = ab.getString(ab.getColumnIndex(Attraction.STARTDATE));
//                end = ab.getString(ab.getColumnIndex(Attraction.ENDDATE));
//                price = Float.parseFloat(ab.getString(ab.getColumnIndex(Attraction.PRICE)));
//                desc = ab.getString(ab.getColumnIndex(Attraction.DESCRIPITION));
//                bID = ab.getString(ab.getColumnIndex(Attraction.BUSINESSID));
//                name = ab.getString(ab.getColumnIndex(Attraction.NAME));
//                toReturn.add(new Attraction(id,type,name,country,start,end,price,desc,bID));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toReturn;
//    }
//
//    public ArrayList<Attraction> getAttractionList(String BusinessID) {
//        ArrayList<Attraction> list = getAttractionList();
//        ArrayList<Attraction> toReturn = new ArrayList<>();
//        for (Attraction curr:list) {
//            if(curr.getBusinessID().equals(BusinessID))
//                toReturn.add(curr);
//        }
//        return toReturn;
//    }
//
//    public Cursor getAttractionCursor() throws Exception {
//
//        MatrixCursor attractionCursor = new MatrixCursor(
//                new String[]{
//                        Attraction.ID,
//                        Attraction.TYPE,
//                        Attraction.COUNTRY,
//                        Attraction.STARTDATE,
//                        Attraction.ENDDATE,
//                        Attraction.PRICE,
//                        Attraction.DESCRIPITION,
//                        Attraction.BUSINESSID,
//                        Attraction.NAME});
//
//        JSONArray array = new JSONObject(GET(WEB_URL + getAttractions)).getJSONArray(Attraction.ATTRACTION);
//        for (int i = 0; i < array.length(); i++) {
//            JSONObject attraction = array.getJSONObject(i);
//            attractionCursor.addRow(new Object[]{
//                    attraction.getString(Attraction.ID),
//                    attraction.getString(Attraction.TYPE),
//                    attraction.getString(Attraction.COUNTRY),
//                    attraction.getString(Attraction.STARTDATE),
//                    attraction.getString(Attraction.ENDDATE),
//                    attraction.getString(Attraction.PRICE),
//                    attraction.getString(Attraction.DESCRIPITION),
//                    attraction.getString(Attraction.BUSINESSID),
//                    attraction.getString(Attraction.NAME)
//            });
//        }
//        return attractionCursor;
//    }
//
//    public Attraction getAttraction(String attractionID) throws Exception {
//        ArrayList<Attraction> list = getAttractionList();
//        for (Attraction a:list) {
//            if(a.getAttractionID().equals(attractionID))
//                return a;
//        }
//        throw new Exception("No Attraction Found");
//    }
//
//    public Attraction getAttraction(String BusinessID, String AttrationName) throws Exception {
//        ArrayList<Attraction> list = getAttractionList();
//        for (Attraction curr:list) {
//            if(curr.getBusinessID().equals(BusinessID) && curr.getAttractionName().equals(AttrationName))
//                return curr;
//
//        }
//        throw new Exception("No Attraction Found");
//    }
//
//
//    public Uri insert(Attraction ac) {
//        int id = addNewAttraction(ac);
//        String a = String.valueOf(id);
//        return Uri.parse(a);
//    }
//
//
//    public ArrayList<Business> getBusinessList() {
//        ArrayList<Business> toReturn = new ArrayList<>();
//
//        try {
//            Cursor ab = getBusinessCursor();
//            String AccountID;
//            String BusinessID;
//            String BusinessName;
//            Address BusinessAddress;
//            String City,Country,Street;
//            String Email;
//            String Website;
//
//            for(ab.moveToFirst(); !ab.isAfterLast(); ab.moveToNext()) {
//                // The Cursor is now set to the right position
//                AccountID = ab.getString(ab.getColumnIndex(Business.ACCOUNTID));
//                BusinessID = ab.getString(ab.getColumnIndex(Business.ID));
//                BusinessName = ab.getString(ab.getColumnIndex(Business.NAME));
//                City = ab.getString(ab.getColumnIndex(Address.CITY));
//                Country = ab.getString(ab.getColumnIndex(Address.COUNTRY));
//                Street = ab.getString(ab.getColumnIndex(Address.STREET));
//                Email = ab.getString(ab.getColumnIndex(Business.EMAIL));
//                Website = ab.getString(ab.getColumnIndex(Business.WEBSITE));
//                BusinessAddress = new Address(Country,City,Street);
//                toReturn.add(new Business(AccountID,BusinessID,BusinessName,BusinessAddress,Email,Website));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toReturn;
//    }
//
//    public Cursor getBusinessCursor() throws Exception {
//        Business bus;
//        MatrixCursor businessCursor = new MatrixCursor(
//                new String[]{Business.ACCOUNTID,Business.ID,Business.NAME, Address.CITY,Address.COUNTRY,Address.STREET,
//                        Business.EMAIL,Business.WEBSITE});
//
//        JSONArray array = new JSONObject(GET(WEB_URL + Constraints.getBusinesses)).getJSONArray(Business.BUSINESS);
//        for (int i = 0; i < array.length(); i++) {
//            JSONObject agency = array.getJSONObject(i);
//            businessCursor.addRow(new Object[]{
//                    agency.getString(Business.ACCOUNTID),
//                    agency.getString(Business.ID),
//                    agency.getString(Business.NAME),
//                    agency.getString(Address.CITY),
//                    agency.getString(Address.COUNTRY),
//                    agency.getString(Address.STREET),
//                    agency.getString(Business.EMAIL),
//                    agency.getString(Business.WEBSITE)
//            });
//        }
//        return businessCursor;
//    }
//
//    public boolean ifNewBusinessAdded() {
//        if (latelyAddedNewBusiness) {
//            latelyAddedNewBusiness = false;
//            return true;
//        }
//        return false;
//    }
//
//
//    public int removeBusiness(String businessID) {
//        //TODO need to implement removeBusiness
//        return 0;
//    }
//
//    public int removeBusiness(int rowID) {
//        //TODO need to implement removeBusiness
//        return 0;
//    }
//
//    public Uri insert(Business ac) {
//        int id = addNewBusiness(ac);
//        String a = String.valueOf(id);
//        return Uri.parse(a);
//    }
//
//    public int delete(Uri uri, String selection, String[] selectionArgs) {
//        //TODO need to implement delete
//        return 0;
//    }
//
//    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
//        //TODO need to implement update
//        return 0;
//    }
//
//    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
//        //TODO need to implement query
//        return null;
//    }
//
//    public ArrayList<Business> getBusinessList(String AcID) throws Exception {
//        ArrayList<Business> toReturn = new ArrayList<>();
//
//        try {
//            Cursor ab = getBusinessCursor();
//            String AccountID;
//            String BusinessID;
//            String BusinessName;
//            Address BusinessAddress;
//            String City,Country,Street;
//            String Email;
//            String Website;
//
//            for(ab.moveToFirst(); !ab.isAfterLast(); ab.moveToNext()) {
//                // The Cursor is now set to the right position
//                AccountID = ab.getString(ab.getColumnIndex(Business.ACCOUNTID));
//                BusinessID = ab.getString(ab.getColumnIndex(Business.ID));
//                BusinessName = ab.getString(ab.getColumnIndex(Business.NAME));
//                City = ab.getString(ab.getColumnIndex(Address.CITY));
//                Country = ab.getString(ab.getColumnIndex(Address.COUNTRY));
//                Street = ab.getString(ab.getColumnIndex(Address.STREET));
//                Email = ab.getString(ab.getColumnIndex(Business.EMAIL));
//                Website = ab.getString(ab.getColumnIndex(Business.WEBSITE));
//                BusinessAddress = new Address(Country,City,Street);
//                if(AccountID.equals(AcID))
//                    toReturn.add(new Business(AccountID,BusinessID,BusinessName,BusinessAddress,Email,Website));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toReturn;
//    }
//    //endregion
//    //region other functions
//    public Cursor getAttractionCursor(String BusinessID) throws Exception {
//        MatrixCursor attractionCursor = new MatrixCursor(
//                new String[]{Attraction.ID,Attraction.TYPE, Attraction.COUNTRY,
//                        Attraction.STARTDATE,Attraction.ENDDATE,Attraction.PRICE,Attraction.DESCRIPITION,Attraction.BUSINESSID,Attraction.NAME});
//        Cursor attractionlist = getAttractionCursor();
//        attractionlist.moveToFirst();
//        while (!attractionlist.isAfterLast()) {
//            String accountIdString = attractionlist.getString(7);
//            if(accountIdString.equals(BusinessID)){
//                attractionCursor.addRow(new Object[]{
//                        attractionlist.getString(0),
//                        attractionlist.getString(1),
//                        attractionlist.getString(2),
//                        attractionlist.getString(3),
//                        attractionlist.getString(4),
//                        attractionlist.getString(5),
//                        attractionlist.getString(6),
//                        attractionlist.getString(7),
//                        attractionlist.getString(8)
//                });
//            }
//            attractionlist.moveToNext();
//        }
//        return attractionCursor;
//
//
//    }
//    public Cursor CgetBusinessList(String AccountID) throws Exception {
//        MatrixCursor businescursor = new MatrixCursor(  new String[]{Business.ACCOUNTID,Business.ID,Business.NAME, Address.CITY,Address.COUNTRY,Address.STREET,
//                Business.EMAIL,Business.WEBSITE});
//        Cursor businessList = getBusinessCursor();
//        businessList.moveToFirst();
//        while (!businessList.isAfterLast()) {
//            String accountIdString = businessList.getString(0);
//            if(accountIdString.equals(AccountID)){
//                businescursor.addRow(new Object[]{
//                        businessList.getString(0),
//                        businessList.getString(1),
//                        businessList.getString(2),
//                        businessList.getString(3),
//                        businessList.getString(4),
//                        businessList.getString(5),
//                        businessList.getString(6),
//                        businessList.getString(7)
//                });
//            }
//            businessList.moveToNext();
//        }
//        return businescursor;
//    }
//    //endregion
//    //region Web Connection Functions
//    private static String GET(String url) throws Exception {
//        URL obj = new URL(url);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//        con.setRequestMethod("GET");
//        con.setDoOutput(true);
//        if (con.getResponseCode() == HttpURLConnection.HTTP_OK) { // success
//            BufferedReader in = new BufferedReader(new InputStreamReader(
//                    con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//
//            // print result
//            return response.toString();
//        } else {
//            return "";
//        }
//    }
//    private static String POST(String url, Map<String,Object> params) throws IOException {
//
//        //Convert Map<String,Object> into key=value&key=value pairs.
//        StringBuilder postData = new StringBuilder();
//        for (Map.Entry<String,Object> param : params.entrySet()) {
//            if (postData.length() != 0) postData.append('&');
//            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
//            postData.append('=');
//            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
//        }
//
//        URL obj = new URL(url);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//        con.setRequestMethod("POST");
//
//        // For POST only - START
//        con.setDoOutput(true);
//        OutputStream os = con.getOutputStream();
//        os.write(postData.toString().getBytes("UTF-8"));
//        os.flush();
//        os.close();
//        // For POST only - END
//
//        int responseCode = con.getResponseCode();
//        System.out.println("POST Response Code :: " + responseCode);
//
//        if (responseCode == HttpURLConnection.HTTP_OK) { //success
//            BufferedReader in = new BufferedReader(new InputStreamReader(
//                    con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//            return response.toString();
//        }
//        else return "";
//    }
//    //endregion
}


