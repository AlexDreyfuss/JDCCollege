package com.hackathon.jdccollege.SqlDatabase;

/**
 * Created by Arele-PC on 1/4/2017.
 */

public class FactoryDB {
    private static SqlDatabase instance = null;

    public static SqlDatabase getDatabase(){
        return getSQLDatabase();
    }
    private static SqlDatabase getSQLDatabase(){
        if (instance == null)
            instance = new SqlDatabase();
        return instance;
    }

}
