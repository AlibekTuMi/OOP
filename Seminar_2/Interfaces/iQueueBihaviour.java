package Seminar_2.Interfaces;

// import Seminar_2.Classes.Actor;

public interface iQueueBihaviour {
    public void takeInQueue(iActorBehaviour actor);

    public void releaseFromQueue();

    public void takeOrder();

    public void giveOrder();

    

}
