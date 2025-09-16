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
                "40 nam", "Tien dao","/images/duchieu.jpg"));
        cauthuList.add(new CauThu(2,"duchieu",LocalDate.parse("2004-07-07"),"20 nam","tien dao","/images/img.png"));

    }
    @Override
    public List<CauThu> findAll() {
        return cauthuList;
    }

    @Override
    public CauThu findById(int id) {
        for(CauThu cauThu : cauthuList) {
            if(id == cauThu.getMaCauThu()){
                return cauThu;
            }
        }
        return null;
    }



    @Override
    public Boolean addCauThu(CauThu cauThu) {
        return CauThuRepository.cauthuList.add(cauThu);
    }

    @Override
    public void deleteCauThu(int id) {
        cauthuList.removeIf(c -> c.getMaCauThu() == id);
    }

}
