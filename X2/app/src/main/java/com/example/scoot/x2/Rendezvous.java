package com.example.scoot.x2;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.lang.*;
import java.lang.reflect.ParameterizedType;

/**
 * Created by Scoot on 11/7/2015.
 */
public class Rendezvous implements Parcelable {
    private String name, description, date, location;
    private int ID = 0;
    public int objectID;

    public Rendezvous(String name, String description, String date, String location) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.location = location;
        this.objectID = ++ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getID() {
        return objectID;
    }

    public void setName(String na) {
        name = na;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setDate(String da) {
        date = da;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public void setObjectID(int o) {
        objectID = o;
    }


    public int describeContents() {
        return 0;
    }
    public Rendezvous(Parcel in)
    {
        String[] data = new String[4];
        in.readStringArray(data);
        this.name = data[0];
        this.description = data[1];
        this.date = data[2];
        this.location = data[3];
    }
    public void writeToParcel(Parcel out, int flags) {
        out.writeStringArray(new String[]{this.name,this.description,this.date,this.location});
        out.writeString(name);
        out.writeString(description);
        out.writeString(date);
        out.writeString(location);
    }

    public static final Parcelable.Creator<Rendezvous> CREATOR = new Parcelable.Creator()
    {
        public Rendezvous createFromParcel(Parcel in)
        {
            return new Rendezvous(in);
        }

        public Rendezvous[] newArray(int size)
        {
            return new Rendezvous[size];
        }
    };
}
  /*  public Rendezvous(Parcel in)
    {
        name = in.readString();
        description = in.readString();
        date = in.readString();
        location = in.readString();
    } */
    //create an object of the data
    /*public Rendezvous (String name, String description, String date, String location)
    {
        this.name = name;
        this.description = description;
        this.date = date;
        this.location = location;
    }*/

