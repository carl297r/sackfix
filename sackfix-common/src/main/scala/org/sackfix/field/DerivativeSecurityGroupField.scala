package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeSecurityGroupField(override val value: String) extends SfFieldString(1247, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1247)DerivativeSecurityGroup=(").append(value).append(")")
}

object DerivativeSecurityGroupField {
  val TagId = 1247  
  def decode(a: Option[Any]) : Option[DerivativeSecurityGroupField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityGroupField]
  }

  def decode(a: Any) : Option[DerivativeSecurityGroupField] = a match {
    case v: String => Some(DerivativeSecurityGroupField(v))
    case v: DerivativeSecurityGroupField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityGroupField]
  } 
}
