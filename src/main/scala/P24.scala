package org.p99.scala

import scala.collection.immutable
import scala.util.Random

object P24 {

  def lotto(i: Int, n: Int): List[Int] = {
    1 to i map { x =>x
      List(Random.nextInt(n))
    }
      .toList
  }
}
