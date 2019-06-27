package org.p99.scala

import org.scalatest._

class P09Spec extends UnitSpec {

  "pack" should "pack a list into sublists" in {

    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    //    println(list.mkString("|"))
    assert(P09.pack(list) ===  List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    assert(P09.pack(List.empty) === List.empty)
  }

}

