package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class StreamAsgnRptIDField(override val value: String) extends SfFieldString(1501, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1501)StreamAsgnRptID=(").append(value).append(")")
}

object StreamAsgnRptIDField {
  val TagId = 1501  
  def decode(a: Option[Any]) : Option[StreamAsgnRptIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StreamAsgnRptIDField]
  }

  def decode(a: Any) : Option[StreamAsgnRptIDField] = a match {
    case v: String => Some(StreamAsgnRptIDField(v))
    case v: StreamAsgnRptIDField => Some(v)
    case _ => scala.Option.empty[StreamAsgnRptIDField]
  } 
}