package com.shasank.funWithLengths

trait Subtracter extends Length {
  def -(other: Length) = super.operateOnMeasures(other, _-_)
}
