package com.MarsRover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    public void test(){
        Rover rover = new Rover(new Position(3,3,Direction.EAST));
        rover.Command("FFRFFRFRRF");
        Position position= new Position(5,1,Direction.EAST);
        assertEquals(position.toString(),rover.getPosition().toString());
    }

    @Test
    public void forwordTest(){
        Rover rover = new Rover(new Position(3,1,Direction.EAST));
        rover.Command("F");
        Position position= new Position(4,1,Direction.EAST);
        assertEquals(position.toString(),rover.getPosition().toString());
    }

    @Test
    public void backwordTest(){
        Rover rover = new Rover(new Position(3,1,Direction.EAST));
        rover.Command("BBBBFL");
        Position position= new Position(0,1,Direction.NORTH);
        assertEquals(position.toString(),rover.getPosition().toString());
    }
    @Test
    public void forthTest(){
        Rover rover = new Rover(new Position(4,2,Direction.EAST));
        rover.Command("FLFFFRFLB");
        Position position= new Position(6,4,Direction.NORTH);
        assertEquals(position.toString(),rover.getPosition().toString());
    }
    @Test
    public void RotateTest(){
        Rover rover = new Rover(new Position(4,2,Direction.EAST));
        rover.Command("L");
        Position position= new Position(4,2,Direction.NORTH);
        assertEquals(position.toString(),rover.getPosition().toString());
    }
//    @Test
//    public void invalidcommand(){
//        Rover rover = new Rover(new Position(4,2,Direction.EAST));
//        rover.Command("LE");
//        Position position= new Position(4,2,Direction.NORTH);
//
//        assertEquals(position.toString(),rover.getPosition().toString());
//    }
}