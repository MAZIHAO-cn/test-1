package org.example;
// 超市类
class Supermarket {
    private Fruit apple = new Fruit("Apple", 8);    // 苹果
    private Fruit strawberry = new Fruit("Strawberry", 13); // 草莓
    private Fruit mango = new Fruit("Mango", 20);   // 芒果

    // 1. 计算顾客A的总价
    public double calculateCustomerTotalA(int applePounds, int strawberryPounds) {
        return apple.calculateCost(applePounds) + strawberry.calculateCost(strawberryPounds);
    }

    // 2. 计算顾客B的总价
    public double calculateCustomerTotalB(int applePounds, int strawberryPounds, int mangoPounds) {
        return calculateCustomerTotalA(applePounds, strawberryPounds) + mango.calculateCost(mangoPounds);
    }

    // 3. 计算顾客 C 的总价（草莓打 8 折）
    public double calculateCustomerTotalC(int applePounds, int strawberryPounds, int mangoPounds) {
        double strawberryDiscountPrice = strawberry.getPricePerPound() * 0.8;
        Fruit discountStrawberry = new Fruit("DiscountStrawberry", strawberryDiscountPrice);
        return apple.calculateCost(applePounds) + discountStrawberry.calculateCost(strawberryPounds) + mango.calculateCost(mangoPounds);
    }

    // 4. 计算顾客D的总价（草莓打8折且满100减10）
    public double calculateCustomerTotalD(int applePounds, int strawberryPounds, int mangoPounds) {
        double totalCost = calculateCustomerTotalC(applePounds, strawberryPounds, mangoPounds);
        if (totalCost >= 100) {
            totalCost -= 10;
        }
        return totalCost;
    }
}
