package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModelDisbursementInstanceRecord
 */
public class BQDisbursementRetrieveOutputModelDisbursementInstanceRecord   {
  private String disbursementPayeeReference = null;

  private String disbursementPayeeProductInstanceReference = null;

  private String disbursementPayeeBankReference = null;

  private String disbursementAmount = null;

  private String disbursementCurrency = null;

  private String disbursementValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party to whom the payment is made 
   * @return disbursementPayeeReference
  **/

  public String getDisbursementPayeeReference() {
    return disbursementPayeeReference;
  }

  public void setDisbursementPayeeReference(String disbursementPayeeReference) {
    this.disbursementPayeeReference = disbursementPayeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account to which the payment is made 
   * @return disbursementPayeeProductInstanceReference
  **/

  public String getDisbursementPayeeProductInstanceReference() {
    return disbursementPayeeProductInstanceReference;
  }

  public void setDisbursementPayeeProductInstanceReference(String disbursementPayeeProductInstanceReference) {
    this.disbursementPayeeProductInstanceReference = disbursementPayeeProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank where the payee account is held 
   * @return disbursementPayeeBankReference
  **/

  public String getDisbursementPayeeBankReference() {
    return disbursementPayeeBankReference;
  }

  public void setDisbursementPayeeBankReference(String disbursementPayeeBankReference) {
    this.disbursementPayeeBankReference = disbursementPayeeBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the payment 
   * @return disbursementAmount
  **/

  public String getDisbursementAmount() {
    return disbursementAmount;
  }

  public void setDisbursementAmount(String disbursementAmount) {
    this.disbursementAmount = disbursementAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency of the payment 
   * @return disbursementCurrency
  **/

  public String getDisbursementCurrency() {
    return disbursementCurrency;
  }

  public void setDisbursementCurrency(String disbursementCurrency) {
    this.disbursementCurrency = disbursementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The value date for the payment transaction 
   * @return disbursementValueDate
  **/

  public String getDisbursementValueDate() {
    return disbursementValueDate;
  }

  public void setDisbursementValueDate(String disbursementValueDate) {
    this.disbursementValueDate = disbursementValueDate;
  }


}

