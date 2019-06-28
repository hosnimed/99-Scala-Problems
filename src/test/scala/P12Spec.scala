package org.p99.scala

import org.scalatest._

class P12Spec extends UnitSpec {

  "decode" should "decode an ecoded list" in {
    val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    assert(P12.decode(list) === List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) )
    assert(P12.decode(List.empty) === List.empty)
  }

}

