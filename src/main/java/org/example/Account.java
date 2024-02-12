package org.example;

public class Account {

    private final String name;

    public Account(String cardName) {
        this.name = cardName;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        String[] strs = name.split(" ");
        if (strs.length != 2) {
            return false;
        }
        if (strs[0].length() == 0 || strs[1].length() == 0) {
            return false;
        }
        return name.length() >= 3 && name.length() <= 19;
    }
}