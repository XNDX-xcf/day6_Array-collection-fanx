package 集合

/**
 * 泛型类
 *泛型接口
 * 泛型函数
 *
 * 泛型约束 in out
 *
 * kotlin out == ? extend java
 *
 * in == ? super
 * out == ? extend
 * 什么时候需要使用泛型：当自己定义一个类来操作数据时 如果数据类型是变化的 不确定的
 * */

fun main() {
    var fathers:Array<Father> = emptyArray()
    var childs:Array<in Child> = emptyArray()
    childs=fathers

    var list:List<Father> = listOfNotNull(Father(), Child())

}
//只能取 不能读
//只能作为函数的返回值
//不能修饰变量
class Test<out T>{

}
//只能读 不能取
class Test1<in T>{

}

open class Father
class Child:Father()



fun testfx(){
    //compare(10,20)
    //compare(1.4,1.6)
    compare(1,"1").also {
        println(it)
    }
}
//必须是一个数字和一个字符进行比较
fun <T:Number,R:String> compare(a:T,b:R):Boolean{
    return a==b
}
//必须是数字比较
/*fun <T:Number> compare(a:T,b:T):Boolean{
    return a==b
}*/
/*fun compare(a:Int,b:Int): Int {
    return a+b
}*/
/*fun compare(a:Double,b:Double): Boolean {
    return a==b
}*/

fun testInterface(){
    val btn=Button("Login")
    btn.listner=object :OnClickListener<Button>{
        override fun onClick(v: Button) {
            println("${v.title} 被点击了")
        }

    }
    btn.userTouchDown()
}

interface OnClickListener<T>{
    fun onClick(v:T)
}

class Button(var title:String){
    var listner:OnClickListener<Button>?=null
    fun userTouchDown(){
        //有没有人监听我的事件
        listner?.onClick(this)
    }
}




fun  testClass(){
    val container= Container<Int>()
    container.add(10)
    container.add(20)

    container.get(0).also {
        println(it)
    }
}

class Container<T>{
    private var list:MutableList<T> = mutableListOf()

    fun add(e:T){
        list.add(e)
    }
    fun get(index:Int): T {
        return list[index]
    }
}