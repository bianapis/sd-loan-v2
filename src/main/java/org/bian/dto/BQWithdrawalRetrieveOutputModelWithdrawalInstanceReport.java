package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveOutputModelWithdrawalInstanceReport
 */
public class BQWithdrawalRetrieveOutputModelWithdrawalInstanceReport   {
  private Object withdrawalInstanceReportRecord = null;

  private String withdrawalInstanceReportType = null;

  private String withdrawalInstanceReportParameters = null;

  private Object withdrawalInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return withdrawalInstanceReportRecord
  **/

  public Object getWithdrawalInstanceReportRecord() {
    return withdrawalInstanceReportRecord;
  }

  public void setWithdrawalInstanceReportRecord(Object withdrawalInstanceReportRecord) {
    this.withdrawalInstanceReportRecord = withdrawalInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return withdrawalInstanceReportType
  **/

  public String getWithdrawalInstanceReportType() {
    return withdrawalInstanceReportType;
  }

  public void setWithdrawalInstanceReportType(String withdrawalInstanceReportType) {
    this.withdrawalInstanceReportType = withdrawalInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return withdrawalInstanceReportParameters
  **/

  public String getWithdrawalInstanceReportParameters() {
    return withdrawalInstanceReportParameters;
  }

  public void setWithdrawalInstanceReportParameters(String withdrawalInstanceReportParameters) {
    this.withdrawalInstanceReportParameters = withdrawalInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return withdrawalInstanceReport
  **/

  public Object getWithdrawalInstanceReport() {
    return withdrawalInstanceReport;
  }

  public void setWithdrawalInstanceReport(Object withdrawalInstanceReport) {
    this.withdrawalInstanceReport = withdrawalInstanceReport;
  }


}

