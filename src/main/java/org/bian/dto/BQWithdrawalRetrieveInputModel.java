package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalRetrieveInputModelWithdrawalInstanceAnalysis;
import org.bian.dto.BQWithdrawalRetrieveInputModelWithdrawalInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveInputModel
 */
public class BQWithdrawalRetrieveInputModel   {
  private Object withdrawalRetrieveActionTaskRecord = null;

  private String withdrawalRetrieveActionRequest = null;

  private BQWithdrawalRetrieveInputModelWithdrawalInstanceReport withdrawalInstanceReport = null;

  private BQWithdrawalRetrieveInputModelWithdrawalInstanceAnalysis withdrawalInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return withdrawalRetrieveActionRequest
  **/

  public String getWithdrawalRetrieveActionRequest() {
    return withdrawalRetrieveActionRequest;
  }

  public void setWithdrawalRetrieveActionRequest(String withdrawalRetrieveActionRequest) {
    this.withdrawalRetrieveActionRequest = withdrawalRetrieveActionRequest;
  }


  /**
   * Get withdrawalInstanceReport
   * @return withdrawalInstanceReport
  **/

  public BQWithdrawalRetrieveInputModelWithdrawalInstanceReport getWithdrawalInstanceReport() {
    return withdrawalInstanceReport;
  }

  public void setWithdrawalInstanceReport(BQWithdrawalRetrieveInputModelWithdrawalInstanceReport withdrawalInstanceReport) {
    this.withdrawalInstanceReport = withdrawalInstanceReport;
  }


  /**
   * Get withdrawalInstanceAnalysis
   * @return withdrawalInstanceAnalysis
  **/

  public BQWithdrawalRetrieveInputModelWithdrawalInstanceAnalysis getWithdrawalInstanceAnalysis() {
    return withdrawalInstanceAnalysis;
  }

  public void setWithdrawalInstanceAnalysis(BQWithdrawalRetrieveInputModelWithdrawalInstanceAnalysis withdrawalInstanceAnalysis) {
    this.withdrawalInstanceAnalysis = withdrawalInstanceAnalysis;
  }


}

