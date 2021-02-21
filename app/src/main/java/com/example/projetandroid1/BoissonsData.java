package com.example.projetandroid1;

import org.json.JSONObject;

public class BoissonsData {

    private String name;
    private String description;
    private String picture_url;

    public BoissonsData(JSONObject o){
        name=o.optString("name","");
        description=o.optString("description","");
        picture_url=o.optString("picture_url","");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return description;
    }

    public void setDes(String des) {
        this.description = des;
    }

    public String getPict() {
        return picture_url;
    }

    public void setPict(String pict) {
        this.picture_url = pict;
    }
}
