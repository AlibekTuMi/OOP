package Seminar_1.domen;
public class HotDrink extends Product {
    private double volume;
    private int temperature;
/**
 * Конструктор горячего напитка
 * @param name - указываем имя
 * @param price - указываем цену
 * @param place - указываем место
 * @param volume - указываем объём
 * @param temperature - указываем температуру
 * super вызывает коструктор из родителя Product
 */
    public HotDrink(String name, int price, int place, double volume, int temperature) {
        super(name, price, place);
        this.temperature = temperature;
        this.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        // 
        return super.toString() + String.format(" Объём %f Температура %d", volume, temperature);
    }
}
