package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLegMaturityDateField(override val value: LocalDate) extends SfFieldLocalMktDate(1345, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1345)UnderlyingLegMaturityDate=(").append(value).append(")")
}

object UnderlyingLegMaturityDateField {
  val TagId = 1345  
  def apply(value: String) = try {
    new UnderlyingLegMaturityDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingLegMaturityDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingLegMaturityDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegMaturityDateField]
  }

  def decode(a: Any) : Option[UnderlyingLegMaturityDateField] = a match {
    case v: String => Some(UnderlyingLegMaturityDateField(v))
    case v: LocalDate => Some(UnderlyingLegMaturityDateField(v))
    case v: UnderlyingLegMaturityDateField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegMaturityDateField]
  } 
}