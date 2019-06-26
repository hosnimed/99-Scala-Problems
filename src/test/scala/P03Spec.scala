package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  "nth" should "return the nth element" in {
    assert(P03.nth[Int](2, List(1,2,3)) === 3)
    assertThrows[java.lang.IllegalArgumentException](P03.nth[Int](-1, List.empty))
    assertThrows[java.lang.IndexOutOfBoundsException](P03.nth[Int](0, List.empty))
  }

}