import java.math.BigInteger

object Board {

    // fun factorial(number: Int) : BigInteger{
    //     if(number <= 1) return 1;

    //     return(factorial(number-1).add(number));        
    // }

    fun getGrainCountForSquare(number: Int): BigInteger {
        require(number in 1..64)
        return BigInteger.ONE.shiftLeft(number-1);
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE)
    }
}
