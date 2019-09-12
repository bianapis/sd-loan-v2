package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveInputModel
 */
public class CRLoanFulfillmentArrangementRetrieveInputModel   {
  private Object loanFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String loanFulfillmentArrangementRetrieveActionRequest = null;

  private CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceReportRecord loanFulfillmentArrangementInstanceReportRecord = null;

  private CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceAnalysis loanFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return loanFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getLoanFulfillmentArrangementRetrieveActionTaskRecord() {
    return loanFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setLoanFulfillmentArrangementRetrieveActionTaskRecord(Object loanFulfillmentArrangementRetrieveActionTaskRecord) {
    this.loanFulfillmentArrangementRetrieveActionTaskRecord = loanFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return loanFulfillmentArrangementRetrieveActionRequest
  **/

  public String getLoanFulfillmentArrangementRetrieveActionRequest() {
    return loanFulfillmentArrangementRetrieveActionRequest;
  }

  public void setLoanFulfillmentArrangementRetrieveActionRequest(String loanFulfillmentArrangementRetrieveActionRequest) {
    this.loanFulfillmentArrangementRetrieveActionRequest = loanFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get loanFulfillmentArrangementInstanceReportRecord
   * @return loanFulfillmentArrangementInstanceReportRecord
  **/

  public CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceReportRecord getLoanFulfillmentArrangementInstanceReportRecord() {
    return loanFulfillmentArrangementInstanceReportRecord;
  }

  public void setLoanFulfillmentArrangementInstanceReportRecord(CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceReportRecord loanFulfillmentArrangementInstanceReportRecord) {
    this.loanFulfillmentArrangementInstanceReportRecord = loanFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get loanFulfillmentArrangementInstanceAnalysis
   * @return loanFulfillmentArrangementInstanceAnalysis
  **/

  public CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceAnalysis getLoanFulfillmentArrangementInstanceAnalysis() {
    return loanFulfillmentArrangementInstanceAnalysis;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysis(CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceAnalysis loanFulfillmentArrangementInstanceAnalysis) {
    this.loanFulfillmentArrangementInstanceAnalysis = loanFulfillmentArrangementInstanceAnalysis;
  }


}

