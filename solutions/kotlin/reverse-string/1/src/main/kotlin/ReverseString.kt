fun reverse(input: String): String {

    val charInput = input.toCharArray()

    var l = 0
    var r = charInput.size - 1;

    while(l < r){
        val tmp = charInput[l]
        charInput[l] = charInput[r]
        charInput[r] = tmp
        //swap(charInput[l], charInput[r]);
        l++
        r--
    }

    return String(charInput)
}
