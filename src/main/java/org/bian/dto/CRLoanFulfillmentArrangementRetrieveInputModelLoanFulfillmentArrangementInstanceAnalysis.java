package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceAnalysis
 */
public class CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceAnalysis   {
  private String loanFulfillmentArrangementInstanceAnalysisReference = null;

  private String loanFulfillmentArrangementInstanceAnalysisReportType = null;

  private String loanFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return loanFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getLoanFulfillmentArrangementInstanceAnalysisReference() {
    return loanFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysisReference(String loanFulfillmentArrangementInstanceAnalysisReference) {
    this.loanFulfillmentArrangementInstanceAnalysisReference = loanFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return loanFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getLoanFulfillmentArrangementInstanceAnalysisParameters() {
    return loanFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setLoanFulfillmentArrangementInstanceAnalysisParameters(String loanFulfillmentArrangementInstanceAnalysisParameters) {
    this.loanFulfillmentArrangementInstanceAnalysisParameters = loanFulfillmentArrangementInstanceAnalysisParameters;
  }


}

