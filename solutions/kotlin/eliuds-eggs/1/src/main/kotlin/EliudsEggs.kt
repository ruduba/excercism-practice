object EliudsEggs {

    fun eggCount(number: Int): Int{
        //TODO("Implement this function to complete the task")

        var count = 0;
        var x = number

        while(x > 0){
            if(x%2 == 1) count++

            x /= 2
            
        }

        return count
    }
}
