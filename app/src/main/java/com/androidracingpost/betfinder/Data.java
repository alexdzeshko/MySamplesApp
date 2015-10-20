
package com.androidracingpost.betfinder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @SerializedName("bets")
    @Expose
    private List<Bet> bets = new ArrayList<Bet>();
    @SerializedName("version")
    @Expose
    private String version;

    /**
     * 
     * @return
     *     The bets
     */
    public List<Bet> getBets() {
        return bets;
    }

    /**
     * 
     * @param bets
     *     The bets
     */
    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

}
