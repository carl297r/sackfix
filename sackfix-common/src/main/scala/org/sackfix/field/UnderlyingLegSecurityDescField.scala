package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLegSecurityDescField(override val value: String) extends SfFieldString(1392, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1392)UnderlyingLegSecurityDesc=(").append(value).append(")")
}

object UnderlyingLegSecurityDescField {
  val TagId = 1392  
  def decode(a: Option[Any]) : Option[UnderlyingLegSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegSecurityDescField]
  }

  def decode(a: Any) : Option[UnderlyingLegSecurityDescField] = a match {
    case v: String => Some(UnderlyingLegSecurityDescField(v))
    case v: UnderlyingLegSecurityDescField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegSecurityDescField]
  } 
}
