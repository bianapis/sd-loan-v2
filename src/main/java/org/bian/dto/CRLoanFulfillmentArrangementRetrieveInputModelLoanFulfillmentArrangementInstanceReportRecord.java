package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceReportRecord
 */
public class CRLoanFulfillmentArrangementRetrieveInputModelLoanFulfillmentArrangementInstanceReportRecord   {
  private String loanFulfillmentArrangementInstanceReportReference = null;

  private String loanFulfillmentArrangementInstanceReportType = null;

  private String loanFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return loanFulfillmentArrangementInstanceReportReference
  **/

  public String getLoanFulfillmentArrangementInstanceReportReference() {
    return loanFulfillmentArrangementInstanceReportReference;
  }

  public void setLoanFulfillmentArrangementInstanceReportReference(String loanFulfillmentArrangementInstanceReportReference) {
    this.loanFulfillmentArrangementInstanceReportReference = loanFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return loanFulfillmentArrangementInstanceReportType
  **/

  public String getLoanFulfillmentArrangementInstanceReportType() {
    return loanFulfillmentArrangementInstanceReportType;
  }

  public void setLoanFulfillmentArrangementInstanceReportType(String loanFulfillmentArrangementInstanceReportType) {
    this.loanFulfillmentArrangementInstanceReportType = loanFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return loanFulfillmentArrangementInstanceReportParameters
  **/

  public String getLoanFulfillmentArrangementInstanceReportParameters() {
    return loanFulfillmentArrangementInstanceReportParameters;
  }

  public void setLoanFulfillmentArrangementInstanceReportParameters(String loanFulfillmentArrangementInstanceReportParameters) {
    this.loanFulfillmentArrangementInstanceReportParameters = loanFulfillmentArrangementInstanceReportParameters;
  }


}

