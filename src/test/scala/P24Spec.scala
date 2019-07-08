package org.p99.scala

import org.scalatest._

class P24Spec extends UnitSpec {

  "lotto" should "Draw N different random numbers from the set" in {
    val list = P24.lotto(6, 49)
    println(list.mkString(":"))

    assert(list.size == 6)
    assert(list.max <= 49)
    assert(list.min >= 1)
  }

}

