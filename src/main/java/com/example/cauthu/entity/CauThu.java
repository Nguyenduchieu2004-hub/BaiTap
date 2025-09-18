package com.example.cauthu.entity;

import java.time.LocalDate;
import java.util.List;

public class CauThu {
    private int maCauThu;
    private String hoTen;
    private LocalDate ngaySinh;
    private String kinhNghiem;
    private String viTri;
    private String image;
    private boolean gender;
    private List<String> subjects;

    public CauThu() {
    }

    public CauThu(int maCauThu, String hoTen, LocalDate ngaySinh, String kinhNghiem,
                  String viTri, String image, boolean gender, List<String> subjects) {
        this.maCauThu = maCauThu;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.kinhNghiem = kinhNghiem;
        this.viTri = viTri;
        this.image = image;
        this.gender = gender;
        this.subjects = subjects;
    }

    public int getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(int maCauThu) {
        this.maCauThu = maCauThu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
