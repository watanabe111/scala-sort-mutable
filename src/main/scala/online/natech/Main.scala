package online.natech

import online.natech.sort._

object Main {
  def main(args: Array[String]) = {
    var array = Array(5,1,3,2,4,4,9)
    
    println("*** unsorted array ***")
    println(array.mkString(" "))
    
    // call sort
    // 選択ソート
    // SelectionSort.sort(array)
    // バブルソート
    // BubbleSort.sort(array)
    // 挿入ソート
    // InsertionSort.sort(array)
    // マージソート
    // MergeSort.sort(array)
    
    println("*** sorted array ***")
    println(array.mkString(" "))
  }
}
