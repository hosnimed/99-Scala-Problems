package org.p99.scala

object P09 {
  def pack[T](list: List[T]):List[List[T]] = {
    list.headOption.map { x =>
      val (t1:List[T], t2:List[T]) = list.span {
        x ==
      }
        //    println(s"${t1.mkString(":")} \t ${t2.mkString(":")}")
      t1::pack(t2)
    }.getOrElse(List.empty[List[T]])
  }

}
