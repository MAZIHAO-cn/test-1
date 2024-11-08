package org.example;
// 水果类
class Fruit {
    private String name;    // 水果名称
    private double pricePerPound;   // 单价

    public Fruit(String name, double pricePerPound) {
        this.name = name;
        this.pricePerPound = pricePerPound;
    }

    public double calculateCost(int pounds) {
        return pounds * pricePerPound;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public String getName() {
        return name;
    }
}