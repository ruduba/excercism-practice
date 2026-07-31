object Isogram {

    fun isIsogram(input: String): Boolean {

        val cleaninput = input.lowercase().filter{it.isLetter()}

        return cleaninput.toSet().size == cleaninput.length

    }
}
