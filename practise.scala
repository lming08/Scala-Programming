object SayHello{
  def sayhello(msg: String ) = {
    println(msg);
  }
}

/*以下helloworld单例对象是helloworld类的 Companion Object*/
class helloworld(msg: String){
  def sayhello() = {
    val message = helloworld.say(msg)
    println(message)
  }
}

object helloworld {
    def say(msg:String ) = msg + ", hello world"
}

object Say {
  def main(args: Array[String]) {
    var hw:helloworld = new helloworld("Hi,my name is lming_08")
    hw.sayhello();
    
    val pair = (99, "abc")
    println(pair._1)
    println(pair._2)
    
    SayHello.sayhello("This is Scala Programming Language")
    
    var arr:Array[String] = new Array[String](3)
    arrLoop(arr)
    arrLoop2(arr)
    arrLoop3(arr)
  }
  
  def getStr(msg:String ) = msg + ", hello"
  
  def arrLoop(arr:Array[String]) = {
    arr(0) = "abc"
    arr(1) = "123"
    arr(2) = "ABC"
    for(elem <- arr)
      println( elem + ", hello")   
  }
  
  def arrLoop2(arr:Array[String]) = {
    arr(0) = "+abc"
    arr(1) = "+123"
    arr(2) = "+ABC"
    arr.foreach(elem => println(elem))
  }
  
  def arrLoop3(arr:Array[String]) = {
    arr(0) = "-abc"
    arr(1) = "-123"
    arr(2) = "-ABC"
    for(i <- 0 to arr.length - 1){
      println(arr(i))
    }
  }
}
