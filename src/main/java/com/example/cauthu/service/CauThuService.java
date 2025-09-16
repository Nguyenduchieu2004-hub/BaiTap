package com.example.cauthu.service;

import com.example.cauthu.entity.CauThu;
import com.example.cauthu.repository.CauThuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauThuService implements ICauThuService {
    @Autowired
    private CauThuRepository cauThuRepository;
    @Override
    public List<CauThu> findAll() {
        return cauThuRepository.findAll();
    }

    @Override
    public CauThu findById(int id) {
        return cauThuRepository.findById(id);
    }

    @Override
    public Boolean addCauThu(CauThu cauThu) {
        return cauThuRepository.addCauThu(cauThu);
    }

    @Override
    public void deleteCauThu(int id) {
    cauThuRepository.deleteCauThu(id);
    }
}
