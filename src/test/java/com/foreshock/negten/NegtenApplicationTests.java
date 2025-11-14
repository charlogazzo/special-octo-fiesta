package com.foreshock.negten;

import com.foreshock.negten.model.NegotiationTender;
import com.foreshock.negten.model.Product;
import com.foreshock.negten.model.ProductSupplier;
import com.foreshock.negten.repository.NegotiationTenderRepository;
import com.foreshock.negten.repository.NegotiatorRepository;
import com.foreshock.negten.repository.ProductRepository;
import com.foreshock.negten.repository.ProductSupplierRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class NegtenApplicationTests {

    NegotiationTenderRepository negTenRepository;
    ProductSupplierRepository prodSupRepository;
    ProductRepository productRepository;
    NegotiatorRepository negotiatorRepository;

	@Test
	void contextLoads() {
	}

    @Test
    void testGetNegotiationTender() {
        long negotiationId = 1;
        Optional<NegotiationTender> tender = negTenRepository.findById(negotiationId);
        assertTrue(tender.isPresent());
    }

    @Test
    void testGetProductSupplier() {
        long supplierId = 1;
        Optional<ProductSupplier> supplier = prodSupRepository.findById(supplierId);
        assertTrue (supplier.isPresent());
    }

    @Test
    void testGetProduct() {
        long productId = 1;
        Optional<Product> product = productRepository.findById(productId);
        assertTrue(product.isPresent());
    }

    void testGetNeogtiator() {
        long negotiatorId = 1;
        Optional<Negotiator> negotiator = negotiatorRepository.findById(negotiatorId);
        assertTrue(negotiator.isPresent());
    }
}
