package online.natech.sort

object BubbleSort {
  def sort(array: Array[Int]) = {
    for (i <- array.length-1 to 1 by -1) {
      for (j <- 0 until i) {
        if (array(i) < array(j)) {
          val tmp = array(i)
          array(i) = array(j)
          array(j) = tmp
        }
      }
    }
  }
}
