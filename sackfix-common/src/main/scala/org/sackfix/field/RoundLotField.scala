package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class RoundLotField(override val value: Float) extends SfFieldFloat(561, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(561)RoundLot=(").append(value).append(")")
}

object RoundLotField {
  val TagId = 561  
  def apply(value: String) = try {
    new RoundLotField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RoundLot("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RoundLotField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RoundLotField]
  }

  def decode(a: Any) : Option[RoundLotField] = a match {
    case v: String => Some(RoundLotField(v))
    case v: Float => Some(RoundLotField(v))
    case v: Double => Some(RoundLotField(v.toFloat))
    case v: Int => Some(RoundLotField(v.toFloat))
    case v: RoundLotField => Some(v)
    case _ => scala.Option.empty[RoundLotField]
  } 
}
