package org.p99.scala

object P19 {

  def rotate[T](i: Int, list: List[T]): List[T] = i match {
    case x if x > 0 => val (l1, l2) = P17.split(i, list)
      l2:::l1
    case x if x < 0 => val (l1, l2) = P17.split(list.size + i, list)
      l2:::l1

  }

}
