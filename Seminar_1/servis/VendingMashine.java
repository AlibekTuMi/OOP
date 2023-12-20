package Seminar_1.servis;

import java.util.List;

import Seminar_1.domen.Product;


public class VendingMashine {
    private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> product;

    /**
     * Конструктор
     * @param holder
     * @param dispenser
     * @param product2
     */

    public VendingMashine(Holder holder, CoinDispenser dispenser, List<Product> product2) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.product = product2;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public CoinDispenser getDispenser() {
        return dispenser;
    }

    public void setDispenser(CoinDispenser dispenser) {
        this.dispenser = dispenser;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> assort) {
        this.product = product;
    }

    
}
