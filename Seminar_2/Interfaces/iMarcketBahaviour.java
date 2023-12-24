package Seminar_2.Interfaces;

import java.util.List;

import Seminar_2.Classes.Actor;

public interface iMarcketBahaviour {

   public void acceptToMarket(iActorBehaviour actor);
   public void releaseFromMarket(List<Actor> actors);
   public void update();
    
} 
