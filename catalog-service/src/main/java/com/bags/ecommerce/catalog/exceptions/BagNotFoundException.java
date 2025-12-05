package com.bags.ecommerce.catalog.exceptions;

public class BagNotFoundException extends RuntimeException {
    public BagNotFoundException(String message) {
        super(message);
    }
}
