package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class AsgnRptIDField(override val value: String) extends SfFieldString(833, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(833)AsgnRptID=(").append(value).append(")")
}

object AsgnRptIDField {
  val TagId = 833  
  def decode(a: Option[Any]) : Option[AsgnRptIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AsgnRptIDField]
  }

  def decode(a: Any) : Option[AsgnRptIDField] = a match {
    case v: String => Some(AsgnRptIDField(v))
    case v: AsgnRptIDField => Some(v)
    case _ => scala.Option.empty[AsgnRptIDField]
  } 
}