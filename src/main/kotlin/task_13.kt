fun isSimple(n: Int):Boolean {
    var res: Boolean = true
    for (i in 2 until n)
        if (n % i == 0)
            res = false
    return (res)
}
/**--------------------------------------------------------------------------------------------*/