package Seminar_2.Classes;

import java.util.ArrayList;
import java.util.List;

import Seminar_2.Interfaces.iActorBehaviour;
import Seminar_2.Interfaces.iMarcketBahaviour;
import Seminar_2.Interfaces.iQueueBihaviour;

public class Market implements iMarcketBahaviour, iQueueBihaviour {
    
    private List<iActorBehaviour> queue;
    
    /**
     * Переделал логику файла Market, где Taxinspector ничего не покупает, а просто приходит в магазин, становится в очередь, уходит из очереди и уходит из магазина
     * Также добавил покупателя, который обратно вернулся в магазин и вернул товар
     * Плюсом разграничил действия каждой функции в интерфейсе
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }
    
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
        System.out.println("----------------------");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
        if (!queue.isEmpty()) {
            queue.clear();
        }

    }
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                if (!(actor instanceof TaxInspector)) {
                    
                    actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
                }
                else{
                    actor.setTakeOrder(true);
                }
                
            }
        }
        System.out.println("----------------------");
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        System.out.println("----------------------");
        releaseFromMarket(releaseActors);
    }
    
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                if (!(actor instanceof TaxInspector)) {
                    
                   actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
                }
                else{
                    actor.setMakeOrder(true);
                }
                

            }
            else{
                if (!(actor instanceof TaxInspector)) {
                    
                    actor.setMakeOrder(false);
                    System.out.println(((Actor)actor.getActor()).getReturnOrder());
                }
                else{
                    actor.setMakeOrder(false);
                }
            }
        }
        System.out.println("----------------------");
    }

    
}