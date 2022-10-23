fun main() {

    val f1: Figure = Rect(4,3,4,2)
    val f2: Figure = Circle(0, 0, 3)
    val f3: Figure = Square(1,3,2)

    println("Площадь равна: ${f1.area()}")
    f1.move (1,1)
    f1.resize(4)
    f1.rotate(RotateDirection.Clockwise,3,-3)

    println("Площадь равна: ${f2.area()}")
    f2.move (4,1)
    f2.resize(4)
    f2.rotate(RotateDirection.Clockwise,1,-1)

    println("Площадь равна: ${f3.area()}")
    f3.move (3,1)
    f3.resize(4)
    f3.rotate(RotateDirection.Clockwise,4,-1)
}