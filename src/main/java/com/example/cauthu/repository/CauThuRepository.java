package com.example.cauthu.repository;

import com.example.cauthu.entity.CauThu;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CauThuRepository implements ICauThuRepository{

    private static List<CauThu> cauthuList = new ArrayList<>();
    static {
        cauthuList.add(new CauThu(2, "Neymar",
                LocalDate.parse("2005-09-04"),
                "40 nam", "Tien dao","/duchieu.jpg"));
        cauthuList.add(new CauThu(2,"duchieu",LocalDate.parse("2004-07-07"),"20 nam","tien dao","/duchieu.jpg"));

    }
    @Override
    public List<CauThu> findAll() {
        return cauthuList;
    }
}
