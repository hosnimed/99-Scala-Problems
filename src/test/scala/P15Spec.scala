package org.p99.scala

import org.scalatest._

class P15Spec extends UnitSpec {

  "duplicateN" should "duplicate every element in a list n times" in {
    val list = List('a, 'b, 'c, 'c, 'd)
    assert(P15.duplicateN(3, list) === List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd) )
    assert(P15.duplicateN(3, List.empty) === List.empty)
  }

}

