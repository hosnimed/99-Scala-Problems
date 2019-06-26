package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  "length" should "return length of a list" in {
    assert(P04.length[Int](List(1,2,3)) === 3)
    assert(P04.length[Int](List.empty) === 0)
  }

}

