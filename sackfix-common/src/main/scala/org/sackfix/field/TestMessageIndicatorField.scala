package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170404
  */
case class TestMessageIndicatorField(override val value: Boolean) extends SfFieldBoolean(464, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(464)TestMessageIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object TestMessageIndicatorField {
  val TagId = 464  
  def apply(value: String) = try {
    new TestMessageIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("TestMessageIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TestMessageIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TestMessageIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TestMessageIndicatorField]
  }

  def decode(a: Any) : Option[TestMessageIndicatorField] = a match {
    case v: String => Some(TestMessageIndicatorField(v))
    case v: Boolean => Some(TestMessageIndicatorField(v))
    case v: TestMessageIndicatorField => Some(v)
    case _ => scala.Option.empty[TestMessageIndicatorField]
  } 
}