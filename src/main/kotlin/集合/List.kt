package 集合

/**
 * Kotlin里面的集合类型分可变 和 不可变
 * 接口 Collection   <-     MutableCollection
 * 子类   👆                      👆
 *      List                 MutableList
//如何创建List
val names1:List<String?> = List(3){null}
val names2:List<String?> = listOf()
val names3:List<String?> = listOf("Avicii","jake")
val names4:List<String?> = emptyList()

names3.indexOf("Avicii").also {
println(it)
}
 *
 *
 *
 *
 *
 *
 *
 *
 *      Set (没有顺序 不允许重复)                 MutableSet
 *
 *
 * 映射
 *      Map<k,v>     <-         MutableMap
 */
fun main() {
  //MutableList
    val names1:MutableList<String?> = MutableList(3){null}
    val names2:MutableList<String> = mutableListOf()
    val names3:MutableList<String> = mutableListOf("Avicii","jake")
    names3.listIterator().also {
        while (it.hasNext()){
           if (it.next()=="Avicii") it.remove()
        }
    }
    for (item in names3){
        println(item)
    }
}