class RobotDir (x: Int, y: Int, direction: Direction): Robot(x, y, direction) {

    fun moveRobot(toX: Int, toY: Int){
        if (x - toX < 0){
            while (direction != Direction.RIGHT){
                turnRight()
            }
        }
        else if (x - toX > 0){
            while (direction != Direction.LEFT){
                turnLeft()
            }
        }
        while (x != toX){
            stepForward()
        }
        if (y - toY > 0){
            while (direction != Direction.DOWN){
                turnLeft()
            }
        }
        else if (y - toY < 0){
            while (direction != Direction.UP){
                turnRight()
            }
        }
        while (y != toY){
            stepForward()
        }
    }
}
