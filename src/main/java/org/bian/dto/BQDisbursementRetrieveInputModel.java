package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDisbursementRetrieveInputModelDisbursementInstanceAnalysis;
import org.bian.dto.BQDisbursementRetrieveInputModelDisbursementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveInputModel
 */
public class BQDisbursementRetrieveInputModel   {
  private Object disbursementRetrieveActionTaskRecord = null;

  private String disbursementRetrieveActionRequest = null;

  private BQDisbursementRetrieveInputModelDisbursementInstanceReport disbursementInstanceReport = null;

  private BQDisbursementRetrieveInputModelDisbursementInstanceAnalysis disbursementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return disbursementRetrieveActionRequest
  **/

  public String getDisbursementRetrieveActionRequest() {
    return disbursementRetrieveActionRequest;
  }

  public void setDisbursementRetrieveActionRequest(String disbursementRetrieveActionRequest) {
    this.disbursementRetrieveActionRequest = disbursementRetrieveActionRequest;
  }


  /**
   * Get disbursementInstanceReport
   * @return disbursementInstanceReport
  **/

  public BQDisbursementRetrieveInputModelDisbursementInstanceReport getDisbursementInstanceReport() {
    return disbursementInstanceReport;
  }

  public void setDisbursementInstanceReport(BQDisbursementRetrieveInputModelDisbursementInstanceReport disbursementInstanceReport) {
    this.disbursementInstanceReport = disbursementInstanceReport;
  }


  /**
   * Get disbursementInstanceAnalysis
   * @return disbursementInstanceAnalysis
  **/

  public BQDisbursementRetrieveInputModelDisbursementInstanceAnalysis getDisbursementInstanceAnalysis() {
    return disbursementInstanceAnalysis;
  }

  public void setDisbursementInstanceAnalysis(BQDisbursementRetrieveInputModelDisbursementInstanceAnalysis disbursementInstanceAnalysis) {
    this.disbursementInstanceAnalysis = disbursementInstanceAnalysis;
  }


}

