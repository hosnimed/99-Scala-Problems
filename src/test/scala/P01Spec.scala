package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec with Matchers {

  "last" should "return last element" in {
    assert(P01.last[Int](List(1,2,3)) === 3)
    assertThrows[java.util.NoSuchElementException](P01.last[Int](List.empty))
  }

}

