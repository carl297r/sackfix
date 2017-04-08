package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLocaleOfIssueField(override val value: String) extends SfFieldString(594, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(594)UnderlyingLocaleOfIssue=(").append(value).append(")")
}

object UnderlyingLocaleOfIssueField {
  val TagId = 594  
  def decode(a: Option[Any]) : Option[UnderlyingLocaleOfIssueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLocaleOfIssueField]
  }

  def decode(a: Any) : Option[UnderlyingLocaleOfIssueField] = a match {
    case v: String => Some(UnderlyingLocaleOfIssueField(v))
    case v: UnderlyingLocaleOfIssueField => Some(v)
    case _ => scala.Option.empty[UnderlyingLocaleOfIssueField]
  } 
}