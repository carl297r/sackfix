package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class PositionLimitField(override val value: Int) extends SfFieldInt(970, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(970)PositionLimit=(").append(value).append(")")
}

object PositionLimitField {
  val TagId = 970  
  def apply(value: String) = try {
    new PositionLimitField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PositionLimit("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PositionLimitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PositionLimitField]
  }

  def decode(a: Any) : Option[PositionLimitField] = a match {
    case v: String => Some(PositionLimitField(v))
    case v: Int => Some(PositionLimitField(v))
    case v: PositionLimitField => Some(v)
    case _ => scala.Option.empty[PositionLimitField]
  } 
}
