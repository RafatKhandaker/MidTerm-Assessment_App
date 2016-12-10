package com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by RedDragon on 12/10/16.
 */

public class Data {

    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("anchorStr")
    @Expose
    private String anchorStr;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;
    @SerializedName("previousPage")
    @Expose
    private Object previousPage;
    @SerializedName("backAnchor")
    @Expose
    private String backAnchor;
    @SerializedName("anchor")
    @Expose
    private long anchor;
    @SerializedName("nextPage")
    @Expose
    private long nextPage;
    @SerializedName("size")
    @Expose
    private long size;

    /**
     * @return The count
     */
    public long getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * @return The anchorStr
     */
    public String getAnchorStr() {
        return anchorStr;
    }

    /**
     * @param anchorStr The anchorStr
     */
    public void setAnchorStr(String anchorStr) {
        this.anchorStr = anchorStr;
    }

    /**
     * @return The records
     */
    public List<Record> getRecords() {
        return records;
    }

    /**
     * @param records The records
     */
    public void setRecords(List<Record> records) {
        this.records = records;
    }

    /**
     * @return The previousPage
     */
    public Object getPreviousPage() {
        return previousPage;
    }

    /**
     * @param previousPage The previousPage
     */
    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    /**
     * @return The backAnchor
     */
    public String getBackAnchor() {
        return backAnchor;
    }

    /**
     * @param backAnchor The backAnchor
     */
    public void setBackAnchor(String backAnchor) {
        this.backAnchor = backAnchor;
    }

    /**
     * @return The anchor
     */
    public long getAnchor() {
        return anchor;
    }

    /**
     * @param anchor The anchor
     */
    public void setAnchor(long anchor) {
        this.anchor = anchor;
    }

    /**
     * @return The nextPage
     */
    public long getNextPage() {
        return nextPage;
    }

    /**
     * @param nextPage The nextPage
     */
    public void setNextPage(long nextPage) {
        this.nextPage = nextPage;
    }

    /**
     * @return The size
     */
    public long getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(long size) {
        this.size = size;
    }
}