package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class GTBookingInstField(override val value: Int) extends SfFieldInt(427, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(427)GTBookingInst=(").append(value).append(")").append(GTBookingInstField.fixDescriptionByValue.getOrElse(value,""))
}

object GTBookingInstField {
  val TagId = 427 
  val BookOutAllTradesOnDayOfExecution=0
  val AccumulateExecutionsUntilOrderIsFilledOrExpires=1
  val AccumulateUntilVerballyNotifiedOtherwise=2
  lazy val fixDescriptionByValue = Map(0->"BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION",1->"ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES",
    2->"ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE")
 
  def apply(value: String) = try {
    new GTBookingInstField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new GTBookingInst("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[GTBookingInstField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[GTBookingInstField]
  }

  def decode(a: Any) : Option[GTBookingInstField] = a match {
    case v: String => Some(GTBookingInstField(v))
    case v: Int => Some(GTBookingInstField(v))
    case v: GTBookingInstField => Some(v)
    case _ => scala.Option.empty[GTBookingInstField]
  } 
}