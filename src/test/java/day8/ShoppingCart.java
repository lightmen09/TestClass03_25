package day8;

import java.util.ArrayList;

class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.name + " добавлен в корзину.");
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println(product.name + " удалён из корзины.");
        } else {
            System.out.println(product.name + " не найден в корзине.");
        }
    }

    public void printReceipt() {
        double total = 0;
        System.out.println("Чек:");
        for (Product product : products) {
            System.out.println(product);
            total += product.price;
        }
        System.out.printf("Итого: %.2f руб.", total);
    }

    public void checkout() {
        System.out.println("Оформление доставки:");
        for (Product product : products) {
            product.printDeliveryInfo();
        }
        products.clear();
        System.out.println("Корзина очищена после оформления заказа.");
    }
}
