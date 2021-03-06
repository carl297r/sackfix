package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DeliverToLocationIDField(override val value: String) extends SfFieldString(145, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(145)DeliverToLocationID=(").append(value).append(")")
}

object DeliverToLocationIDField {
  val TagId = 145  
  def decode(a: Option[Any]) : Option[DeliverToLocationIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeliverToLocationIDField]
  }

  def decode(a: Any) : Option[DeliverToLocationIDField] = a match {
    case v: String => Some(DeliverToLocationIDField(v))
    case v: DeliverToLocationIDField => Some(v)
    case _ => scala.Option.empty[DeliverToLocationIDField]
  } 
}
