package com.example.eatclean;

public class MonAn {
    Integer anh;
    String ten;
    String mota;
    String ctiet;

    public MonAn(Integer anh, String ten, String mota, String ctiet) {
        this.anh = anh;
        this.ten = ten;
        this.mota = mota;
        this.ctiet = ctiet;
    }
    public MonAn(){}

    public Integer getAnh() {
        return anh;
    }

    public void setAnh(Integer anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getCtiet() {
        return ctiet;
    }

    public void setCtiet(String ctiet) {
        this.ctiet = ctiet;
    }
}
