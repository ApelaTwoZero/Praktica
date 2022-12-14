package com.example.test.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.parser.Parser;
import java.io.IOException;

@Controller
public class TestController {
    @GetMapping("/")
    public String greeting(@RequestParam(value = "one",  required = false, defaultValue = "1") String a,@RequestParam(value = "two",  required = false, defaultValue = "+") String b,@RequestParam(value = "three",  required = false, defaultValue = "0") String c, Model model) {
        double res;
        String StrRes = "Ошибочка";
        try {
            if (b.equals("+")) {
                res = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("num", res);
            }
            if (b.equals("-")) {
                res = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("num", res);
            }
            if (b.equals("/") && !c.equals("0")) {
                res = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("num", res);
            }
            if (b.equals("*")) {
                res = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("num", res);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("num", StrRes);
        }
        return "One";
    }
    @GetMapping("/two")
    public String two(@RequestParam(value = "one", required = false, defaultValue = "Null123") String a, Model model) {
        model.addAttribute("num", a);
        return "Two";
    }
    @GetMapping("/two2")
    public String one_v2(@RequestParam(value = "one", required = false, defaultValue = "Null123") String a, Model model) {
        model.addAttribute("num", a);
        return "One_v2";
    }



    @PostMapping("/two")
    public String two2(@RequestParam(value = "one",  required = false, defaultValue = "Null123") String a,@RequestParam(value = "two",  required = false, defaultValue = "Null123") String b,@RequestParam(value = "three",  required = false, defaultValue = "Null123") String c, Model model) {
        double res;
        String StrRes = "Ошибочка";
        try {
            if (b.equals("+")) {
                res = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("num", res);
            }
            if (b.equals("-")) {
                res = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("num", res);
            }
            if (b.equals("/") && !c.equals("0")) {
                res = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("num", res);
            }
            if (b.equals("*")) {
                res = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("num", res);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("num", StrRes);
        }
        return "Two";
    }
}


