object Darts {

    fun score(x: Number, y: Number /* choose proper types! */): Int {
        //TODO("Implement this function to complete the task")

        var radius = kotlin.math.hypot(x.toFloat(), y.toFloat())
        return when {
            radius > 10.0 -> 0
            radius > 5.0 -> 1
            radius > 1.0 -> 5
            else -> 10
        }
    }
}
