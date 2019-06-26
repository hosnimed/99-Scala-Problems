package org.p99.scala

import org.scalatest._

class P06Spec extends UnitSpec {

  "isPalindrome" should "verify that a list is Palindrome" in {
    assert(P06.isPalindrome[Int](List(1,2,3,2,1)))
    assert(P06.isPalindrome[Int](List.empty))
  }

}

