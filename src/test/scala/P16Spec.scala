package org.p99.scala

import org.scalatest._

class P16Spec extends UnitSpec {

  "dropN" should "drop Nth element from a list" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(P16.dropN(3, list) === List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k) )
    assert(P16.dropN(3, List.empty) === List.empty)
  }

}

