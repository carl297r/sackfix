package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class StatusTextField(override val value: String) extends SfFieldString(929, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(929)StatusText=(").append(value).append(")")
}

object StatusTextField {
  val TagId = 929  
  def decode(a: Option[Any]) : Option[StatusTextField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StatusTextField]
  }

  def decode(a: Any) : Option[StatusTextField] = a match {
    case v: String => Some(StatusTextField(v))
    case v: StatusTextField => Some(v)
    case _ => scala.Option.empty[StatusTextField]
  } 
}
