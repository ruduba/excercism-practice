object Acronym {
    fun generate(phrase: String) : String {
        //TODO("Implement the function to complete the task")

        return phrase
        .replace("-", " ")
        .filter{it.isLetter() || it.isWhitespace()}
        .split(Regex("\\s+"))
        .filter{it.isNotEmpty()}
        .joinToString("") {it.first().uppercase()}
    }
}
