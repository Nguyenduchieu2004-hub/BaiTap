package com.example.cauthu.repository;

import com.example.cauthu.entity.CauThu;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CauThuRepository implements ICauThuRepository {

    private static final List<CauThu> cauthuList = new ArrayList<>();

    static {
        cauthuList.add(new CauThu(1, "Neymar",
                LocalDate.parse("2005-09-04"),
                "40 nam", "Tien dao",
                "/images/duchieu.jpg", true, Arrays.asList("Chiến thuật", "Thể lực", "Kỹ năng phòng ngự & tấn công")));

        cauthuList.add(new CauThu(2, "duchieu",
                LocalDate.parse("2004-07-07"), "20 nam", "tien dao",
                "/images/img.png", true, Arrays.asList("Chiến thuật", "Thể lực", "Kỹ năng phòng ngự & tấn công")));

    }

    @Override
    public List<CauThu> findAll() {
        return cauthuList;
    }

    @Override
    public CauThu findById(int id) {
        for (CauThu cauThu : cauthuList) {
            if (id == cauThu.getMaCauThu()) {
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

    @Override
    public void updateCauThu(CauThu cauThu) {
        for (int i = 0; i < cauthuList.size(); i++) {
            if (cauthuList.get(i).getMaCauThu() == cauThu.getMaCauThu()) {
                cauthuList.set(i, cauThu);
                return;
            }
        }
    }
}
