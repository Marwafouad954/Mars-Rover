package com.MarsRover;

public class Rover {
    private Position position ;

    public Rover(Position position) {
        this.position = position;
    }
    private void process(Character instruction) {
        switch (instruction) {
            case 'R':
                rotateRight();
                break;
            case 'L':
                rotateLeft();
                break;
            case 'F':
                MoveForward();
                break;
            case 'B':
                MoveBackword();
                break;
            default:
                throw new IllegalStateException("Unknown Command");
        }
    }

    private void rotateLeft() {
        position =position.setDirectionToLeft();
    }

    private void rotateRight() {
        position = position.setDirectionToRight();
    }
    private void MoveForward() {
        position = position.moveForward();
    }
    private void MoveBackword() {
        position = position.moveBackward();
    }

    public void Command(String commands){
        for(int idx=0 ; idx<commands.length();idx++)
        {
            process(commands.charAt(idx));
        }
    }
    public Position getPosition(){
        return position;
    }
    public void printPosition(){

        System.out.println(getPosition());
    }
}
