package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoTimeInForceRulesField(override val value: Int) extends SfNumInGroup(1239, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1239)NoTimeInForceRules=(").append(value).append(")")
}

object NoTimeInForceRulesField {
  val TagId = 1239  
  def apply(value: String) = try {
    new NoTimeInForceRulesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoTimeInForceRules("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoTimeInForceRulesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoTimeInForceRulesField]
  }

  def decode(a: Any) : Option[NoTimeInForceRulesField] = a match {
    case v: String => Some(NoTimeInForceRulesField(v))
    case v: Int => Some(NoTimeInForceRulesField(v))
    case v: NoTimeInForceRulesField => Some(v)
    case _ => scala.Option.empty[NoTimeInForceRulesField]
  } 
}
