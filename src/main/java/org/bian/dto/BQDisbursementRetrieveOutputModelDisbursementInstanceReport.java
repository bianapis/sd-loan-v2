package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModelDisbursementInstanceReport
 */
public class BQDisbursementRetrieveOutputModelDisbursementInstanceReport   {
  private Object disbursementInstanceReportRecord = null;

  private String disbursementInstanceReportType = null;

  private String disbursementInstanceReportParameters = null;

  private Object disbursementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return disbursementInstanceReportRecord
  **/

  public Object getDisbursementInstanceReportRecord() {
    return disbursementInstanceReportRecord;
  }

  public void setDisbursementInstanceReportRecord(Object disbursementInstanceReportRecord) {
    this.disbursementInstanceReportRecord = disbursementInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return disbursementInstanceReportType
  **/

  public String getDisbursementInstanceReportType() {
    return disbursementInstanceReportType;
  }

  public void setDisbursementInstanceReportType(String disbursementInstanceReportType) {
    this.disbursementInstanceReportType = disbursementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return disbursementInstanceReportParameters
  **/

  public String getDisbursementInstanceReportParameters() {
    return disbursementInstanceReportParameters;
  }

  public void setDisbursementInstanceReportParameters(String disbursementInstanceReportParameters) {
    this.disbursementInstanceReportParameters = disbursementInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return disbursementInstanceReport
  **/

  public Object getDisbursementInstanceReport() {
    return disbursementInstanceReport;
  }

  public void setDisbursementInstanceReport(Object disbursementInstanceReport) {
    this.disbursementInstanceReport = disbursementInstanceReport;
  }


}

