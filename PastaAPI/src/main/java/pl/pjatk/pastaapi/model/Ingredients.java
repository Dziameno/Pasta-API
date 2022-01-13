package pl.pjatk.pastaapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ingredients", schema = "pastaapi", catalog = "")
public class Ingredients {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idIngredient")
    private int idIngredient;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "idCategory")
    private int idCategory;

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredients that = (Ingredients) o;
        return idIngredient == that.idIngredient && Objects.equals(name, that.name) && Objects.equals(idCategory, that.idCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIngredient, name, idCategory);
    }
}
