package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveOutputModelWithdrawalInstanceAnalysis
 */
public class BQWithdrawalRetrieveOutputModelWithdrawalInstanceAnalysis   {
  private Object withdrawalInstanceAnalysisRecord = null;

  private String withdrawalInstanceAnalysisReportType = null;

  private String withdrawalInstanceAnalysisParameters = null;

  private Object withdrawalInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return withdrawalInstanceAnalysisRecord
  **/

  public Object getWithdrawalInstanceAnalysisRecord() {
    return withdrawalInstanceAnalysisRecord;
  }

  public void setWithdrawalInstanceAnalysisRecord(Object withdrawalInstanceAnalysisRecord) {
    this.withdrawalInstanceAnalysisRecord = withdrawalInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return withdrawalInstanceAnalysisReportType
  **/

  public String getWithdrawalInstanceAnalysisReportType() {
    return withdrawalInstanceAnalysisReportType;
  }

  public void setWithdrawalInstanceAnalysisReportType(String withdrawalInstanceAnalysisReportType) {
    this.withdrawalInstanceAnalysisReportType = withdrawalInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return withdrawalInstanceAnalysisParameters
  **/

  public String getWithdrawalInstanceAnalysisParameters() {
    return withdrawalInstanceAnalysisParameters;
  }

  public void setWithdrawalInstanceAnalysisParameters(String withdrawalInstanceAnalysisParameters) {
    this.withdrawalInstanceAnalysisParameters = withdrawalInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return withdrawalInstanceAnalysisReport
  **/

  public Object getWithdrawalInstanceAnalysisReport() {
    return withdrawalInstanceAnalysisReport;
  }

  public void setWithdrawalInstanceAnalysisReport(Object withdrawalInstanceAnalysisReport) {
    this.withdrawalInstanceAnalysisReport = withdrawalInstanceAnalysisReport;
  }


}

