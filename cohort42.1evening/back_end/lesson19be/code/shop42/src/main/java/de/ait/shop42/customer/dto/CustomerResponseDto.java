package de.ait.shop42.customer.dto;

import de.ait.shop42.cart.dto.CartResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CustomerResponseDto {



    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public class customerResponseDto {
        private Long id;
        private String name;
        private  boolean active;
        private CartResponseDto cart;


    }
}
