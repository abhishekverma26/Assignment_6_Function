object Main extends App{

  val obj1 = function1
  println(obj1.sum.add(9,3))

  val obj2 = function2
  println(obj2.sol.sumOfList(List(2, 3, 5, 7, 11)))

  val obj3 = function3
  def func(num: Int): Int = num
  println(obj3.hof.higherOrderFunction(func, 26))

}
