package day8;

public class MarketplaceApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product book1 = new Book("Книга по Java", 750);
        Product book2 = new Book("Мифы о программировании", 620);
        Product toy1 = new Toy("Мягкий мишка", 430);
        Product toy2 = new Toy("Конструктор", 890);
        Product phone = new Electronics("Смартфон X1000", 19999);

        cart.addProduct(book1);
        cart.addProduct(book2);
        cart.addProduct(toy1);
        cart.addProduct(toy2);
        cart.addProduct(phone);

        cart.printReceipt();

        cart.checkout();

        Product toy3 = new Toy("Юла", 299);
        cart.addProduct(toy3);
        cart.removeProduct(toy1); // Уже удалён, т.к. корзина очищена
        cart.removeProduct(toy3); // Удаление существующего товара
    }
}
