package Seminar_2.Classes;

import Seminar_2.Interfaces.iActorBehaviour;
import Seminar_2.Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour,iReturnOrder{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract void setName(String name);
        
}
