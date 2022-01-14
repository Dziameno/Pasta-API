package pl.pjatk.pastaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import pl.pjatk.pastaapi.exception.DishNotFoundException;
import pl.pjatk.pastaapi.model.Dish;
import pl.pjatk.pastaapi.projection.DishProjection;
import pl.pjatk.pastaapi.repository.DishRespository;

import java.util.List;

@Component
public class DishService {
    DishRespository dishRespository;

    @Autowired
    public DishService(DishRespository dishRespository){
        this.dishRespository = dishRespository;
    }

    public ResponseEntity<List<DishProjection>> getDishFromRepo(long id) {
        List<DishProjection> dish = dishRespository.findById(id);
        if(dish == null) {
            throw new DishNotFoundException();
        }

        return new ResponseEntity<>(dish, HttpStatus.OK);
    }

    public List<Dish> getDishesFromRepo() {
        List<Dish> dishes = dishRespository.findAll();

        return dishes;
    }

}
