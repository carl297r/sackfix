package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class MarginExcessField(override val value: Float) extends SfFieldFloat(899, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(899)MarginExcess=(").append(value).append(")")
}

object MarginExcessField {
  val TagId = 899  
  def apply(value: String) = try {
    new MarginExcessField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MarginExcess("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MarginExcessField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarginExcessField]
  }

  def decode(a: Any) : Option[MarginExcessField] = a match {
    case v: String => Some(MarginExcessField(v))
    case v: Float => Some(MarginExcessField(v))
    case v: Double => Some(MarginExcessField(v.toFloat))
    case v: Int => Some(MarginExcessField(v.toFloat))
    case v: MarginExcessField => Some(v)
    case _ => scala.Option.empty[MarginExcessField]
  } 
}
