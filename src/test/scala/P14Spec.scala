package org.p99.scala

import org.scalatest._

class P14Spec extends UnitSpec {

  "duplicate" should "duplicate every element in a list" in {
    val list = List('a, 'b, 'c, 'c, 'd)
    assert(P14.duplicate(list) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd) )
    assert(P14.duplicate(List.empty) === List.empty)
  }

}

