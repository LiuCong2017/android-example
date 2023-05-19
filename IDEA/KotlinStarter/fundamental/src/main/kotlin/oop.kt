fun main(){
    val app = App("show")
    app.name

    var person: Person = Person()
    person.lastName = "Kavin"

}

/**
 * Kotlin 类可以包含：构造函数和初始化代码块、函数、属性、内部类、对象声明
 *
 * classModifier: 类属性修饰符，标示类本身特性
        abstract    // 抽象类
        final       // 类不可继承，默认属性
        enum        // 枚举类
        open        // 类可继承，类默认是final的
        annotation  // 注解类
 * accessModifier: 访问权限修饰符
        private    // 仅在同一个文件中可见
        protected  // 同一个文件中或子类可见
        public     // 所有调用的地方都可见
        internal   // 同一个模块中可见
 */
class App constructor(act: String){ //主构造函数

    var name = "App"
    lateinit var act: String

}

class Person1(val name: String) {
    //次构造函数
    constructor (name: String, age:Int) : this(name) {
        // 初始化...
    }
}

class Person {

    var lastName: String = ""
        get() = field.toUpperCase()   // 将变量赋值后转换为大写
        set

    //初始化代码段
    init {
        println("LastName is $lastName")
    }

    var no: Int = 100
        get() = field                //Backing Fields(后端变量) 机制,备用字段使用field关键字声明,field 关键词只能用于属性的访问器
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }

    var heiht: Float = 145.4f
        private set
}

open class Base {
    open fun f() {}
}
abstract class Derived : Base() {
    abstract override fun f()
}

class Outer1 {                  // 外部类
    private val bar: Int = 1
    class Nested {             // 嵌套类
        fun foo() = 2
    }
}

class Outer2 {
    private val bar: Int = 1
    var v = "成员属性"
    /**嵌套内部类**/
    inner class Inner {
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
//            var o = this@Outer //获取外部类的成员变量
//            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}


