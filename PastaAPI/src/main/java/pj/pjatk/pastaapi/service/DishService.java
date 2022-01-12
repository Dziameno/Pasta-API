package pj.pjatk.pastaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pj.pjatk.pastaapi.model.Dish;

import java.util.List;

@Service
public class DishService implements DishServiceInterface {
    @Autowired
    private DishServiceInterface dishServiceInterface;
    @Override
    public List<Dish> findAll() {
        return (List<Dish>) dishServiceInterface.findAll();
    }
}
