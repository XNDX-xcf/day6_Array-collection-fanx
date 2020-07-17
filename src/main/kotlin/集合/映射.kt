package 集合

/**
 * 接口 Map  <-   MutableMap
 * 子类
 *      HashMap    MutableHashMap
 *      LinkedMap   MutableLinkedMap
 * */

fun main() {
    //如何创建
    //emptyMap
    val dic1 = mapOf<String,String>()
    val dic2 = mapOf<String,String>(
        Pair("Avicii","2018"),
        Pair("jake","1234")
    )

    val dic3= hashMapOf<String,String>()
    val dic4= hashMapOf<String,String>(
        Pair("Avicii","2018"),
        Pair("jake","1234")
    )

    val dic5= linkedMapOf<String,String>()
    val dic6= linkedMapOf<String,String>(
        Pair("Avicii","2018"),
        Pair("jake","1234")
    )
    println(dic6.values)
    println(dic6.get("Avicii"))
    dic6.entries.forEach {
        println("${it.key}--${it.value}")
    }

    //MutableMap
    val names1= mutableMapOf<String,String>()
    val names2= mutableMapOf<String,String>(
        Pair("Avicii","2018"),
        Pair("jake","1234")
    )
    names2["老王"]="痛"
    println(names2.entries.size)
}