package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQWithdrawalRetrieveOutputModelWithdrawalInstanceAnalysis;
import org.bian.dto.BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecord;
import org.bian.dto.BQWithdrawalRetrieveOutputModelWithdrawalInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveOutputModel
 */
public class BQWithdrawalRetrieveOutputModel   {
  private BQWithdrawalRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;

  private BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private String withdrawalRetrieveActionTaskReference = null;

  private Object withdrawalRetrieveActionTaskRecord = null;

  private String withdrawalRetrieveActionResponse = null;

  private BQWithdrawalRetrieveOutputModelWithdrawalInstanceReport withdrawalInstanceReport = null;

  private BQWithdrawalRetrieveOutputModelWithdrawalInstanceAnalysis withdrawalInstanceAnalysis = null;


  /**
   * Get loanFulfillmentArrangementInstanceRecord
   * @return loanFulfillmentArrangementInstanceRecord
  **/

  public BQWithdrawalRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(BQWithdrawalRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get withdrawalInstanceRecord
   * @return withdrawalInstanceRecord
  **/

  public BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Withdrawal instance retrieve service call 
   * @return withdrawalRetrieveActionTaskReference
  **/

  public String getWithdrawalRetrieveActionTaskReference() {
    return withdrawalRetrieveActionTaskReference;
  }

  public void setWithdrawalRetrieveActionTaskReference(String withdrawalRetrieveActionTaskReference) {
    this.withdrawalRetrieveActionTaskReference = withdrawalRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return withdrawalRetrieveActionTaskRecord
  **/

  public Object getWithdrawalRetrieveActionTaskRecord() {
    return withdrawalRetrieveActionTaskRecord;
  }

  public void setWithdrawalRetrieveActionTaskRecord(Object withdrawalRetrieveActionTaskRecord) {
    this.withdrawalRetrieveActionTaskRecord = withdrawalRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return withdrawalRetrieveActionResponse
  **/

  public String getWithdrawalRetrieveActionResponse() {
    return withdrawalRetrieveActionResponse;
  }

  public void setWithdrawalRetrieveActionResponse(String withdrawalRetrieveActionResponse) {
    this.withdrawalRetrieveActionResponse = withdrawalRetrieveActionResponse;
  }


  /**
   * Get withdrawalInstanceReport
   * @return withdrawalInstanceReport
  **/

  public BQWithdrawalRetrieveOutputModelWithdrawalInstanceReport getWithdrawalInstanceReport() {
    return withdrawalInstanceReport;
  }

  public void setWithdrawalInstanceReport(BQWithdrawalRetrieveOutputModelWithdrawalInstanceReport withdrawalInstanceReport) {
    this.withdrawalInstanceReport = withdrawalInstanceReport;
  }


  /**
   * Get withdrawalInstanceAnalysis
   * @return withdrawalInstanceAnalysis
  **/

  public BQWithdrawalRetrieveOutputModelWithdrawalInstanceAnalysis getWithdrawalInstanceAnalysis() {
    return withdrawalInstanceAnalysis;
  }

  public void setWithdrawalInstanceAnalysis(BQWithdrawalRetrieveOutputModelWithdrawalInstanceAnalysis withdrawalInstanceAnalysis) {
    this.withdrawalInstanceAnalysis = withdrawalInstanceAnalysis;
  }


}

