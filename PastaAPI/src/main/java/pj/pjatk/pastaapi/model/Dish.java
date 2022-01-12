package pj.pjatk.pastaapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dish {

    @Id
    private int dishId;
    private String name;
    private String time;
    private float rating;
    private String preparation;


    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public Dish() {
        super();
    }

    public Dish(String name, String time, float rating, String preparation) {
        this.name = name;
        this.time = time;
        this.rating = rating;
        this.preparation = preparation;
    }

}
