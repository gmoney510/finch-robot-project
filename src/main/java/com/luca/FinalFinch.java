package com.luca;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

    public FinalFinch(String device){
        super(device);
    }

    //write custom methods
    public void paintAllHouses() {
        paintOneHouse();
        // write code to get to next house
        setTurn("R", 90, 50);
        setMove("F", 1.75, 100);
        setMove("F", 3, 100);
        setTurn("R", 90, 50);
        setMove("F", 5, 100);
        setTurn("L", 180, 50);



    }

    public void paintOneHouse() {
        //Square
        setMove("F", 5, 100);
        setTurn("R", 90, 50);
        setMove("F", 5, 100);
        setTurn("R", 90, 50);
        setMove("F", 5, 100);
        setTurn("R", 90, 50);
        setMove("F", 5.5, 100);
        //triangle
        setMove("B", 5.5, 100);
        setTurn("L", 45, 50);
        setMove("F", 4, 100);
        setTurn("R", 95, 50);
        setMove("F", 4, 100);

        //door
         setTurn("R", 45, 50);
         setMove("F", 5, 100);
         setTurn("R", 90, 50);
         setMove("F", 1.70, 100);
         setTurn("R", 90, 50);
         setMove("F", 2.5, 100);
         setTurn("L", 90, 50);
         setMove("F", 1.60, 100);
         setTurn("L", 90, 50);
         setMove("F", 2.67, 100);
    }


    
    
}