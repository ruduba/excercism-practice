class Dna(private val dnaString: String) {

    init {
        require(dnaString.all{it in "ACGT"})
    }
    // TODO: Implement proper constructor

    val nucleotideCounts: Map<Char, Int>
        get() {
            //TODO("Implement this function to complete the task")
            val baseCounts = mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

            val actualCounts = dnaString.groupingBy {it}.eachCount();
            return baseCounts + actualCounts
        }
}
