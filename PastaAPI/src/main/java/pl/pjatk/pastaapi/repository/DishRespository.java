package pl.pjatk.pastaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.pjatk.pastaapi.model.Dish;
import pl.pjatk.pastaapi.projection.DishProjection;

import java.util.List;

@Repository
public interface DishRespository extends JpaRepository<Dish, Long> {
//    @Query( value = " SELECT * FROM dish ",nativeQuery = true)

    @Query( value = " SELECT dish.id, dish.name, dish.time, dish.rating, "+
            " dish.preparation, ingredients.name as 'iname', dish_ingredient.amount FROM dish " +
            " LEFT JOIN dish_ingredient on dish.id = dish_ingredient.idDish " +
            " LEFT JOIN ingredients on dish_ingredient.idIngredient = ingredients.idIngredient " +
            " WHERE dish.id = :id ",nativeQuery = true)
//    @Query(value = " SELECT d.id, d.name, i.name as iname, d.preparation, e.amount  FROM Dish d "
//            + " JOIN Ingredients i, DishIngredient e WHERE d.id = ?1 ")
    List<DishProjection> findById(@Param("id") long id);
    List<Dish> findAll();
}
