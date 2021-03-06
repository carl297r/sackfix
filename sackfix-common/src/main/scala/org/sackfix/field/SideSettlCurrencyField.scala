package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideSettlCurrencyField(override val value: String) extends SfFieldString(1155, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1155)SideSettlCurrency=(").append(value).append(")")
}

object SideSettlCurrencyField {
  val TagId = 1155  
  def decode(a: Option[Any]) : Option[SideSettlCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideSettlCurrencyField]
  }

  def decode(a: Any) : Option[SideSettlCurrencyField] = a match {
    case v: String => Some(SideSettlCurrencyField(v))
    case v: SideSettlCurrencyField => Some(v)
    case _ => scala.Option.empty[SideSettlCurrencyField]
  } 
}
