package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveOutputModel
 */
public class CRLoanFulfillmentArrangementRetrieveOutputModel   {
  private CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;

  private String loanFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object loanFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String loanFulfillmentArrangementRetrieveActionResponse = null;

  private CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceReportRecord loanFulfillmentArrangementInstanceReportRecord = null;

  private CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceAnalysis loanFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get loanFulfillmentArrangementInstanceRecord
   * @return loanFulfillmentArrangementInstanceRecord
  **/

  public CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Loan Fulfillment Arrangement instance retrieve service call 
   * @return loanFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getLoanFulfillmentArrangementRetrieveActionTaskReference() {
    return loanFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setLoanFulfillmentArrangementRetrieveActionTaskReference(String loanFulfillmentArrangementRetrieveActionTaskReference) {
    this.loanFulfillmentArrangementRetrieveActionTaskReference = loanFulfillmentArrangementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return loanFulfillmentArrangementRetrieveActionResponse
  **/

  public String getLoanFulfillmentArrangementRetrieveActionResponse() {
    return loanFulfillmentArrangementRetrieveActionResponse;
  }

  public void setLoanFulfillmentArrangementRetrieveActionResponse(String loanFulfillmentArrangementRetrieveActionResponse) {
    this.loanFulfillmentArrangementRetrieveActionResponse = loanFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get loanFulfillmentArrangementInstanceReportRecord
   * @return loanFulfillmentArrangementInstanceReportRecord
  **/

  public CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceReportRecord getLoanFulfillmentArrangementInstanceReportRecord() {
    return loanFulfillmentArrangementInstanceReportRecord;
  }

  public void setLoanFulfillmentArrangementInstanceReportRecord(CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceReportRecord loanFulfillmentArrangementInstanceReportRecord) {
    this.loanFulfillmentArrangementInstanceReportRecord = loanFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get loanFulfillmentArrangementInstanceAnalysis
   * @return loanFulfillmentArrangementInstanceAnalysis
  **/

  public CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceAnalysis getLoanFulfillmentArrangementInstanceAnalysis() {
    return loanFulfillmentArrangementInstanceAnalysis;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysis(CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceAnalysis loanFulfillmentArrangementInstanceAnalysis) {
    this.loanFulfillmentArrangementInstanceAnalysis = loanFulfillmentArrangementInstanceAnalysis;
  }


}

