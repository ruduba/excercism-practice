fun transcribeToRna(dna: String): String {
    var res = StringBuilder()

    for(char in dna){
        when(char) {
            'G' -> res.append('C')
            'C' -> res.append('G')
            'T' -> res.append('A')
            'A' -> res.append('U')
            else -> IllegalArgumentException("invalid nucleotide")
        }
    }

    return res.toString()
}
