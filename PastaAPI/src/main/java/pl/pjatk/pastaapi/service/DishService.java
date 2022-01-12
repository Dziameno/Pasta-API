package pl.pjatk.pastaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pjatk.pastaapi.exception.DishNotFoundException;
import pl.pjatk.pastaapi.model.Dish;
import pl.pjatk.pastaapi.repository.DishRespository;

import java.util.List;


@Component
public class DishService {
    DishRespository dishRespository;

    @Autowired
    public DishService(DishRespository dishRespository){
        this.dishRespository = dishRespository;
    }

    public Dish getDishFromRepo(long id) {
        Dish dish = dishRespository.findById(id);

        if(dish == null) {
            throw new DishNotFoundException();
        }

        return dish;
    }

    public List<Dish> getDishesFromRepo() {
        List<Dish> dishes = dishRespository.findAll();

        return dishes;
    }

}
