package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRetrieveOutputModelMaintenanceInstanceAnalysis
 */
public class BQMaintenanceRetrieveOutputModelMaintenanceInstanceAnalysis   {
  private Object maintenanceInstanceAnalysisRecord = null;

  private String maintenanceInstanceAnalysisReportType = null;

  private String maintenanceInstanceAnalysisParameters = null;

  private Object maintenanceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return maintenanceInstanceAnalysisRecord
  **/

  public Object getMaintenanceInstanceAnalysisRecord() {
    return maintenanceInstanceAnalysisRecord;
  }

  public void setMaintenanceInstanceAnalysisRecord(Object maintenanceInstanceAnalysisRecord) {
    this.maintenanceInstanceAnalysisRecord = maintenanceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return maintenanceInstanceAnalysisReportType
  **/

  public String getMaintenanceInstanceAnalysisReportType() {
    return maintenanceInstanceAnalysisReportType;
  }

  public void setMaintenanceInstanceAnalysisReportType(String maintenanceInstanceAnalysisReportType) {
    this.maintenanceInstanceAnalysisReportType = maintenanceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return maintenanceInstanceAnalysisParameters
  **/

  public String getMaintenanceInstanceAnalysisParameters() {
    return maintenanceInstanceAnalysisParameters;
  }

  public void setMaintenanceInstanceAnalysisParameters(String maintenanceInstanceAnalysisParameters) {
    this.maintenanceInstanceAnalysisParameters = maintenanceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return maintenanceInstanceAnalysisReport
  **/

  public Object getMaintenanceInstanceAnalysisReport() {
    return maintenanceInstanceAnalysisReport;
  }

  public void setMaintenanceInstanceAnalysisReport(Object maintenanceInstanceAnalysisReport) {
    this.maintenanceInstanceAnalysisReport = maintenanceInstanceAnalysisReport;
  }


}

