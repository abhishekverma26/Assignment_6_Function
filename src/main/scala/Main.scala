object Main extends App{

  val obj1 = function1
  print(obj1.sum.add(9,3)+"\n")

  val obj2 = function2
  print(obj2.sol.sumOfList(List(2, 3, 5, 7, 11))+"\n")

  val obj3 = function3
  def func(num: Int): Int = num
  print(obj3.hof.higherOrderFunction(func, 26))

}
