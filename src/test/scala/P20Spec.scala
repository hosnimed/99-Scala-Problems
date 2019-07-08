package org.p99.scala

import org.scalatest._

class P20Spec extends UnitSpec {

  "removeAt" should "remove an element from list" in {
    val list = List('a, 'b, 'c, 'd)
    assert(P20.removeAt(1, list) == (List('a, 'c, 'd), 'b)  )
   }
}

