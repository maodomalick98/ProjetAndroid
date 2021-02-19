package com.example.projetandroid1;

import org.json.JSONObject;

public class Students {

        private String name;
        private String email;
        private String url;
        private String name2;
        private String Groupe;

        public Students(JSONObject o){
            name=o.optString("name","");
            name2 = o.optString("name2","");
            email=o.optString("email","");
            url=o.optString("picture_url","");
            Groupe = o.optString("Groupe","");

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
    public String getGroupe() {
        return Groupe;
    }

        public String getEmail() {
            return email;
        }

    public void setGroupe(String groupe) {
        this.Groupe = groupe;
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


}

