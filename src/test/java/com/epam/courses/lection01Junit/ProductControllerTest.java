package com.epam.courses.lection01Junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.InjectMocks;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {
    @Spy
    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Before
    public void setUp() {
        when(productService.isSpecialProduct(null)).thenReturn(false);
        when(productService.isSpecialProduct(any(Product.class))).thenReturn(true);
        doNothing().when(productController.getProduct(null));
        doCallRealMethod().when(productController.getProduct(any(Product.class)));
        doReturn(null).when(productController.getProduct(null));
    }

    @Test
    public void shouldReturnSameProductWhenProductIsSpecial() {
        Product expected = new Product();
        Product result = productController.getProduct(expected);

        ArgumentCaptor<Product> productArgumentCaptor = ArgumentCaptor.forClass(Product.class);

        verify(productService).isSpecialProduct(productArgumentCaptor.capture(), eq("any"));
        Product value = productArgumentCaptor.getValue();
        assertSame(value.getProductType(), null);
        assertSame("Should return same product", expected, result);
    }
} 
