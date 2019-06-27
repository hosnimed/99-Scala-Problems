package org.p99.scala

object P10 {

  def encode[T](list: List[T]):List[(Int, T)] = {
    P09.pack(list).map(xs => (xs.size, xs.head))
  }

}
