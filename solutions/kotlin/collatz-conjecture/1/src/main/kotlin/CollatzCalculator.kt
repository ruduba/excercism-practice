object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        //TODO("Implement the function to complete the task")

        require(start > 0)
        var count = 0
        var x = start
        while(x > 1){
            if(x % 2 == 0){
                x/=2;
            } else {
                x = (x * 3) + 1;
            }
            count++
        }
        return count


    }
}
