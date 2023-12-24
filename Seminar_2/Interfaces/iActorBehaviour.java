package Seminar_2.Interfaces;

import Seminar_2.Classes.Actor;

public interface iActorBehaviour {

    public boolean isTakeOrder();

    public boolean isMakeOrder(); 

    public void setTakeOrder(boolean val); 

    public void setMakeOrder(boolean val); 

    public Actor getActor();

    

    

}