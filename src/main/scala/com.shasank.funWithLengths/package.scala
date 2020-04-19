package com.shasank

package object funWithLengths {

  abstract class Length(val measure: Int, val unit: String) {

    private def convertToInches(length: Length) = length.unit match {
      case "feet" => length.measure * 12
      case "inches" => length.measure
    }

    protected def operateOnMeasures(other: Length, op: (Int, Int) => Int) = {
      val thisInches = convertToInches(this)
      val otherInches = convertToInches(other)
      val operatedMeasure = op(thisInches, otherInches)
      operatedMeasure inches
    }

    override def toString = {
      val measureInInches = convertToInches(this)
      val (feetMeasure, inchesMeasure) = BigInt(measureInInches) /% 12
      val feetMeasureString = s"$feetMeasure feet and"
      val inchesMeasureString = s"$inchesMeasure inches"
      s"$feetMeasureString $inchesMeasureString"
    }

  }

  implicit class Inches(measure: Int) extends Length(measure, "inches") with Adder with Subtracter {
    def inches = this
  }

  implicit class Feet(measure: Int) extends Length(measure, "feet") with Adder with Subtracter {
    def feet = this
  }

}
