package org.example.day7.cash2;

class Payment {
    public void pay() {
        System.out.println("Производится платеж (общий способ)");
    }
}

class CashPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Оплата наличными принята.");
    }
}

class OnlinePayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Онлайн оплата производится...");
    }
}

class CardPayment extends OnlinePayment {
    @Override
    public void pay() {
        System.out.println("Оплата картой успешно завершена.");
    }
}

class CryptoPayment extends OnlinePayment {
    @Override
    public void pay() {
        System.out.println("Оплата криптовалютой подтверждена.");
    }
}
