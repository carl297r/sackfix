package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class NumTicketsField(override val value: Int) extends SfFieldInt(395, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(395)NumTickets=(").append(value).append(")")
}

object NumTicketsField {
  val TagId = 395  
  def apply(value: String) = try {
    new NumTicketsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NumTickets("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NumTicketsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NumTicketsField]
  }

  def decode(a: Any) : Option[NumTicketsField] = a match {
    case v: String => Some(NumTicketsField(v))
    case v: Int => Some(NumTicketsField(v))
    case v: NumTicketsField => Some(v)
    case _ => scala.Option.empty[NumTicketsField]
  } 
}