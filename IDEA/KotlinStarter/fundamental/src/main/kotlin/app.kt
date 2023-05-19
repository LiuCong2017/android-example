import java.util.StringJoiner

fun main(args:Array<String>){
    vars(1,2,3)

    val lambdaFun: (Int, Int) -> Int = {x,y -> x+y} //lambda
    println(lambdaFun(3,6))

    /** Define constants and variables */
    val a: Int = 1 //val = final(java)
    val b = 1
    val c: Int

    var x = 5
    x += 1

    /** String Template */
    val s1 = "a is $a"
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    /** NULL checking mechanism */
    var age: String? = "23" //类型后面加?表示可为空
    val ages = age!!.toInt() //像Java一样抛出空指针异常
    val ages1 = age?.toInt() //不做处理返回 null (加?可不做处理返回值为 null)
    var ages2 = age?.toInt() ?: -1 //age为空返回-1 (配合 ?: 做空判断处理)
    fun parseInt(str: String): Int? { //当 str 中的字符串内容不是一个整数时, 返回 null
        return str.toIntOrNull()
    }
    fun printProduct(arg1: String, arg2: String){
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        if (x!=null && y!=null){
            println(x*y)
        }else{
            println("'$arg1' or '$arg2' is not a number")
        }
        //or
        //if (x is/!is String){}
    }
    printProduct("a", "b")

    /** range: .. */
    for (i in 1..4) print(i)
    for (i in 1..4 step 2) print(i) // 使用 step 指定步长
    for (i in 4 downTo 1 step 2) print(i)
    for (i in 1 until 10) print(i) // i in [1, 10) 排除了 10 (使用 until 函数排除结束元素)

    //Double Float Long Int Short Byte
    // toByte(): Byte toShort(): Short toInt(): Int toLong(): Long toFloat(): Float toDouble(): Double toChar(): Char
    // shl(bits) – 左移位 (Java’s <<) shr(bits) – 右移位 (Java’s >>) ushr(bits) – 无符号右移位 (Java’s >>>) and(bits) – 与 or(bits) – 或 xor(bits) – 异或 inv() – 反向
    val num = 34322L
    val hexBytes = 0xFF
    val bytes = 0b101101
    var chars:Char = 'c'

    // || – 短路逻辑或
    // && – 短路逻辑与
    // ! - 逻辑非
    //Compare number
    println(a==b) // == 表示比较两个值大小
    println(a===b) // === 表示比较对象地址

    /** Array */
    val arr1 = arrayOf(1, 2, 3) //[1,2,3]
    val arr2 = Array(3) { i -> (i * 2) } //[0,2,4]
    val arr3: IntArray = intArrayOf(1, 2, 3)

    /** Loop control
     *  while 与 do...while 循环
     *  return/break/continue
     */
    for (i: Int in arr1) print(i)
    for (i in arr1.indices) print(arr1[i]) //索引遍历
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) println(item)

    //String
    val text = """
    |str1
    |str2
    |str3
    """.trimMargin()

    /** Condition control */
    val res = if(a>b) a else b
    when(a>b){ // java switch
        true -> print(a)
        false -> print(b)
        else -> print(null)
    }

}

/** Function definition */
fun sum(a: Int, b: Int): Int{
    return a+b;
}
fun sum1(a: Int, b: Int) = a+b
public fun sum2(a: Int, b: Int): Int  = a+b

fun printSum(a: Int, b: Int): Unit{
    print(a+b)
}

fun vars(vararg v: Int){
    for (vt in v){
        print(vt)
    }
}