package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeCountryOfIssueField(override val value: String) extends SfFieldString(1258, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1258)DerivativeCountryOfIssue=(").append(value).append(")")
}

object DerivativeCountryOfIssueField {
  val TagId = 1258  
  def decode(a: Option[Any]) : Option[DerivativeCountryOfIssueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeCountryOfIssueField]
  }

  def decode(a: Any) : Option[DerivativeCountryOfIssueField] = a match {
    case v: String => Some(DerivativeCountryOfIssueField(v))
    case v: DerivativeCountryOfIssueField => Some(v)
    case _ => scala.Option.empty[DerivativeCountryOfIssueField]
  } 
}
