package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegBenchmarkCurvePointField(override val value: String) extends SfFieldString(678, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(678)LegBenchmarkCurvePoint=(").append(value).append(")")
}

object LegBenchmarkCurvePointField {
  val TagId = 678  
  def decode(a: Option[Any]) : Option[LegBenchmarkCurvePointField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegBenchmarkCurvePointField]
  }

  def decode(a: Any) : Option[LegBenchmarkCurvePointField] = a match {
    case v: String => Some(LegBenchmarkCurvePointField(v))
    case v: LegBenchmarkCurvePointField => Some(v)
    case _ => scala.Option.empty[LegBenchmarkCurvePointField]
  } 
}
