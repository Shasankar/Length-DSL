package com.shasank.funWithLengths

trait Adder extends Length {
  def +(other: Length) = super.operateOnMeasures(other, _+_)
}
