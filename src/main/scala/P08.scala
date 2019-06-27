package org.p99.scala

object P08 {

  def compress[T](list: List[T]):List[T] = {
    list.headOption.map { x =>
      val (t1:List[T], t2:List[T]) = list.span {
        x ==
      }
//      println(s"${t1.mkString(":")} \t ${t2.mkString(":")}")
      t1.distinct:::compress(t2)
    }.getOrElse(List.empty[T])
  }
}
