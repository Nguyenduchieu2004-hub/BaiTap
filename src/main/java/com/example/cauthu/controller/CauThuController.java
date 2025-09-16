package com.example.cauthu.controller;

import com.example.cauthu.entity.CauThu;
import com.example.cauthu.service.ICauThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@RequestMapping("/Cauthu") // ánh xạ đường dẫn
public class CauThuController {
    @Autowired
    private ICauThuService cauThuService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("cauthu/List");
        modelAndView.addObject("cauthuList", cauThuService.findAll());
        return modelAndView;
    }
    @GetMapping("/add")
    public String showFormAdd(){
        return "cauthu/add";
    }
    @PostMapping("/add")
    public String saveCauThu(  @RequestParam("MaCauThu") int MaCauThu,
                               @RequestParam("HoTen") String HoTen,
                               @RequestParam("NgaySinh") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate NgaySinh,
                               @RequestParam("KinhNghiem") String KinhNghiem,
                               @RequestParam("Vitri") String Vitri,
                               @RequestParam("Image") String Image,
                             RedirectAttributes redirectAttributes
                             ){
    cauThuService.addCauThu(new CauThu(MaCauThu,HoTen,NgaySinh,KinhNghiem,Vitri,Image));
    redirectAttributes.addFlashAttribute("mess","add success");
    return "redirect:/Cauthu";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam(name = "id", required = false, defaultValue = "1") int id,
                         Model model) {
        CauThu cauThu = cauThuService.findById(id);
        model.addAttribute("cauthu", cauThu);
        return "cauthu/detail"; // trả về file detail.jsp
    }

    @GetMapping("/detail/{id:[0-9]+}")
    public String detail2(@PathVariable(name = "id") int id,
                          Model model) {
        CauThu cauThu = cauThuService.findById(id);
        model.addAttribute("cauthu", cauThu);
        return "cauthu/detail";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int MaCauThu ,
                         RedirectAttributes redirectAttributes) {
        cauThuService.deleteCauThu(MaCauThu);
        redirectAttributes.addFlashAttribute("mess", "Xóa cầu thủ thành công!");
        return "redirect:/Cauthu";
    }
}
