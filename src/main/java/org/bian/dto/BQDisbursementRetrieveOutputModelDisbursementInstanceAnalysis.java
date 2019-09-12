package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModelDisbursementInstanceAnalysis
 */
public class BQDisbursementRetrieveOutputModelDisbursementInstanceAnalysis   {
  private Object disbursementInstanceAnalysisRecord = null;

  private String disbursementInstanceAnalysisReportType = null;

  private String disbursementInstanceAnalysisParameters = null;

  private Object disbursementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return disbursementInstanceAnalysisRecord
  **/

  public Object getDisbursementInstanceAnalysisRecord() {
    return disbursementInstanceAnalysisRecord;
  }

  public void setDisbursementInstanceAnalysisRecord(Object disbursementInstanceAnalysisRecord) {
    this.disbursementInstanceAnalysisRecord = disbursementInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return disbursementInstanceAnalysisReportType
  **/

  public String getDisbursementInstanceAnalysisReportType() {
    return disbursementInstanceAnalysisReportType;
  }

  public void setDisbursementInstanceAnalysisReportType(String disbursementInstanceAnalysisReportType) {
    this.disbursementInstanceAnalysisReportType = disbursementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return disbursementInstanceAnalysisParameters
  **/

  public String getDisbursementInstanceAnalysisParameters() {
    return disbursementInstanceAnalysisParameters;
  }

  public void setDisbursementInstanceAnalysisParameters(String disbursementInstanceAnalysisParameters) {
    this.disbursementInstanceAnalysisParameters = disbursementInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return disbursementInstanceAnalysisReport
  **/

  public Object getDisbursementInstanceAnalysisReport() {
    return disbursementInstanceAnalysisReport;
  }

  public void setDisbursementInstanceAnalysisReport(Object disbursementInstanceAnalysisReport) {
    this.disbursementInstanceAnalysisReport = disbursementInstanceAnalysisReport;
  }


}

