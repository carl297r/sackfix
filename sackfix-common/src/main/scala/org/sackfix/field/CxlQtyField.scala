package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class CxlQtyField(override val value: Float) extends SfFieldFloat(84, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(84)CxlQty=(").append(value).append(")")
}

object CxlQtyField {
  val TagId = 84  
  def apply(value: String) = try {
    new CxlQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CxlQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CxlQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CxlQtyField]
  }

  def decode(a: Any) : Option[CxlQtyField] = a match {
    case v: String => Some(CxlQtyField(v))
    case v: Float => Some(CxlQtyField(v))
    case v: Double => Some(CxlQtyField(v.toFloat))
    case v: Int => Some(CxlQtyField(v.toFloat))
    case v: CxlQtyField => Some(v)
    case _ => scala.Option.empty[CxlQtyField]
  } 
}
