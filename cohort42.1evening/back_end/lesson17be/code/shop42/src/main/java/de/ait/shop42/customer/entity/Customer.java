package de.ait.shop42.customer.entity;

import de.ait.shop42.cart.entity.Cart;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="active")
    private boolean active;

    @OneToOne (mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", cart=" + cart +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
