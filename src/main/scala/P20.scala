package org.p99.scala

object P20 {

  def removeAt[T](i: Int, list: List[T]): (List[T], T) = {
    val subList = list.zipWithIndex.filter{case (_, idx) => idx == i}.map(_._1)
    val element = list.zipWithIndex.filterNot{case (_, idx) => idx == i}.map(_._1).head
    (subList, element )
  }

}
