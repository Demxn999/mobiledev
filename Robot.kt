open class Robot (var x: Int, var y: Int, var direction: Direction){
    fun stepForward(){
        when (direction){
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
            Direction.UP -> y++
            Direction.DOWN -> y--
        }
    }

    override fun toString(): String {
        return "(${x}, ${y}), ${direction}"
    }
    fun turnLeft(){
        direction = when (direction){
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
            Direction.UP -> Direction.LEFT

        }
    }
    fun turnRight(){
        direction = when (direction){
            Direction.LEFT -> Direction.UP
            Direction.DOWN -> Direction.LEFT
            Direction.RIGHT -> Direction.DOWN
            Direction.UP -> Direction.RIGHT
        }
    }
}

enum class Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT
}
