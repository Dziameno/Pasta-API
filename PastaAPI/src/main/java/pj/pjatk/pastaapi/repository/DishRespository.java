package pj.pjatk.pastaapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pj.pjatk.pastaapi.model.Dish;

@Repository
public interface DishRespository extends CrudRepository<Dish, Long> {

}
