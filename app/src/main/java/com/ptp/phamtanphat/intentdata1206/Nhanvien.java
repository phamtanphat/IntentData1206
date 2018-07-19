package com.ptp.phamtanphat.intentdata1206;

import java.io.Serializable;

public class Nhanvien implements Serializable{
    private String ten;
    private String tuoi;

    public Nhanvien(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
}
