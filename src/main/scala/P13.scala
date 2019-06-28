package org.p99.scala

object P13 {

  def encodeDirect[T](list: List[T]):List[(Int, T)] = {
    list.headOption.map { x =>
      val (t1:List[T], t2:List[T]) = list.span {
        x ==
      }
      (t1.size, t1.head)::encodeDirect(t2)
    }.getOrElse(List.empty)
  }

}
