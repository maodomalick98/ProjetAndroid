package com.example.projetandroid1;

import org.json.JSONObject;

public class CategoriesData {

    private String category_id;
    private String title;
    private String products_url;

    public CategoriesData(JSONObject o){
        category_id=o.optString("category_id","");
        title=o.optString("title","");
        products_url=o.optString("products_url","");

    }

    public String getCat() {
        return category_id;
    }

    public void setCat(String cat) {
        this.category_id = cat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducts() {
        return products_url;
    }

    public void setProducts(String url) {
        this.products_url = url;
    }
}
