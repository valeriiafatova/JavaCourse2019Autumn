package com.epam.courses.lection01Junit;

public class ProductServiceImpl implements ProductService {

    public boolean isSpecialProduct(Product product){
        return product.getProductType().equals(ProductType.SPECIAL);
    }

    public boolean isSpecialProduct(Product product, String anything) {
        return false;
    }
}