package pl.pjatk.pastaapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.pastaapi.model.Dish;

import java.util.List;

@Repository
public interface DishRespository extends CrudRepository<Dish, Long> {
    Dish findById(long id);
    List<Dish> findAll();
}
