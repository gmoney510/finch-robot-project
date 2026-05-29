package com.luca;

import com.birdbrain.Finch;

public class TesterFinch{

    public static void main(String[] args){
     
        //Start of program
        FinalFinch bird = new FinalFinch("A");

        bird.setBeak(100, 50, 60);

        //Square
        bird.setMove("F", 5, 100);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 5, 100);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 5, 100);
        bird.setTurn("R", 90, 50);
        bird.setMove("F", 5.25, 100);
        //triangle
        bird.setMove("B", 5.5, 100);
        bird.setTurn("L", 45, 50);
        bird.setMove("F", 4, 100);
        bird.setTurn("R", 105, 50);
        bird.setMove("F", 4, 100);

       
        
    }

}

