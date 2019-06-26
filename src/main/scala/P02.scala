package org.p99.scala

object P02 {

  def penultimate[T](list: List[T]) = list.drop(list.size - 2).head

}
