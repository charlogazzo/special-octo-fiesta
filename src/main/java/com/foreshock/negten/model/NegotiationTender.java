package com.foreshock.negten.model;

import jakarta.persistence.Id;

public class NegotiationTender {
    @Id
    private Long id;
    private String store;
    private String Negotiator;
    private Boolean recurring;
    private Product product;
    private ProductSupplier supplier;
}
