package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  "length" should "reverse a list" in {
    assert(P05.reverse[Int](List(1,2,3)) === List(3,2,1))
    assert(P05.reverse[Int](List.empty) === List.empty)
  }

}

