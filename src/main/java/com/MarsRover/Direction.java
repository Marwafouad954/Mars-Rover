package com.MarsRover;


public enum Direction {

    NORTH {
        @Override
        public Direction right() {
            return EAST;
        }

        @Override
        public Direction left() {
            return WEST;
        }
    },
    EAST{
        @Override
        public Direction right() {
            return SOUTH;
        }

        @Override
        public Direction left() {
            return NORTH;
        }
    },

    SOUTH{
        @Override
        public Direction right() {
            return WEST;
        }

        @Override
        public Direction left() {
            return EAST;
        }
    },

    WEST {
        @Override
        public Direction right() {
            return NORTH;
        }

        @Override
        public Direction left() {
            return SOUTH;
        }
    };

    public abstract Direction left();

    public abstract Direction right();

}

//
//    private String direction;
//
//    Direction(String direction) {
//        this.direction = direction;
//    }
//
//    public abstract Direction left();
//
//    public abstract Direction right();
//
//    public static Direction get(String directionSign) {
//        switch (directionSign) {
//            case "E":
//                return EAST;
//            case "W":
//                return WEST;
//            case "N":
//                return NORTH;
//            case "S":
//                return SOUTH;
//            default:
//                throw new IllegalStateException("Unknown Direction Sign");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return direction;
//    }