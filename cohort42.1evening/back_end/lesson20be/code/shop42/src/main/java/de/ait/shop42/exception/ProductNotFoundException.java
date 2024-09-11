package de.ait.shop42.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT, reason = "Product not found")
public class ProductNotFoundException extends RuntimeException {
    private ApiError apiError;

    public ProductNotFoundException(ApiError apiError) {
        this.apiError = apiError;
    }
}
