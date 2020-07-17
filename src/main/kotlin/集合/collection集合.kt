package 集合

/**
 * 集合Collextion
 * Array
var names=Array<String>(3){
"$it->str"
}
//遍历器iterator来遍历数组
/*
val iterator=names.iterator()
while (iterator.hasNext()){
println(iterator.next())
}
*/
names.iterator().also {
while (it.hasNext()){
println(it.next())
}
}

//遍历方式
/*
for (i in names.indices){
println(i)
}
for (str in names){
println(str)
}
for ((i,str) in names.withIndex()){
println(str)
}
*/
 * List
 * Set
 * Map
 *
 * */


fun main() {
  //只是知道内容
  val names2= arrayOf("A","b")
    //知道个数和内容的类型 具体内容不知道
    val names3= arrayOfNulls<String>(3)
    //只知道内容的格式 不知道个数
    val names4= emptyArray<String>()
}