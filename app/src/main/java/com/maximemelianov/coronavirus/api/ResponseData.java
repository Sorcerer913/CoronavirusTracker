package com.maximemelianov.coronavirus.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.maximemelianov.coronavirus.model.CountryData;

import java.util.List;

public class ResponseData {

    @SerializedName("countrydata")
    @Expose
    private List<CountryData> countrydata = null;
    @SerializedName("stat")
    @Expose
    private String stat;

    public List<CountryData> getCountrydata() {
        return countrydata;
    }

    public void setCountrydata(List<CountryData> countrydata) {
        this.countrydata = countrydata;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(countrydata).append(stat).toString();
    }

}
