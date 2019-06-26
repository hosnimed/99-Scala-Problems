package org.p99.scala

object P07 {

  def flatten[Any](lists: List[Any]):List[Any]= lists match {
    case Nil => Nil
    case (head:List[Any])::tail => flatten(head) ::: flatten(tail)
    case head::tail => head::flatten(tail)
  }

}
