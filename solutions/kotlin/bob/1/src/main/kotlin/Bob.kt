object Bob {
    fun hey(input: String): String {
        
        val trimmed = input.trim()
        val hasLetters = trimmed.any {it.isLetter()}
        val caps = hasLetters && trimmed.all {!it.isLetter() || it.isUpperCase()}

        return when{
            trimmed.isBlank() -> "Fine. Be that way!"
            trimmed.endsWith("?") && caps ->  "Calm down, I know what I'm doing!"
            caps -> "Whoa, chill out!"
            trimmed.endsWith('?') -> "Sure."
            else -> "Whatever." 
        }
    }
}
