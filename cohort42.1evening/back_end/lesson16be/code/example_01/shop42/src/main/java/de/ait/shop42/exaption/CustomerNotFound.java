package de.ait.shop42.exaption;

public class CustomerNotFound extends RuntimeException {
    public CustomerNotFound(String message) {
        super(message);
    }
}

