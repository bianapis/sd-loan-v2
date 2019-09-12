package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord
 */
public class BQInterestRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String loanNumber = null;

  private String loanType = null;

  private String loanAmount = null;

  private String loanCurrency = null;

  private String loanRateType = null;

  private String loanApplicableRate = null;

  private String interestType = null;

  private String interestAccrualMethod = null;

  private String loanOriginationDate = null;

  private String loanMaturityDate = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific type of loan (e.g. term, revolving, evergreen) 
   * @return loanType
  **/

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the loan 
   * @return loanAmount
  **/

  public String getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(String loanAmount) {
    this.loanAmount = loanAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the loan account 
   * @return loanCurrency
  **/

  public String getLoanCurrency() {
    return loanCurrency;
  }

  public void setLoanCurrency(String loanCurrency) {
    this.loanCurrency = loanCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The rate type to be applied to the loan 
   * @return loanRateType
  **/

  public String getLoanRateType() {
    return loanRateType;
  }

  public void setLoanRateType(String loanRateType) {
    this.loanRateType = loanRateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The applicable rate for the loan 
   * @return loanApplicableRate
  **/

  public String getLoanApplicableRate() {
    return loanApplicableRate;
  }

  public void setLoanApplicableRate(String loanApplicableRate) {
    this.loanApplicableRate = loanApplicableRate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of interest to be applied (e.g. prime plus) 
   * @return interestType
  **/

  public String getInterestType() {
    return interestType;
  }

  public void setInterestType(String interestType) {
    this.interestType = interestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The accrual method applied to interest calculations 
   * @return interestAccrualMethod
  **/

  public String getInterestAccrualMethod() {
    return interestAccrualMethod;
  }

  public void setInterestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The planned maturity date of the loan 
   * @return loanMaturityDate
  **/

  public String getLoanMaturityDate() {
    return loanMaturityDate;
  }

  public void setLoanMaturityDate(String loanMaturityDate) {
    this.loanMaturityDate = loanMaturityDate;
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

