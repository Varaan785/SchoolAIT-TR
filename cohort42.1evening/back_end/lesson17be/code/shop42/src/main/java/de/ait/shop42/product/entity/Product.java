package de.ait.shop42.product.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter



@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "active")
    private boolean active;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
