package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLegSecurityIDSourceField(override val value: String) extends SfFieldString(1333, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1333)UnderlyingLegSecurityIDSource=(").append(value).append(")")
}

object UnderlyingLegSecurityIDSourceField {
  val TagId = 1333  
  def decode(a: Option[Any]) : Option[UnderlyingLegSecurityIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegSecurityIDSourceField]
  }

  def decode(a: Any) : Option[UnderlyingLegSecurityIDSourceField] = a match {
    case v: String => Some(UnderlyingLegSecurityIDSourceField(v))
    case v: UnderlyingLegSecurityIDSourceField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegSecurityIDSourceField]
  } 
}