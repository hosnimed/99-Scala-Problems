package org.p99.scala

object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    list.map{ case (i: Int, x: T) => List.fill(i)(x) }.flatten
  }

}
