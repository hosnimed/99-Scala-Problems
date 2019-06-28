package org.p99.scala

import org.scalatest._

class P20Spec extends UnitSpec {

  "removeAt" should "remove an element from list" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(P20.removeAt(3, list) === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)  )
    assert(P19.rotate(-2, list) === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)  )
    assert(P19.rotate(3, List.empty) === (List.empty) )
  }
}

