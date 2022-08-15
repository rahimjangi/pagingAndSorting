package com.raiseup.boostrapData;

import com.raiseup.model.Customer;
import com.raiseup.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoder implements CommandLineRunner {
    private final CustomerService customerService;

    public DataLoder(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void run(String... args) throws Exception {
        customerService.saveAll(
                List.of(
                        new Customer("c1 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c2 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c3 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c4 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c5 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c6 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c7 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c8 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c9 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c10 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c11 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c12 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c13 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c14 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c15 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c16 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c17 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c18 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c19 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c20 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c21 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c22 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c23 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c24 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c25 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c26 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c27 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c28 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c29 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c30 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c31 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c32 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c33 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c34 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c35 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c36 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c37 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c38 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c39 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c40 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c41 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c42 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c43 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c44 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c45 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c46 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c47 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c48 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c49 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c50 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c51 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c52 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c53 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c54 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c55 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c56 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c57 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c58 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c59 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c60 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c61 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c62 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c63 firstName","c1 lastName","c1 address", LocalDate.now()),
                        new Customer("c64 firstName","c1 lastName","c1 address", LocalDate.now())
                )
        );
    }
}
