fun maxDivisor(n: Int): Int {
    var i=(n-1)
    while ((n%i) !=0)
        i--
    return(i)
}