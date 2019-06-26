package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {


  "penultimate" should "return the penultimate element" in {
    assert(P02.penultimate[Int](List(1,2,3)) === 2)
    assertThrows[java.util.NoSuchElementException](P02.penultimate[Int](List.empty))
  }


}

