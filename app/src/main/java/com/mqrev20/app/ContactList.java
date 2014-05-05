package com.mqrev20.app;


/**
 * Created by Staszek on 2014-05-05.
 */
public class ContactList {





    private String _questname, _name, _email, _adress1, _adress2;

    public ContactList (String questname, String name, String email, String adress1, String adress2) {
        _questname = questname;
        _name = name;
        _email = email;
        _adress1 = adress1;
        _adress2 = adress2;

    }

    public String getQuestname () {
        return _questname;
    }
    public String getName () {
        return _name;
    }
    public String getEmail () {
        return _email;
    }
    public String getAdress1 () {
        return _adress1;
    }
    public String getAdress2 () {
        return _adress2;
    }
}