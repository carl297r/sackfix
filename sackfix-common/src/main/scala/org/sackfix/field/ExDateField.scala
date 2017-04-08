package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExDateField(override val value: LocalDate) extends SfFieldLocalMktDate(230, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(230)ExDate=(").append(value).append(")")
}

object ExDateField {
  val TagId = 230  
  def apply(value: String) = try {
    new ExDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExDateField]
  }

  def decode(a: Any) : Option[ExDateField] = a match {
    case v: String => Some(ExDateField(v))
    case v: LocalDate => Some(ExDateField(v))
    case v: ExDateField => Some(v)
    case _ => scala.Option.empty[ExDateField]
  } 
}