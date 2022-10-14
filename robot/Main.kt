fun main(args: Array<String>) {
    val r1 = RobotDir(3, 4, Direction.RIGHT)
    val r2 = RobotDir(0, 0, Direction.DOWN)
    val r3 = RobotDir(4, 5, Direction.LEFT)
    r1.moveRobot(1, 1)
    r2.moveRobot(2, 2)
    r3.moveRobot(3, 3)
    println(r1)
    println(r2)
    println(r3)
}
