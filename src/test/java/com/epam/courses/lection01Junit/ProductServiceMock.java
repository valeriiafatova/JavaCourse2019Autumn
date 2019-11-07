package com.epam.courses.lection01Junit;

public class ProductServiceMock implements ProductService {
    @Override
    public boolean isSpecialProduct(Product product) {
        if(product == null){
            return false;
        }

        return true;
    }

    public boolean isSpecialProduct(Product product, String anything) {
        return false;
    }
}