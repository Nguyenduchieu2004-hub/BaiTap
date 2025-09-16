package com.example.cauthu.repository;

import com.example.cauthu.entity.CauThu;

import java.util.List;

public interface ICauThuRepository {
    List<CauThu> findAll();
    CauThu findById(int id);
    Boolean addCauThu(CauThu cauThu);
    void deleteCauThu(int id);

}
