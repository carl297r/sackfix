package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class PriceField(override val value: Float) extends SfFieldFloat(44, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(44)Price=(").append(value).append(")")
}

object PriceField {
  val TagId = 44  
  def apply(value: String) = try {
    new PriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Price("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriceField]
  }

  def decode(a: Any) : Option[PriceField] = a match {
    case v: String => Some(PriceField(v))
    case v: Float => Some(PriceField(v))
    case v: Double => Some(PriceField(v.toFloat))
    case v: Int => Some(PriceField(v.toFloat))
    case v: PriceField => Some(v)
    case _ => scala.Option.empty[PriceField]
  } 
}
