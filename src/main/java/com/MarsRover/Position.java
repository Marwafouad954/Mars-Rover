package com.MarsRover;


public class Position {
    private int x;
    private int y;
    private  Direction direction;
    public Position(){}
    public  Position(int x,int y, Direction direction){
        this.x=x;
        this.y=y;
        this.direction = direction;
    }

    public Position setDirectionToLeft(){
        return new Position(x, y,direction.left());
    }
    public Position setDirectionToRight(){
        return new Position(x,y,direction.right());
    }


    public Position moveForward() {

        switch (direction.toString()) {
            case "NORTH":
                return new Position(x, y+1, direction);
            case "EAST":
                return new Position(x+1, y, direction);
            case "WEST":
                return new Position(x-1, y, direction);
            case "SOUTH":
                return new Position(x, y-1, direction);
            default:
                throw new IllegalStateException("Unknown Direction");
        }
    }
    public Position moveBackward(){
        switch(direction.toString()){
            case "NORTH":
                return new Position(x,y-1,direction);
            case "EAST":
                return new Position(x-1 ,y ,direction);
            case "WEST":
                return new Position(x+1 ,y ,direction);
            case "SOUTH":
                return new Position(x ,y+1 ,direction);
            default:
                throw new IllegalStateException("Unknown Direction");
        }
    }
    @Override
    public String toString() {
        return "("+x + " , " + y +")"+ direction;
    }
}
