package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedHeadlineLenField(override val value: Int) extends SfFieldInt(358, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(358)EncodedHeadlineLen=(").append(value).append(")")
}

object EncodedHeadlineLenField {
  val TagId = 358  
  def apply(value: String) = try {
    new EncodedHeadlineLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedHeadlineLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedHeadlineLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedHeadlineLenField]
  }

  def decode(a: Any) : Option[EncodedHeadlineLenField] = a match {
    case v: String => Some(EncodedHeadlineLenField(v))
    case v: Int => Some(EncodedHeadlineLenField(v))
    case v: EncodedHeadlineLenField => Some(v)
    case _ => scala.Option.empty[EncodedHeadlineLenField]
  } 
}