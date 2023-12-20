package Seminar_1;
import java.util.ArrayList;
import java.util.List;

import Seminar_1.domen.Bottle;
import Seminar_1.domen.HotDrink;
import Seminar_1.domen.Product;
import Seminar_1.servis.CoinDispenser;
import Seminar_1.servis.Holder;
import Seminar_1.servis.VendingMashine;
import java.awt.*;
// импортировали графическую библиотеку
import java.awt.event.*;
// библиотека для отслеживания нажатий на кнопки
import javax.swing.*;
// библиотека для создания графического интерфейса
public class App {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        Product product1 = new Product("Lays 95гр",129,1);
        Product product2 = new Product("Кириешки 45гр", 49, 2);
        Product product3 = new Product("Колбаски охотничьи 115гр", 109, 3);
        Product product4 = new Bottle("Aqva Minerale", 89, 4, 0.5);
        System.out.println(product1);
        Product product5 = new HotDrink("Nescafe", 99, 5, 0.4, 65);
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.add(product5);
        Holder holder1 = new Holder();
        CoinDispenser coinDispenser1 = new CoinDispenser();
        VendingMashine vendingMashine1 = new VendingMashine(holder1, coinDispenser1, product);
        
        for (Product prod : vendingMashine1.getProduct()) {
            System.out.println(prod);
        }
    }
}
