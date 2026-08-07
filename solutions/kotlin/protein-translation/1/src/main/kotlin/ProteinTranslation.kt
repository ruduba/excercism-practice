fun translate(rna: String?): List<String> {
    if (rna.isNullOrBlank()) return emptyList()

    return rna.chunked(3)
        .asSequence()
        .takeWhile {
            codon -> codon !in listOf("UAA", "UAG", "UGA")
        }
        .map {
            codon ->
            when (codon){
                "AUG" -> "Methionine"
                "UUU", "UUC" -> "Phenylalanine"
                "UUA", "UUG" -> "Leucine"
                "UCU", "UCC", "UCA", "UCG" -> "Serine"
                "UAU", "UAC" -> "Tyrosine"
                "UGU", "UGC" -> "Cysteine"
                "UGG" -> "Tryptophan"
                "UAA", "UAG", "UGA" -> "STOP"
                else -> throw IllegalArgumentException("invalid codon")                
            }
        }
        .toList()

}
