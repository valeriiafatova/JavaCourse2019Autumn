package com.epam.courses.lection04Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfacesDemo {
    public static void main(String[] args) {
        //demoPredicate();

        //demoUnaryOperation();

        //demoFunction();

        //demoConsumer();

        //demoSupplier();
    }

    private static void demoSupplier() {
        Supplier<Basket> supplier = () -> new Basket(0);

        BasketSupplier<Basket> basketSupplier = Basket::new;

        Basket result = supplier.get();
        System.out.println(result);
        result.setTotal(15);
        System.out.println(result);
        System.out.println(basketSupplier.get(19));
    }

    private static void demoConsumer() {
        Consumer<Basket> consumer = basket -> {
            int total = basket.getTotal();
            basket.setTotal(total / 2);
        };

        Basket basket = new Basket(20);
        consumer.accept(basket);
        System.out.println(basket.getTotal());
    }

    private static void demoFunction() {
        Function<Basket, Integer> function = Basket::getTotal;

        Integer result = function.apply(new Basket(10));

        System.out.println(result);
    }

    private static void demoUnaryOperation() {
        UnaryOperator<String> unaryOperator = greeting -> greeting + "Valeriia";

        String result = unaryOperator.apply("Hi ");

        System.out.println(result);
    }

    private static void demoPredicate() {
        Predicate<Integer> predicate = getPredicate();

        boolean result = predicate.test(10);

        System.out.println(result);
    }

    private static Predicate<Integer> getPredicate() {
        return x -> x > 5;
    }

    private static Predicate<Integer> predicate() {
        return x -> x > 125;
    }

    private static Supplier<String> supplier() {
        return () -> "Hello";
    }


    private static Consumer<Integer> consumer() {
        return System.out::println;
    }


    private static Function<Integer, String> function() {
        return a -> String.valueOf(a);
    }
}

class Basket {
    private int total;

    public Basket(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Basket{" + "total=" + total + '}';
    }
}

@FunctionalInterface
interface BasketSupplier<T extends Basket> {
    T get(int total);
}

