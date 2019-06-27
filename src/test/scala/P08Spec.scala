package org.p99.scala

import org.scalatest._

class P08Spec extends UnitSpec {

  "compress" should "compress a list" in {

    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
//    println(list.mkString("|"))
    assert(P08.compress(list) ===  List('a, 'b, 'c, 'a, 'd, 'e))
    assert(P08.compress(List.empty) === List.empty)
  }

}

