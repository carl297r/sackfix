package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoSettlObligField(override val value: Int) extends SfNumInGroup(1165, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1165)NoSettlOblig=(").append(value).append(")")
}

object NoSettlObligField {
  val TagId = 1165  
  def apply(value: String) = try {
    new NoSettlObligField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoSettlOblig("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoSettlObligField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoSettlObligField]
  }

  def decode(a: Any) : Option[NoSettlObligField] = a match {
    case v: String => Some(NoSettlObligField(v))
    case v: Int => Some(NoSettlObligField(v))
    case v: NoSettlObligField => Some(v)
    case _ => scala.Option.empty[NoSettlObligField]
  } 
}