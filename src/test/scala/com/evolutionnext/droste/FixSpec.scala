package com.evolutionnext.droste

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FixSpec extends AnyFunSpec with Matchers {
  describe("Fix is a type that represents a recursive structure") {
    it ("can be used for types like the following") {
        Fix[Option](Some(Fix[Option](Some(Fix[Option](None)))))
    }
  }
}
