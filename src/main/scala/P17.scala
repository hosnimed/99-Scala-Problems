package org.p99.scala

object P17 {

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    list.splitAt(n)
  }

}
