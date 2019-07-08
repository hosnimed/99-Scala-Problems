package org.p99.scala
object P20 {

  def removeAt[T](i: Int, list: List[T]): (List[T], T) = {
      if ( i >= list.size || list == Nil) throw new IllegalArgumentException
      val subList = list.zipWithIndex.filterNot{case (_, idx) => idx == i}.map(_._1)
      val element = list.zipWithIndex.filter{case (_, idx) => idx == i}.map(_._1).head
      (subList, element )
  }

}
