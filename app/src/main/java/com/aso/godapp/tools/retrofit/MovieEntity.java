package com.aso.godapp.tools.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MartinLin on 2016/9/9.
 */

public class MovieEntity {
    @SerializedName("title")
    private String title;

    @SerializedName("start")
    private int start;

    @SerializedName("total")
    private int total;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
