package pl.pjatk.pastaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.pastaapi.model.Dish;
import pl.pjatk.pastaapi.service.DishService;


@RestController
public class DishController {
    DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/dishes")
    public String index(Model model){
        model.addAttribute("dishes", dishService.getDishesFromRepo());

        return "index";
    }

    @GetMapping("/dish/{id}")
    public ResponseEntity<Dish> getDish(@PathVariable long id) {
        Dish dish = dishService.getDishFromRepo(id);

        return new ResponseEntity<>(dish, HttpStatus.OK);
    }
}
