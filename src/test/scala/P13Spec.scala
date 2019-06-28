package org.p99.scala

import org.scalatest._

class P13Spec extends UnitSpec {

  "encodeDirect" should "encode Directly a list" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(P13.encodeDirect(list) ===  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)) )
    assert(P13.encodeDirect(List.empty) === List.empty)
  }

}

