package Seminar_2;

import Seminar_2.Classes.ActionClient;

import Seminar_2.Classes.Market;
import Seminar_2.Classes.OrdinaryClient;
import Seminar_2.Classes.SpecialClient;
import Seminar_2.Classes.TaxInspector;
import Seminar_2.Interfaces.iActionBehaviour;
import Seminar_2.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Борис");
        iActorBehaviour client2 = new OrdinaryClient("Маша");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new ActionClient("Олег", "SALE");
        iActorBehaviour client6 = new ActionClient("Андрей", "SALE");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);

        magnit.update();
        /**
         * Отдельно добавил акционного клиента который вернулся в магазин и вернул товар
         */
        System.out.println("++++++++++++++++++++++");
        magnit.acceptToMarket(client5);
        magnit.update();
        /**
         * Вывел итог опроса покупателей и количество участников акции
         */
        System.out.println("----------------------");
        System.out.println(((iActionBehaviour)client6).getNameAction());
        System.out.println();
        System.out.println(ActionClient.getCountParticipantAction());
    }
}
