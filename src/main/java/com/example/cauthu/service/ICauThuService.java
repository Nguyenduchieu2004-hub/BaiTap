package com.example.cauthu.service;

import com.example.cauthu.entity.CauThu;

import java.util.List;

public interface ICauThuService {
    List<CauThu> findAll();
    CauThu findById(int id);
    Boolean addCauThu(CauThu cauThu);
    void deleteCauThu(int id);
}
