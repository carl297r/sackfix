package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegLastPxField(override val value: Float) extends SfFieldFloat(637, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(637)LegLastPx=(").append(value).append(")")
}

object LegLastPxField {
  val TagId = 637  
  def apply(value: String) = try {
    new LegLastPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegLastPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegLastPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegLastPxField]
  }

  def decode(a: Any) : Option[LegLastPxField] = a match {
    case v: String => Some(LegLastPxField(v))
    case v: Float => Some(LegLastPxField(v))
    case v: Double => Some(LegLastPxField(v.toFloat))
    case v: Int => Some(LegLastPxField(v.toFloat))
    case v: LegLastPxField => Some(v)
    case _ => scala.Option.empty[LegLastPxField]
  } 
}