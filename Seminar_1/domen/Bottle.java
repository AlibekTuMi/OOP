// Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
// Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
// В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

package Seminar_1.domen;

public class Bottle extends Product {
    private double volume;

    public Bottle(String name, int price, int place, double volume) {
        super(name, price, place);
        // super это вызов конструктора родителя из Product
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String toString(){
        return super.toString() + String.format(" Объём %f", volume);
    }
}
