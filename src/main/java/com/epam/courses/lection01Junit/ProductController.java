package com.epam.courses.lection01Junit;


public class ProductController {

    ProductService productService;

    Product getProduct(Product product){
        boolean isSpecialProduct = productService.isSpecialProduct(product);

        if(isSpecialProduct){
            return product;
        }

        Product result = new Product();
        result.setId(product.getId()+1);
        result.setProductType(ProductType.SIMPLE);
        return result;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}