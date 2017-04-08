package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLegPutOrCallField(override val value: Int) extends SfFieldInt(1343, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1343)UnderlyingLegPutOrCall=(").append(value).append(")")
}

object UnderlyingLegPutOrCallField {
  val TagId = 1343  
  def apply(value: String) = try {
    new UnderlyingLegPutOrCallField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingLegPutOrCall("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingLegPutOrCallField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegPutOrCallField]
  }

  def decode(a: Any) : Option[UnderlyingLegPutOrCallField] = a match {
    case v: String => Some(UnderlyingLegPutOrCallField(v))
    case v: Int => Some(UnderlyingLegPutOrCallField(v))
    case v: UnderlyingLegPutOrCallField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegPutOrCallField]
  } 
}