package com.epam.courses.lection01Junit;

import com.epam.courses.lection01Junit.Product;

public interface ProductService {
    boolean isSpecialProduct(Product product);

    boolean isSpecialProduct(Product product, String anything);
}
