package org.p99.scala

import org.scalatest._

class P11Spec extends UnitSpec {

  "encodeModified" should "encodeModified a list" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(P11.encodeModified(list) === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)) )
    assert(P11.encodeModified(List.empty) === List.empty)
  }

}

