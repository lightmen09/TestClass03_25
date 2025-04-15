package org.example.day6.cash1;

class CashRegister {
    public void processPayment(CashPayment payment) {
        payment.pay();
    }

    public void processPayment(CardPayment payment) {
        payment.pay();
    }

    public void processPayment(CryptoPayment payment) {
        payment.pay();
    }

    public void processPayment(OnlinePayment payment) {
        payment.pay();
    }
}
