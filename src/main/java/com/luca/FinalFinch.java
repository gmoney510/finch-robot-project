package com.luca;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

    public FinalFinch(String device){
        super(device);
    }

    //for loop to draw num amount of houses
    public void paintAllHouses(int num) {
        for (int i = 1; i <= num; i++) {
            paintOneHouse(); 
            if (i != num) {
                // code to get to next house
                setTurn("R", 90, 50);
                setMove("F", 1.75, 100);
                setMove("F", 3, 100);
                setTurn("R", 90, 50);
                setMove("F", 5, 100);
                setTurn("L", 180, 50);
            }
        }
    }

    public void paintOneHouse() {
        // code to draw Square
        setMove("F", 5, 100);
        setTurn("R", 90, 50);
        setMove("F", 5, 100);
        setTurn("R", 90, 50);
        setMove("F", 5, 100);
        setTurn("R", 90, 50);
        setMove("F", 5.5, 100);
        //code to draw triangle
        setMove("B", 5.5, 100);
        setTurn("L", 45, 50);
        setMove("F", 4, 100);
        setTurn("R", 95, 50);
        setMove("F", 4, 100);

        //code to draw door
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