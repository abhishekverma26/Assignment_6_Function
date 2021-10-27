trait Function1[A, B]  {
  def add(x: Int,y:Int):Int

}

object function1 {
  val sum: Function1[Int, Int] = new Function1[Int,Int] {
    def add(num1: Int, num2:Int): Int = num1 + num2

  }
}