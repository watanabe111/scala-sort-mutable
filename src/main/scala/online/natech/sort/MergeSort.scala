package online.natech.sort

object MergeSort {
  def sort(array: Array[Int]) = {
    def mergeSort(array: Array[Int], n: Int, left: Int, right: Int): Unit = {
      if (left+1 < right) {
        val mid: Int = (left + right) / 2
        mergeSort(array, n, left, mid)
        mergeSort(array, n, mid, right)
        merge(array, n, left, mid, right)
      }
    }
    def merge(array: Array[Int], n: Int, left: Int, mid: Int, right: Int) = {
      var l = array.slice(left, mid)
      var r = array.slice(mid, right)
      l :+= Int.MaxValue
      r :+= Int.MaxValue
      var i = 0
      var j = 0
      for (k <- left until right) {
        if (l(i) <= r(j)) {
          array(k) = l(i)
          i += 1
        } else {
          array(k) = r(j)
          j += 1
        }
      }
    }
    
    mergeSort(array, array.length, 0, array.length)
  }
}
