package online.natech.sort

object SelectionSort {
  def sort(array: Array[Int]) = {
    for (i <- 0 until array.length) {
      var minIndex = i
      var minVal = array(i)
      for (j <- i+1 until array.length) {
        if (minVal > array(j)) {
          minIndex = j
          minVal = array(j)
        }
      }
      val tmp = array(i)
      array(i) = array(minIndex)
      array(minIndex) = tmp
    }
  }
}
