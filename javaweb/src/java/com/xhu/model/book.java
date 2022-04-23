package com.xhu.model;
public class book {
    private int bid;
    private String bname;
    private String bauthor;
    private String bpublish;
    private float bprice;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBpublish() {
        return bpublish;
    }

    public void setBpublish(String bpublish) {
        this.bpublish = bpublish;
    }

    public float getBprice() {
        return bprice;
    }

    public void setBprice(float bprice) {
        this.bprice = bprice;
    }
    @Override
    public String toString() {
        return "Bookinfo{" + "bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bpublish=" + bpublish + ", bprice=" + bprice + '}';
    }  
}
