package org.example.day3;

public class DiscountCalculator {
    public static double calculateDiscount(double price, double discountPercent) {
        return price *(1 - discountPercent / 100);
    }
    public static double applyPromoCode(double initialPrice, String promoCode) {
     //   if ("Java15".equals(promoCode)) {
     //       return initialPrice * 0.85;
     //   } else{
     //       return initialPrice;
     //   }
        return "Java15".equals(promoCode) ? initialPrice * 0.85 : initialPrice;

    }
    public static void main(String[] args) {
        double initialPrice = 1200;
        double discountPercent = 20;
        String promoCode = "Java15";

        double discountedPrice = calculateDiscount(initialPrice, discountPercent);
        double finalPrice = applyPromoCode(discountedPrice, promoCode);

        System.out.println("исходная цена: " + initialPrice + " руб");
        System.out.println("скидка 20% " + discountedPrice + " руб");
        System.out.println("промокод Java15 " + finalPrice + " руб");
    }
}
