package org.p99.scala

import org.scalatest._

class P23Spec extends UnitSpec {

  "randomSelect" should "Extract a given number of randomly selected elements from a list." in  {
    val list = List('a,'b, 'c, 'd, 'e, 'f)
    val r1: List[Symbol] = P23.randomSelect(2, list)
    val r2: List[Symbol] = P23.randomSelect(2, list)

    assert(r1.size === 4)
    assert(r1.size === r2.size)
    assert(r1 !== r2)
//    assert(P23.randomSelect(5, Nil) === Nil)
  }

}
