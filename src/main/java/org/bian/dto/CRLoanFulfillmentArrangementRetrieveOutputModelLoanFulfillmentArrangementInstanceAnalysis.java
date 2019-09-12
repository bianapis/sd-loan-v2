package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceAnalysis
 */
public class CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceAnalysis   {
  private String loanFulfillmentArrangementInstanceAnalysisData = null;

  private String loanFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object loanFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return loanFulfillmentArrangementInstanceAnalysisData
  **/

  public String getLoanFulfillmentArrangementInstanceAnalysisData() {
    return loanFulfillmentArrangementInstanceAnalysisData;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysisData(String loanFulfillmentArrangementInstanceAnalysisData) {
    this.loanFulfillmentArrangementInstanceAnalysisData = loanFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return loanFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getLoanFulfillmentArrangementInstanceAnalysisReportType() {
    return loanFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysisReportType(String loanFulfillmentArrangementInstanceAnalysisReportType) {
    this.loanFulfillmentArrangementInstanceAnalysisReportType = loanFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return loanFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getLoanFulfillmentArrangementInstanceAnalysisReport() {
    return loanFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysisReport(Object loanFulfillmentArrangementInstanceAnalysisReport) {
    this.loanFulfillmentArrangementInstanceAnalysisReport = loanFulfillmentArrangementInstanceAnalysisReport;
  }


}

