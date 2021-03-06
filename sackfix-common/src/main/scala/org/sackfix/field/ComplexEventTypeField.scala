package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ComplexEventTypeField(override val value: Int) extends SfFieldInt(1484, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1484)ComplexEventType=(").append(value).append(")").append(ComplexEventTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ComplexEventTypeField {
  val TagId = 1484 
  val Capped=1
  val Trigger=2
  val KnockInUp=3
  val KockInDown=4
  val KnockOutUp=5
  val KnockOutDown=6
  val Underlying=7
  val ResetBarrier=8
  val RollingBarrier=9
  lazy val fixDescriptionByValue = Map(1->"CAPPED",2->"TRIGGER",
    3->"KNOCK_IN_UP",4->"KOCK_IN_DOWN",5->"KNOCK_OUT_UP",
    6->"KNOCK_OUT_DOWN",7->"UNDERLYING",8->"RESET_BARRIER",
    9->"ROLLING_BARRIER")
 
  def apply(value: String) = try {
    new ComplexEventTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ComplexEventType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ComplexEventTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ComplexEventTypeField]
  }

  def decode(a: Any) : Option[ComplexEventTypeField] = a match {
    case v: String => Some(ComplexEventTypeField(v))
    case v: Int => Some(ComplexEventTypeField(v))
    case v: ComplexEventTypeField => Some(v)
    case _ => scala.Option.empty[ComplexEventTypeField]
  } 
}
