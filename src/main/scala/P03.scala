package org.p99.scala

object P03 {

  def nth[T](n: Int, list: List[T]) = {
    require( n >= 0)
    list(n)
  }

}
