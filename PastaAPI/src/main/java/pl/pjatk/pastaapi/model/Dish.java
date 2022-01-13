package pl.pjatk.pastaapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dish", schema = "pastaapi", catalog = "")
public class Dish {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "time")
    private String time;
    @Basic
    @Column(name = "rating")
    private String rating;
    @Basic
    @Column(name = "preparation")
    private String preparation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish that = (Dish) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(time, that.time) && Objects.equals(rating, that.rating) && Objects.equals(preparation, that.preparation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, rating, preparation);
    }
}
