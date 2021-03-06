package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class CashSettlAgentContactPhoneField(override val value: String) extends SfFieldString(187, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(187)CashSettlAgentContactPhone=(").append(value).append(")")
}

object CashSettlAgentContactPhoneField {
  val TagId = 187  
  def decode(a: Option[Any]) : Option[CashSettlAgentContactPhoneField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashSettlAgentContactPhoneField]
  }

  def decode(a: Any) : Option[CashSettlAgentContactPhoneField] = a match {
    case v: String => Some(CashSettlAgentContactPhoneField(v))
    case v: CashSettlAgentContactPhoneField => Some(v)
    case _ => scala.Option.empty[CashSettlAgentContactPhoneField]
  } 
}
