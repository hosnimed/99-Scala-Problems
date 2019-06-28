package org.p99.scala

object P16 {

  def dropN[T](n: Int, list: List[T]): List[T] = {
    list.grouped(n).flatMap{ case xs => println(xs.mkString(":")); xs.take(n-1)}.toList
  }

}