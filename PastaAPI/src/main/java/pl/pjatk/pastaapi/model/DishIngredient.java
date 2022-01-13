package pl.pjatk.pastaapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dish_ingredient", schema = "pastaapi", catalog = "")
public class DishIngredient {
    @Id
    @Column(name = "idDish")
    private int idDish;
    @Basic
    @Column(name = "idIngredient")
    private int idIngredient;
    @Basic
    @Column(name = "amount")
    private String amount;

    public int getIdDish() {
        return idDish;
    }

    public void setIdDish(int idDish) {
        this.idDish = idDish;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishIngredient that = (DishIngredient) o;
        return idDish == that.idDish && idIngredient == that.idIngredient && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDish, idIngredient, amount);
    }
}
