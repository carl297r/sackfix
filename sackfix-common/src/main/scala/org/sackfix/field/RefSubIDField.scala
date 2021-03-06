package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class RefSubIDField(override val value: String) extends SfFieldString(931, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(931)RefSubID=(").append(value).append(")")
}

object RefSubIDField {
  val TagId = 931  
  def decode(a: Option[Any]) : Option[RefSubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefSubIDField]
  }

  def decode(a: Any) : Option[RefSubIDField] = a match {
    case v: String => Some(RefSubIDField(v))
    case v: RefSubIDField => Some(v)
    case _ => scala.Option.empty[RefSubIDField]
  } 
}
