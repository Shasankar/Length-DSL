package com.shasank.funWithLengths

import org.scalatest.{FunSuite, Matchers}

class LengthOperationTest extends FunSuite with Matchers{
  test("inches declaration check"){
    val length = 10 inches;
    length.toString should be ("0 feet and 10 inches")
  }
  test("feet declaration check"){
    val length = 2 feet;
    length.measure should be (2)
    length.unit should be ("feet")
  }
  test("sum of 2 lengths"){
    val length1 = 11 inches;
    val length2 = 15 inches;
    val sum = length1 + length2
    sum.toString should be ("2 feet and 2 inches")
  }
  test("sum of 3 lengths"){
    val length1 = 9 inches;
    val length2 = 2 feet;
    val length3 = 27 inches;
    val sum = length1 + length2 + length3
    sum.toString should be ("5 feet and 0 inches")
  }
  test("addition and subtraction of lengths"){
    val length1 = 9 inches;
    val length2 = 2 feet;
    val length3 = 27 inches;
    val sum = length3 - length2 + length1
    sum.toString should be ("1 feet and 0 inches")
  }
}
