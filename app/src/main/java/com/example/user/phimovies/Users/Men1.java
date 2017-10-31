package com.example.user.phimovies.Users;

import android.net.Uri;

import java.net.URI;

/**
 * Created by User on 30.10.2017.
 */

public class Men1 {
    protected String firstname;
    protected String lastname;
    protected String photo;
    public void setFirstname (String fname)
    {
        firstname = fname;
    }
    public void setLastname (String lname)
    {
        lastname = lname;
    }
    public String getFirstname ()
    {
        return firstname;
    }
    public String getLastname ()
    {
        return lastname;
    }
    public void setPhoto (String sphoto)
    {
        photo = sphoto;
    }
    public Uri getPhoto ()
    {
        return Uri.parse(photo);
    }
    public Men1 ()
    {
    }
}
