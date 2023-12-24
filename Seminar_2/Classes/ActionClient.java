package Seminar_2.Classes;

import Seminar_2.Interfaces.iActionBehaviour;


public class ActionClient extends Actor implements iActionBehaviour {
    private String nameAction;
    private int idClient;
    private static int count;
    private static int maxCount;

    static {
        count = 0;
        maxCount = 10;
    }
/**
 * Добавил класс акционного клиента 
 * @param name - имя клиента
 * @param nameAction - название акции
 */
    public ActionClient(String name, String nameAction) {
        super(name);
        this.idClient = count++;
        this.nameAction = nameAction;

    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
/**
 * добавил интерфейс, с помощью которого проводился опрос покупателей
 */
    @Override
    public String getNameAction() {
        return String.format("Покупатель %s, когда был в супермаркете, сказал что акция называется %s", super.name, nameAction);
    }

    @Override
    public int getIdClient() {
        return idClient;
    }
/**
 * добавил метод, с помощью которого выводится строка с количеством участников акции и максимальное количество участников
 * @return
 */
    public static String getCountParticipantAction() {
        return String.format("Текущее количество участников акции %d человек(а) из %d участников", count, maxCount);
    }
/**
 * добавил интерфейс, с помоью которого покупатель, после получения товара ушел и обратно вернулся в магазин и вернул товар обратно
 */
    @Override
    public String getReturnOrder() {
        return String.format("%s сказал что товар не понравился и вернул товар", super.name);
    }

}
