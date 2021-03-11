/*
Mini Project 2
Group #1: Jamie Schaffer, Mariam Bahassi, Martin Manevski, Nicholas Warren
Date: 3/11/2021
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number:");
    int num = s.nextInt();

    ArrayList<Player> players = new ArrayList<Player>();

    for(int i=0; i<num; i++) {
      players.add(new Player());
    }

    System.out.println("We have added " + num + " players to this hunt. Let's fund some eggs!");

    hunt(players);

    recap(players);

    stats(players);
    }

    public static void hunt(ArrayList<Player> thePlayers) {
      Random r = new Random();
      int eggsFound;

      for(int i=0; i<thePlayers.size(); i++) {
        eggsFound = r.nextInt(11);
        for(int b=0; b<eggsFound; b++) {
          thePlayers.get(i).foundEgg(new Egg());
        }
      }
    }

    public static void recap(ArrayList<Player> thePlayers) {
      for(int i=0; i<thePlayers.size(); i++) {
        System.out.println("\nPlayer " + i + " found " + thePlayers.get(i).getNumberEggs() + " eggs");
        thePlayers.get(i).printBasket();
      }
    }

    public static void stats(ArrayList<Player> thePlayers) {
      int mostEggsPlayer = 0;
      int mostEggsNumber = 0;

      for(int i=0; i<thePlayers.size(); i++) {
        if(thePlayers.get(i).getNumberEggs() > mostEggsNumber) {
          mostEggsNumber = thePlayers.get(i).getNumberEggs();
          mostEggsPlayer = i;
        }
      }

      System.out.println("\nPlayer " + mostEggsPlayer + " found the most eggs, with " + mostEggsNumber + " eggs!");

      int[] colors = new int [4];
      for(int i=0; i<thePlayers.size(); i++) {
        for(int b=0; b<thePlayers.get(i).getNumberEggs(); b++){
           if(thePlayers.get(i).getBasket().get(b).getColor().equals("blue"))
            colors[0]++;  
          if(thePlayers.get(i).getBasket().get(b).getColor().equals("pink"))
            colors[1]++;
          if(thePlayers.get(i).getBasket().get(b).getColor().equals("yellow"))
            colors[2]++;
          if(thePlayers.get(i).getBasket().get(b).getColor().equals("green"))
            colors[3]++; 
      }
    }
    
    System.out.println("\n\nTotal eggs found:");
    System.out.println("Blue eggs: " + colors[0]);
    System.out.println("Pink eggs: " + colors[1]);
    System.out.println("Yellow eggs: " + colors[2]);
    System.out.println("Green eggs: " + colors[3]);
  }
}