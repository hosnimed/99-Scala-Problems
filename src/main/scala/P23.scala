package org.p99.scala

import scala.collection.mutable
import scala.util.Random

object P23 {

  def randomSelect[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => Nil
    case _ =>
      var result : List[T] = list:::Nil // : collection.mutable.MutableList[T] = mutable.MutableList.empty[T]
      Range(0, n)
      .map(_ => {
        val i = Random.nextInt(result.size)
        val r = P20.removeAt(i, result)
        result = r._1 ::: Nil
        result
      })
        .flatten
      .toList
  }

}
