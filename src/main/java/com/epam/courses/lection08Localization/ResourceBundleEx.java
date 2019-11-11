package com.epam.courses.lection08Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleEx {
    public static void main(String[] args) {
        System.out.println("Current Locale: " + Locale.getDefault());
        ResourceBundle messagesResourceBundle = getText("messages");
        System.out.println("Say how are you in Default locale: " + messagesResourceBundle.getString("greeting"));

        Locale.setDefault(new Locale("de"));

        System.out.println("Current Locale: " + Locale.getDefault());
        messagesResourceBundle = getText("messages");
        System.out.println("Say how are you in Default locale: " + messagesResourceBundle.getString("greeting"));

        Locale locale_en_US = new Locale("en", "US");
        ResourceBundle messagesResourceBundleWithLocal = ResourceBundle.getBundle("messages", locale_en_US);
        System.out.println("Say how are you in en_US: " + messagesResourceBundleWithLocal.getString("greeting"));

    }

    private static ResourceBundle getText(String baseName) {
        return ResourceBundle.getBundle(baseName);
    }
}
