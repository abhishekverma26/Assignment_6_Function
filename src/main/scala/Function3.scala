trait Function3 {
  def higherOrderFunction(f: (Int => Int), num : Int):Int

}

object function3 {
  val hof: Function3 = new Function3 {
    def higherOrderFunction(f: (Int => Int), num: Int): Int = f(num)

  }
}