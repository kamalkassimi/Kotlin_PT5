

//fun listd(vararg s:Int):Int{
//    var sum=0
//    for (i in s ) {
//        if( i > 0){
//            listl.and(i)
//        }
//    }
//
//    return  sum
//}
var lma= { x: Int -> x >0 }
fun filterm(number: MutableList<Int>,params:(Int)->Boolean):Array<Int> {
    var filterk = mutableListOf<Int>()
    for (i in number)
        if (params(i))
            filterk.add(i)
    return  filterk.toTypedArray()
}
fun prite(n:Int):Boolean = n %2==0
fun positaf(n:Int):Boolean = n > 0


fun main() {
    var list =  mutableListOf(1,4,9,-9,77,6)
    var listl = mutableListOf<Int>()
    var   filterf= filterm(list,::positaf)
    // Arrays . toString(filterf)
    // val =
}