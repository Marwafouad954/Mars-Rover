package com.MarsRover;

public class MarsRover {
    public static void main(String[] args){
        Rover rover = new Rover(new Position(3,3,Direction.EAST));
        rover.Command("FFRFFRFRRF"); //MMRMMRMRRM
        System.out.println(rover.getPosition());
    }
}
