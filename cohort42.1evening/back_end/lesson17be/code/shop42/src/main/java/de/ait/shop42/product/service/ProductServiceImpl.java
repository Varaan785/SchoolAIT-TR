package de.ait.shop42.product.service;

import de.ait.shop42.product.dto.ProductRequestDTO;
import de.ait.shop42.product.dto.ProductResponseDTO;
import de.ait.shop42.product.entity.Product;
import de.ait.shop42.product.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.nio.file.ProviderNotFoundException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        return repository.findAll().stream()
                .map(p->mapper.map(p, ProductResponseDTO.class))
                .toList();
    }
    @Override
    public ProductResponseDTO createNewProduct(ProductRequestDTO dto) {
        //dto -> product
        Product entity = mapper.map(dto, Product.class);
        entity = repository.save(entity);
        // entity -> dto
        return mapper.map(entity, ProductResponseDTO.class);
    }

    @Override
    @Transactional
    public ProductResponseDTO updateProduct(Long id, ProductRequestDTO dto) {
        Product entity = mapper.map(dto, Product.class);
        entity.setId(id);
        repository.save(entity);

        return mapper.map(entity, ProductResponseDTO.class);  // entity -> dto
    }

    @Override
    public ProductResponseDTO setAtctiveStatus(boolean active) {
        return null;
    }


    @Override
    @Transactional
    public ProductResponseDTO setAtctiveStatus(Long id, boolean active) {
        String exceptionMsg = "Change active status fail id %d not found";
       Product productEntity = repository.findById(id)
               .orElseThrow(()->new ProviderNotFoundException(String.format(exceptionMsg, id)));

       productEntity.setActive(active);

       return mapper.map(productEntity, ProductResponseDTO.class);
    }

    @Override
    public List<ProductResponseDTO> getProducts(Boolean active) {
        if (active==null) {
            return getAllProducts();
        } else {
            List<Product> productByActive = repository.findByActive(active);
            return productByActive.stream().map(product->mapper.map(product, ProductResponseDTO.class))
                    .toList();
        }
    }


}
