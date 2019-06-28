package org.p99.scala

object P14 {

  def duplicate[T](list: List[T]): List[T] = {
    list.map( x => List.fill(2)(x) ).flatten
  }

}
