package online.natech.sort

object InsertionSort {
  def sort(array: Array[Int]) = {
    for (i <- 1 until array.length) {
      val v = array(i)
      var j = i-1
      while (j >= 0 && array(j) > v) {
        array(j+1) = array(j)
        j -= 1
      }
      array(j+1) = v
    }
  }
}
