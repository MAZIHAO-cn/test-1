package org.example;
import java.util.Scanner;

/**
 * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
 * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
 * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 *
 * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
 * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 *
 * 3、超市做促销活动，草莓限时打 8 折。
 * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 *
 * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
 * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 *
 * 要求
 * 使用 Java 程序编写，IDE 不限，
 * 请使用面向对象的思路进行程序编写。
 * 需在程序中，验证函数计算结果的正确性。
 *
 * 提示
 * 顾客购买的水果斤数，可自行确定。无论数值为多少，均需验证程序计算结果的正确性。
 */

public class Main {
    // 验证并获取非负整数的斤数
    public static int getValidPounds(String fruitName, Scanner scanner) {
        int pounds;
        while (true) {
            System.out.println("请输入 " + fruitName + " 的斤数：");
            pounds = scanner.nextInt();
            if (pounds >= 0) {
                break; // 斤数有效，退出循环
            } else {
                System.out.println("斤数必须是大于等于0的整数，请重新输入。");
            }
        }
        return pounds;
    }

    // 主函数
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        Scanner scanner = new Scanner(System.in);
        // 顾客A的购买斤数
        int applePoundsA = getValidPounds("顾客A购买的苹果", scanner);
        int strawberryPoundsA = getValidPounds("顾客A购买的草莓", scanner);
        double totalA = supermarket.calculateCustomerTotalA(applePoundsA, strawberryPoundsA);
        System.out.println("顾客A总价: " + totalA);

        // 顾客B的购买斤数
        int applePoundsB = getValidPounds("顾客 B 购买的苹果", scanner);
        int strawberryPoundsB = getValidPounds("顾客 B 购买的草莓", scanner);
        int mangoPoundsB = getValidPounds("顾客 B 购买的芒果", scanner);
        double totalB = supermarket.calculateCustomerTotalB(applePoundsB, strawberryPoundsB, mangoPoundsB);
        System.out.println("顾客B总价: " + totalB);

        // 顾客C的购买斤数
        int applePoundsC = getValidPounds("顾客 C 购买的苹果", scanner);
        int strawberryPoundsC = getValidPounds("顾客 C 购买的草莓", scanner);
        int mangoPoundsC = getValidPounds("顾客 C 购买的芒果", scanner);
        double totalC = supermarket.calculateCustomerTotalC(applePoundsC, strawberryPoundsC, mangoPoundsC);
        System.out.println("顾客 C 总价: " + totalC);

        // 顾客D的购买斤数
        int applePoundsD = getValidPounds("顾客D购买的苹果", scanner);
        int strawberryPoundsD = getValidPounds("顾客D购买的草莓", scanner);
        int mangoPoundsD = getValidPounds("顾客D购买的芒果", scanner);
        double totalD = supermarket.calculateCustomerTotalD(applePoundsD, strawberryPoundsD, mangoPoundsD);
        System.out.println("顾客D总价: " + totalD);

        // 手动关闭
        scanner.close();
    }
}
