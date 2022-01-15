package pl.pjatk.pastaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.pastaapi.model.Dish;
import pl.pjatk.pastaapi.projection.DishProjection;
import pl.pjatk.pastaapi.service.DishService;

import java.util.List;

@RestController
public class DishController {
    DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/dishes")
    public List<Dish> dishes(){
        return dishService.getDishesFromRepo();
    }

    @GetMapping("/dish/{id}")
    public ResponseEntity<List<DishProjection>> getDish(@PathVariable long id) {
        return dishService.getDishFromRepo(id);
    }

    @GetMapping("/vege")
    public List<Dish> vegeDishes() {
        return  dishService.getDishesWithoutCategoryRepo(2);
    }

    @GetMapping("/noodles")
    public List<DishProjection> noodles() {
        return  dishService.getDishesWithCategoryRepo(1);
    }


}
