package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDisbursementRetrieveOutputModelDisbursementInstanceAnalysis;
import org.bian.dto.BQDisbursementRetrieveOutputModelDisbursementInstanceRecord;
import org.bian.dto.BQDisbursementRetrieveOutputModelDisbursementInstanceReport;
import org.bian.dto.BQDisbursementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModel
 */
public class BQDisbursementRetrieveOutputModel   {
  private BQDisbursementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;

  private BQDisbursementRetrieveOutputModelDisbursementInstanceRecord disbursementInstanceRecord = null;

  private String disbursementRetrieveActionTaskReference = null;

  private Object disbursementRetrieveActionTaskRecord = null;

  private String disbursementRetrieveActionResponse = null;

  private BQDisbursementRetrieveOutputModelDisbursementInstanceReport disbursementInstanceReport = null;

  private BQDisbursementRetrieveOutputModelDisbursementInstanceAnalysis disbursementInstanceAnalysis = null;


  /**
   * Get loanFulfillmentArrangementInstanceRecord
   * @return loanFulfillmentArrangementInstanceRecord
  **/

  public BQDisbursementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(BQDisbursementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get disbursementInstanceRecord
   * @return disbursementInstanceRecord
  **/

  public BQDisbursementRetrieveOutputModelDisbursementInstanceRecord getDisbursementInstanceRecord() {
    return disbursementInstanceRecord;
  }

  public void setDisbursementInstanceRecord(BQDisbursementRetrieveOutputModelDisbursementInstanceRecord disbursementInstanceRecord) {
    this.disbursementInstanceRecord = disbursementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disbursement instance retrieve service call 
   * @return disbursementRetrieveActionTaskReference
  **/

  public String getDisbursementRetrieveActionTaskReference() {
    return disbursementRetrieveActionTaskReference;
  }

  public void setDisbursementRetrieveActionTaskReference(String disbursementRetrieveActionTaskReference) {
    this.disbursementRetrieveActionTaskReference = disbursementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return disbursementRetrieveActionTaskRecord
  **/

  public Object getDisbursementRetrieveActionTaskRecord() {
    return disbursementRetrieveActionTaskRecord;
  }

  public void setDisbursementRetrieveActionTaskRecord(Object disbursementRetrieveActionTaskRecord) {
    this.disbursementRetrieveActionTaskRecord = disbursementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return disbursementRetrieveActionResponse
  **/

  public String getDisbursementRetrieveActionResponse() {
    return disbursementRetrieveActionResponse;
  }

  public void setDisbursementRetrieveActionResponse(String disbursementRetrieveActionResponse) {
    this.disbursementRetrieveActionResponse = disbursementRetrieveActionResponse;
  }


  /**
   * Get disbursementInstanceReport
   * @return disbursementInstanceReport
  **/

  public BQDisbursementRetrieveOutputModelDisbursementInstanceReport getDisbursementInstanceReport() {
    return disbursementInstanceReport;
  }

  public void setDisbursementInstanceReport(BQDisbursementRetrieveOutputModelDisbursementInstanceReport disbursementInstanceReport) {
    this.disbursementInstanceReport = disbursementInstanceReport;
  }


  /**
   * Get disbursementInstanceAnalysis
   * @return disbursementInstanceAnalysis
  **/

  public BQDisbursementRetrieveOutputModelDisbursementInstanceAnalysis getDisbursementInstanceAnalysis() {
    return disbursementInstanceAnalysis;
  }

  public void setDisbursementInstanceAnalysis(BQDisbursementRetrieveOutputModelDisbursementInstanceAnalysis disbursementInstanceAnalysis) {
    this.disbursementInstanceAnalysis = disbursementInstanceAnalysis;
  }


}

