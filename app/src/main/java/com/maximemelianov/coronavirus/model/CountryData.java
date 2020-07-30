package com.maximemelianov.coronavirus.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryData {

    @SerializedName("total_cases")
    @Expose
    private Integer totalCases;
    @SerializedName("total_recovered")
    @Expose
    private Integer totalRecovered;
    @SerializedName("total_unresolved")
    @Expose
    private Integer totalUnresolved;
    @SerializedName("total_deaths")
    @Expose
    private Integer totalDeaths;
    @SerializedName("total_new_cases_today")
    @Expose
    private Integer totalNewCasesToday;
    @SerializedName("total_new_deaths_today")
    @Expose
    private Integer totalNewDeathsToday;
    @SerializedName("total_active_cases")
    @Expose
    private Integer totalActiveCases;
    @SerializedName("total_serious_cases")
    @Expose
    private Integer totalSeriousCases;
    @SerializedName("total_danger_rank")
    @Expose
    private Integer totalDangerRank;

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getTotalUnresolved() {
        return totalUnresolved;
    }

    public void setTotalUnresolved(Integer totalUnresolved) {
        this.totalUnresolved = totalUnresolved;
    }

    public Integer getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Integer totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Integer getTotalNewCasesToday() {
        return totalNewCasesToday;
    }

    public void setTotalNewCasesToday(Integer totalNewCasesToday) {
        this.totalNewCasesToday = totalNewCasesToday;
    }

    public Integer getTotalNewDeathsToday() {
        return totalNewDeathsToday;
    }

    public void setTotalNewDeathsToday(Integer totalNewDeathsToday) {
        this.totalNewDeathsToday = totalNewDeathsToday;
    }

    public Integer getTotalActiveCases() {
        return totalActiveCases;
    }

    public void setTotalActiveCases(Integer totalActiveCases) {
        this.totalActiveCases = totalActiveCases;
    }

    public Integer getTotalSeriousCases() {
        return totalSeriousCases;
    }

    public void setTotalSeriousCases(Integer totalSeriousCases) {
        this.totalSeriousCases = totalSeriousCases;
    }

    public Integer getTotalDangerRank() {
        return totalDangerRank;
    }

    public void setTotalDangerRank(Integer totalDangerRank) {
        this.totalDangerRank = totalDangerRank;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("totalCases: " + totalCases + "\n")
                .append("totalRecovered: " + totalRecovered + "\n")
                .append("totalUnresolved: " + totalUnresolved + "\n")
                .append("totalDeaths: " + totalDeaths + "\n")
                .append("totalNewCasesToday: " + totalNewCasesToday + "\n")
                .append("totalNewDeathsToday: " + totalNewDeathsToday + "\n")
                .append("totalActiveCases: " + totalActiveCases + "\n")
                .append("totalSeriousCases: " + totalSeriousCases + "\n")
                .append("totalDangerRank: " + totalDangerRank + "\n").toString();
    }

}