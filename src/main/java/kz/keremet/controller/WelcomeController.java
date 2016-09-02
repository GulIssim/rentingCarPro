package kz.keremet.controller;

/**
 * Created by HP on 31.08.2016.
 */
import java.util.Date;
import java.util.Map;

import kz.keremet.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @Autowired
    private CarService carService;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", carService.getAllCars().get(0).getModel_id());
        return "welcome";
    }
    /*@RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }*/

}