package org.p99.scala

object P18 {

  def slice[T](i: Int, k:Int, list: List[T]): List[T] = {
    list.slice(i, k)
  }

}