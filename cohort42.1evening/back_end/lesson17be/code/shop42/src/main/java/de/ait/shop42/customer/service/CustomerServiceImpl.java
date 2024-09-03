package de.ait.shop42.customer.service;


import de.ait.shop42.cart.entity.Cart;
import de.ait.shop42.customer.dto.CustomerRequestDto;
import de.ait.shop42.customer.dto.CustomerResponseDto;
import de.ait.shop42.customer.entity.Customer;
import de.ait.shop42.customer.repository.CustomerRepository;
import de.ait.shop42.exaption.CustomerNotFound;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepository repository;
   private final ModelMapper mapper;

    @Override
    public CustomerResponseDto addProductToCart(Long customerId, Long productId) throws CustomerNotFound {
        Customer customer = findCustomer(customerId);
        return null;
    }

    @Override
    public CustomerResponseDto createCustomer(CustomerRequestDto dto) {
        Customer entity = mapper.map(dto, Customer.class);
        entity.setActive(true);
        Cart cart = new Cart();

        entity.setCart(cart);             //verbunden customer -  cart
        cart.setCustomer(entity);

        entity = repository.save(entity);

        return mapper.map(entity, CustomerResponseDto.class);
    }

    @Override
    public List<CustomerResponseDto> getCustomers() {
        return repository.findAll().stream().map(e-> mapper.map(e, CustomerResponseDto.class)).toList();
    }



    @Override
    public CustomerResponseDto removeProductToCart(Long customerId, Long productId) {
        return null;
    }

    @Override
    public CustomerResponseDto changeStatus(Long id, boolean active) {
        return null;
    }

    @Override
    public CustomerResponseDto getCustomerById(Long id) throws CustomerNotFound {
        Customer customer = findCustomer(id);
        return mapper.map(customer, CustomerResponseDto.class);
    }

    private Customer findCustomer(Long id) throws CustomerNotFound {
        Customer customer = repository.findById(id)
                .orElseThrow(()-> new CustomerNotFound("Customer id: "+ id + " not found"));
        return customer;
    }
}
