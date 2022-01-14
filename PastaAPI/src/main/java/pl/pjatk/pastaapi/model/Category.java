package pl.pjatk.pastaapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCategory")
    private Long idCategory;
    @Basic
    @Column(name = "name")
    private String name;

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return idCategory == category.idCategory && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategory, name);
    }
}
