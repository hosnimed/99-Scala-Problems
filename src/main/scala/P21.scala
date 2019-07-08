package org.p99.scala

object P21 {

  def insertAt[T](element: T, i: Int, list: List[T]): List[T] = list match {
    case Nil => element::Nil
    case _ =>
      val (t1, t2) = list.splitAt(i)
      t1:::(element::t2)
  }

}
