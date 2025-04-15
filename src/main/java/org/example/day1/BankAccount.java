package org.example.day1;

import java.util.List;

public class BankAccount {
    // Сreate account and this class can be updated, can be dispatched, viewed history and show current account
    int accountNumber;
    List<String> historyAccount;
    int currentBalance;

    public BankAccount(Integer number) {
        currentBalance = number;


    }
}
//1. создание счета с начальным балансом
//2. просмотр истории транзакций
//3. пополнение
//4. снятие средств
//5. получение текущего баланса