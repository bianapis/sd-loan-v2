package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRetrieveOutputModelMaintenanceInstanceReport
 */
public class BQMaintenanceRetrieveOutputModelMaintenanceInstanceReport   {
  private Object maintenanceInstanceReportRecord = null;

  private String maintenanceInstanceReportType = null;

  private String maintenanceInstanceReportParameters = null;

  private Object maintenanceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return maintenanceInstanceReportRecord
  **/

  public Object getMaintenanceInstanceReportRecord() {
    return maintenanceInstanceReportRecord;
  }

  public void setMaintenanceInstanceReportRecord(Object maintenanceInstanceReportRecord) {
    this.maintenanceInstanceReportRecord = maintenanceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return maintenanceInstanceReportType
  **/

  public String getMaintenanceInstanceReportType() {
    return maintenanceInstanceReportType;
  }

  public void setMaintenanceInstanceReportType(String maintenanceInstanceReportType) {
    this.maintenanceInstanceReportType = maintenanceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return maintenanceInstanceReportParameters
  **/

  public String getMaintenanceInstanceReportParameters() {
    return maintenanceInstanceReportParameters;
  }

  public void setMaintenanceInstanceReportParameters(String maintenanceInstanceReportParameters) {
    this.maintenanceInstanceReportParameters = maintenanceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return maintenanceInstanceReport
  **/

  public Object getMaintenanceInstanceReport() {
    return maintenanceInstanceReport;
  }

  public void setMaintenanceInstanceReport(Object maintenanceInstanceReport) {
    this.maintenanceInstanceReport = maintenanceInstanceReport;
  }


}

