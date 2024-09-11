package de.ait.shop42.product.controller;


import de.ait.shop42.exception.ProductNotFoundException;
import de.ait.shop42.product.dto.ProductRequestDTO;
import de.ait.shop42.product.dto.ProductResponseDTO;
import de.ait.shop42.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    //    /products
    //    /products?active=true
    @GetMapping("/products")
    public ResponseEntity<List<ProductResponseDTO>> getProducts(@RequestParam(name="active", required = false ) Boolean active){
        return new ResponseEntity<>(service.createNewProduct(dto), HttpStatus.OK);

    }

    @PostMapping("/products")
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO dto){
        return new ResponseEntity<>(service.createNewProduct(dto), HttpStatus.CREATED);
    }

    // PUT /products/23  + body
    @PutMapping("/products/{id}")
    public ProductResponseDTO updateProduct(@PathVariable(name="id") Long id,
                                            @RequestBody ProductRequestDTO dto){
        return service.updateProduct(id,dto);
    }


    //PATCH /products/23?active=true
    //PATCH /products/23?active=false

    @PatchMapping("/products/{id}")
    public ProductResponseDTO setProductActiveStatus(@RequestParam(name="active", defaultValue = "true") boolean active,
                                                     @PathVariable(name="id") Long id){
        return service.setActiveStatus(id, active);
    }


    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponseDTO> getById(@PathVariable (name="id") Long id){
        try {
            return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
        } catch (ProductNotFoundException e) {

                    return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }




    //PUT /products/23/active
    //PUT /products/23/not-active


}