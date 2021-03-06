package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideTradeReportIDField(override val value: String) extends SfFieldString(1005, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1005)SideTradeReportID=(").append(value).append(")")
}

object SideTradeReportIDField {
  val TagId = 1005  
  def decode(a: Option[Any]) : Option[SideTradeReportIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideTradeReportIDField]
  }

  def decode(a: Any) : Option[SideTradeReportIDField] = a match {
    case v: String => Some(SideTradeReportIDField(v))
    case v: SideTradeReportIDField => Some(v)
    case _ => scala.Option.empty[SideTradeReportIDField]
  } 
}
