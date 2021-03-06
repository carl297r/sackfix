package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class DefOfferSizeField(override val value: Float) extends SfFieldFloat(294, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(294)DefOfferSize=(").append(value).append(")")
}

object DefOfferSizeField {
  val TagId = 294  
  def apply(value: String) = try {
    new DefOfferSizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DefOfferSize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DefOfferSizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DefOfferSizeField]
  }

  def decode(a: Any) : Option[DefOfferSizeField] = a match {
    case v: String => Some(DefOfferSizeField(v))
    case v: Float => Some(DefOfferSizeField(v))
    case v: Double => Some(DefOfferSizeField(v.toFloat))
    case v: Int => Some(DefOfferSizeField(v.toFloat))
    case v: DefOfferSizeField => Some(v)
    case _ => scala.Option.empty[DefOfferSizeField]
  } 
}
