package org.p99.scala

import org.scalatest._

class P07Spec extends UnitSpec {

  "flatten" should "flatten a list" in {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
    assert(P07.flatten(List.empty) === List.empty)
  }


}

