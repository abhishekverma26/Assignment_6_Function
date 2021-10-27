trait Function2[list] {
  def sumOfList(list: List[Int]):Int

}

object function2 {
  val sol: Function2[List[Int]] = new Function2[List[Int]] {
    def sumOfList(list: List[Int]): Int = list.sum

  }
}