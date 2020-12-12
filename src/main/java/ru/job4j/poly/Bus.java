package ru.job4j.poly;

public class Bus implements Transport {

    private int price;

    @Override
    public void ride() {
        System.out.println("The bus is leaving");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println(quantity + " are on the bus");

    }

    @Override
    public int fillUp(int quantity) {
        return price;
    }
}
