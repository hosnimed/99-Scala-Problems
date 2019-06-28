package org.p99.scala

import org.scalatest._

class P19Spec extends UnitSpec {

  "rotate" should "rotate a list" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(P19.rotate(3, list) === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)  )
    assert(P19.rotate(-2, list) === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)  )
    assert(P19.rotate(3, List.empty) === (List.empty) )
  }

}

