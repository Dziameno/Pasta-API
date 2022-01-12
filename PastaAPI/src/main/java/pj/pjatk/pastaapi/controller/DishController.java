package pj.pjatk.pastaapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class DishController {

    @RequestMapping(value = "/dish")
    public String Hello(Model model) {
        return "dishes";
    }

}
