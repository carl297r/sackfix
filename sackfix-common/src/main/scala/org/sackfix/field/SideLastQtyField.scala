package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideLastQtyField(override val value: Int) extends SfFieldInt(1009, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1009)SideLastQty=(").append(value).append(")")
}

object SideLastQtyField {
  val TagId = 1009  
  def apply(value: String) = try {
    new SideLastQtyField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SideLastQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SideLastQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideLastQtyField]
  }

  def decode(a: Any) : Option[SideLastQtyField] = a match {
    case v: String => Some(SideLastQtyField(v))
    case v: Int => Some(SideLastQtyField(v))
    case v: SideLastQtyField => Some(v)
    case _ => scala.Option.empty[SideLastQtyField]
  } 
}
