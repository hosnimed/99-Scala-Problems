package org.p99.scala

import org.scalatest._

class P17Spec extends UnitSpec {

  "split" should "split a list" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(P17.split(3, list) === (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))  )
    assert(P17.split(3, List.empty) === (List.empty, List.empty) )
  }

}

