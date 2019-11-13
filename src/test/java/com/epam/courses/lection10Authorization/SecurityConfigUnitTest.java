package com.epam.courses.lection10Authorization;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class SecurityConfigUnitTest {

    @InjectMocks
    private SecurityConfig instance = new SecurityConfig();

    @Test
    public void shouldReturnTrueWhenPageIsSecured() {
        boolean result = SecurityConfig.isSecurePage("/user.jsp");

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPageIsNotSecured() {
        boolean result = SecurityConfig.isSecurePage("/index.jsp");

        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenUserHasPermissionForPage() {
        boolean result = SecurityConfig.hasPermission("/user.jsp", Role.USER);
        
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenUserHasNotPermissionForPage() {
        boolean result = SecurityConfig.hasPermission("/admin.jsp", Role.USER);
        
        assertFalse(result);
    }
}