package org.p99.scala

import org.scalatest._

class P21Spec extends UnitSpec {

  "insertAt" should "insert an element in a list" in {
    assert(P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
    assert(P21.insertAt('new, 1, Nil) === List('new))

  }

}

