package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldMonthYear
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class ContractSettlMonthField(override val value: LocalDate) extends SfFieldMonthYear(667, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(667)ContractSettlMonth=(").append(value).append(")")
}

object ContractSettlMonthField {
  val TagId = 667  
  def apply(value: String) = try {
    new ContractSettlMonthField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContractSettlMonth("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContractSettlMonthField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContractSettlMonthField]
  }

  def decode(a: Any) : Option[ContractSettlMonthField] = a match {
    case v: String => Some(ContractSettlMonthField(v))
    case v: LocalDate => Some(ContractSettlMonthField(v))
    case v: ContractSettlMonthField => Some(v)
    case _ => scala.Option.empty[ContractSettlMonthField]
  } 
}
