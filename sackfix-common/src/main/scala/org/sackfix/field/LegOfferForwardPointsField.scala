package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegOfferForwardPointsField(override val value: Float) extends SfFieldFloat(1068, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1068)LegOfferForwardPoints=(").append(value).append(")")
}

object LegOfferForwardPointsField {
  val TagId = 1068  
  def apply(value: String) = try {
    new LegOfferForwardPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegOfferForwardPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegOfferForwardPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegOfferForwardPointsField]
  }

  def decode(a: Any) : Option[LegOfferForwardPointsField] = a match {
    case v: String => Some(LegOfferForwardPointsField(v))
    case v: Float => Some(LegOfferForwardPointsField(v))
    case v: Double => Some(LegOfferForwardPointsField(v.toFloat))
    case v: Int => Some(LegOfferForwardPointsField(v.toFloat))
    case v: LegOfferForwardPointsField => Some(v)
    case _ => scala.Option.empty[LegOfferForwardPointsField]
  } 
}
