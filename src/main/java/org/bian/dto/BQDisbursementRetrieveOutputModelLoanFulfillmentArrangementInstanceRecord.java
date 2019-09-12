package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord
 */
public class BQDisbursementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String loanNumber = null;

  private String customerReference = null;

  private String partyReference = null;

  private String loanOriginationDate = null;

  private String loanOutstandingBalance = null;

  private CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the loan product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated loan account number in any suitable format 
   * @return loanNumber
  **/

  public String getLoanNumber() {
    return loanNumber;
  }

  public void setLoanNumber(String loanNumber) {
    this.loanNumber = loanNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The legal entity reference for the borrower, likely to be the same as customer 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The origination date for the loan 
   * @return loanOriginationDate
  **/

  public String getLoanOriginationDate() {
    return loanOriginationDate;
  }

  public void setLoanOriginationDate(String loanOriginationDate) {
    this.loanOriginationDate = loanOriginationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outstanding balance 
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

