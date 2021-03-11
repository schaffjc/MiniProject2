/**
* This class determines the color and contents of the eggs 
* @author Jamie Schaffer, Mariam Bahassi, Martin Manevski, Nicholas Warren
* @version 3/11/2021
*/

import java.util.*;

class Player {
  private int eggs;
  private ArrayList<Egg> basket;

//constructor with no parameters
  Player () {
    eggs = 0;
    basket = new ArrayList<Egg>();
  }

/**
* this adds an egg to the basket when a player finds an egg 
* @param Egg and addEgg
*/
  public void foundEgg(Egg anEgg) {
   eggs++;
   basket.add(anEgg); 
  }

//prints out the contents of the basket
  public void printBasket() {
    for(int i=0; i<basket.size(); i++) {
      basket.get(i).printEgg();
    }
  }
/**
* accesses the number of eggs and returns it 
* @return number of eggs
*/
  public int getNumberEggs() {
    return eggs;
  }

/**
* accesses the basket and returns it 
* @return basket of eggs
*/
  public ArrayList<Egg> getBasket() {
    return basket;
  }
}
