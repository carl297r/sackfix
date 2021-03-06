package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class NumberOfOrdersField(override val value: Int) extends SfFieldInt(346, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(346)NumberOfOrders=(").append(value).append(")")
}

object NumberOfOrdersField {
  val TagId = 346  
  def apply(value: String) = try {
    new NumberOfOrdersField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NumberOfOrders("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NumberOfOrdersField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NumberOfOrdersField]
  }

  def decode(a: Any) : Option[NumberOfOrdersField] = a match {
    case v: String => Some(NumberOfOrdersField(v))
    case v: Int => Some(NumberOfOrdersField(v))
    case v: NumberOfOrdersField => Some(v)
    case _ => scala.Option.empty[NumberOfOrdersField]
  } 
}
