package de.ait.shop42.customer.service;

import de.ait.shop42.customer.dto.CustomerRequestDTO;
import de.ait.shop42.customer.dto.CustomerResponseDto;
import de.ait.shop42.exception.CustomerNotFound;

import java.util.List;

public interface CustomerService {
    CustomerResponseDto createCustomer(CustomerRequestDTO dto);
    List<CustomerResponseDto> getCustomers();
    CustomerResponseDto getCustomerById(Long id) throws CustomerNotFound;
    CustomerResponseDto addProductToCart(Long customerId, Long productId) throws CustomerNotFound;
    CustomerResponseDto removeProductFromCart(Long customerId, Long productId);
    CustomerResponseDto changeStatus(Long id, boolean active);
}

