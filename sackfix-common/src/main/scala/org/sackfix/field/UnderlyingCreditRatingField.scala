package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingCreditRatingField(override val value: String) extends SfFieldString(256, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(256)UnderlyingCreditRating=(").append(value).append(")")
}

object UnderlyingCreditRatingField {
  val TagId = 256  
  def decode(a: Option[Any]) : Option[UnderlyingCreditRatingField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingCreditRatingField]
  }

  def decode(a: Any) : Option[UnderlyingCreditRatingField] = a match {
    case v: String => Some(UnderlyingCreditRatingField(v))
    case v: UnderlyingCreditRatingField => Some(v)
    case _ => scala.Option.empty[UnderlyingCreditRatingField]
  } 
}
