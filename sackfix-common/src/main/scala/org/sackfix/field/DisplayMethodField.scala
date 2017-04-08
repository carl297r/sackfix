package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DisplayMethodField(override val value: String) extends SfFieldString(1084, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1084)DisplayMethod=(").append(value).append(")").append(DisplayMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object DisplayMethodField {
  val TagId = 1084 
  val Initial="1"
  val New="2"
  val Random="3"
  lazy val fixDescriptionByValue = Map("1"->"INITIAL","2"->"NEW",
    "3"->"RANDOM")
 
  def decode(a: Option[Any]) : Option[DisplayMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DisplayMethodField]
  }

  def decode(a: Any) : Option[DisplayMethodField] = a match {
    case v: String => Some(DisplayMethodField(v))
    case v: Char => Some(DisplayMethodField(v.toString))
    case v: DisplayMethodField => Some(v)
    case _ => scala.Option.empty[DisplayMethodField]
  } 
}