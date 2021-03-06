package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class InstrumentPartyRoleField(override val value: Int) extends SfFieldInt(1051, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1051)InstrumentPartyRole=(").append(value).append(")")
}

object InstrumentPartyRoleField {
  val TagId = 1051  
  def apply(value: String) = try {
    new InstrumentPartyRoleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new InstrumentPartyRole("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[InstrumentPartyRoleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InstrumentPartyRoleField]
  }

  def decode(a: Any) : Option[InstrumentPartyRoleField] = a match {
    case v: String => Some(InstrumentPartyRoleField(v))
    case v: Int => Some(InstrumentPartyRoleField(v))
    case v: InstrumentPartyRoleField => Some(v)
    case _ => scala.Option.empty[InstrumentPartyRoleField]
  } 
}
