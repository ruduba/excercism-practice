object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        //TODO("Implement the function to complete the task. Change the signature if necessary.")
        //list.sort()

        if(list.isEmpty()) throw NoSuchElementException("not found")
        

        var low = 0
        var high = list.size - 1

        if(list[high] < item || list[low] > item) throw NoSuchElementException("not found")

        while(low <= high) {
            val mid = low + (high - low) / 2
            val midVal = list[mid]
            val cmp = midVal.compareTo(item)

            when{
                cmp < 0 -> low = mid + 1
                cmp > 0 -> high = mid - 1
                cmp == 0 -> return mid
            }
        }
        throw NoSuchElementException("not found")
        
    }
}
