class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    // TODO: Implement proper constructor

    private val sideA = a.toDouble()
    private val sideB = b.toDouble()
    private val sideC = c.toDouble()

    init{
        require(sideA > 0.0 && sideB > 0.0 && sideC >0.0)

        require(
            sideA + sideB >= sideC &&
            sideB + sideC >= sideA &&
            sideA + sideC >= sideB
        )
    }
    

    val isEquilateral: Boolean = (sideA == sideB) && (sideB == sideC)
    val isIsosceles: Boolean = (sideA == sideB) || (sideB == sideC) || (sideC == sideA)
    val isScalene: Boolean = !isIsosceles
}
