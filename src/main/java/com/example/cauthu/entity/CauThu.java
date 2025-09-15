package com.example.cauthu.entity;

import java.awt.*;
import java.time.LocalDate;
import java.util.Locale;

public class CauThu {
    private  int MaCauThu;
    private String HoTen;
    private LocalDate NgaySinh;
    private String KinhNghiem ;
    private String Vitri ;
    private String Image;

    public CauThu(int maCauThu, String hoTen, LocalDate ngaySinh, String kinhNghiem, String vitri, String image) {
        MaCauThu = maCauThu;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        KinhNghiem = kinhNghiem;
        Vitri = vitri;
        Image = image;
    }

    public int getMaCauThu() {
        return MaCauThu;
    }

    public void setMaCauThu(int maCauThu) {
        MaCauThu = maCauThu;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        KinhNghiem = kinhNghiem;
    }

    public String getVitri() {
        return Vitri;
    }

    public void setVitri(String vitri) {
        Vitri = vitri;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
