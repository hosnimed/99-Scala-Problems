package org.p99.scala

import org.scalatest._

class P10Spec extends UnitSpec {

  "encode" should "encode a list" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(P10.encode(list) === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)) )
    assert(P10.encode(List.empty) === List.empty)
  }

}

