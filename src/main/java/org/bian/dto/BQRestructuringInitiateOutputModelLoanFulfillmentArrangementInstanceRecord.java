package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateOutputModelLoanFulfillmentArrangementInstanceRecord
 */
public class BQRestructuringInitiateOutputModelLoanFulfillmentArrangementInstanceRecord   {
  private String stagedRepaymentStatement = null;

  private String customerCommentary = null;

  private String loanOutstandingBalance = null;

  private CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A statement maintained tracking repayments 
   * @return stagedRepaymentStatement
  **/

  public String getStagedRepaymentStatement() {
    return stagedRepaymentStatement;
  }

  public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of customer correspondence/feedback 
   * @return customerCommentary
  **/

  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
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

