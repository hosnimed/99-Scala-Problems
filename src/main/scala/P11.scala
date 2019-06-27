package org.p99.scala

object P11 {

  def encodeModified[T](list: List[T]): List[Any]={
    P10.encode(list).map {
      case (s,e) if s == 1 => e
      case (s,e) => (s, e)
    }
  }

}
