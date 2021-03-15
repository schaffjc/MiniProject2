/**
* This class determines the color and contents of the eggs 
* @author Jamie Schaffer, Mariam Bahassi, Martin Manevski, Nicholas Warren
* @version 3/15/2021
*/

import java.util.*;

class Egg {
  private String color;
  private String contents;

//assigns random color and contents to the egg
  Egg () {
    color = randomColor();
    contents = randomContents();
  }

/**
* sets up an array and generates a random color for the egg 
* @return the random egg color
*/
  public String randomColor() {
      Random r = new Random();
      String eggColors[] = {"blue", "pink", "yellow", "green"};
      int color = r.nextInt(4);
      return eggColors[color];
  }

/**
* sets up an array and generates random contents for the egg
* @return the random egg contents
*/
  public String randomContents() {
      Random r = new Random();
      String eggContents[] = {"Cadbury Egg", "Reese's Egg", "pink Starburst", "yellow Peep", "25 cents", "50 cents", "one dollar"};
      int contents = r.nextInt(7);
      return eggContents[contents];
  }

/**
* accesses the color of the egg and returns it
* @return color of egg
*/
  public String getColor() {
   return color;
  }

/**
* accesses the contents of the egg and returns it
* @return contents of egg
*/
  public String getContents() {
    return contents;
  }

//prints out what the random color and contents are for the egg
  public void printEgg() {
    System.out.println(color + " egg contains " + contents);
  }
}