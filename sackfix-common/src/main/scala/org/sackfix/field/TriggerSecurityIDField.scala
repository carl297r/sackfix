package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TriggerSecurityIDField(override val value: String) extends SfFieldString(1104, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1104)TriggerSecurityID=(").append(value).append(")")
}

object TriggerSecurityIDField {
  val TagId = 1104  
  def decode(a: Option[Any]) : Option[TriggerSecurityIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerSecurityIDField]
  }

  def decode(a: Any) : Option[TriggerSecurityIDField] = a match {
    case v: String => Some(TriggerSecurityIDField(v))
    case v: TriggerSecurityIDField => Some(v)
    case _ => scala.Option.empty[TriggerSecurityIDField]
  } 
}