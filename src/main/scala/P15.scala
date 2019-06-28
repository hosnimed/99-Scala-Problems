package org.p99.scala

object P15 {

  def duplicateN[T](n: Int, list: List[T]): List[T] = {
    list.map( x => List.fill(n)(x) ).flatten
  }

}
