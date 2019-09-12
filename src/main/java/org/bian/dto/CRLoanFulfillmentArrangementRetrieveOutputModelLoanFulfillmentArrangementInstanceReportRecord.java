package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceReportRecord
 */
public class CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceReportRecord   {
  private String loanFulfillmentArrangementInstanceReportData = null;

  private String loanFulfillmentArrangementInstanceReportType = null;

  private Object loanFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return loanFulfillmentArrangementInstanceReportData
  **/

  public String getLoanFulfillmentArrangementInstanceReportData() {
    return loanFulfillmentArrangementInstanceReportData;
  }

  public void setLoanFulfillmentArrangementInstanceReportData(String loanFulfillmentArrangementInstanceReportData) {
    this.loanFulfillmentArrangementInstanceReportData = loanFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return loanFulfillmentArrangementInstanceReport
  **/

  public Object getLoanFulfillmentArrangementInstanceReport() {
    return loanFulfillmentArrangementInstanceReport;
  }

  public void setLoanFulfillmentArrangementInstanceReport(Object loanFulfillmentArrangementInstanceReport) {
    this.loanFulfillmentArrangementInstanceReport = loanFulfillmentArrangementInstanceReport;
  }


}

