package com.example.projetandroid1;

import org.json.JSONObject;

public class Students {

    private String name;
    private String name2;
    private String email;
    private String groupe;
    private String url;

    public Students(JSONObject o){
        name=o.optString("name","");
        email=o.optString("email","");
        url=o.optString("picture_url","");
        name2 = o.optString("name2","");
        groupe = o.optString("Groupe","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name) {
        this.name2 = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }
    public String getGroupe() {
        return groupe;
    }

}

