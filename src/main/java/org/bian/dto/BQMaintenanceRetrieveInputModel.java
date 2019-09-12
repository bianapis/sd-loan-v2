package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRetrieveInputModelMaintenanceInstanceAnalysis;
import org.bian.dto.BQMaintenanceRetrieveInputModelMaintenanceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRetrieveInputModel
 */
public class BQMaintenanceRetrieveInputModel   {
  private Object maintenanceRetrieveActionTaskRecord = null;

  private String maintenanceRetrieveActionRequest = null;

  private BQMaintenanceRetrieveInputModelMaintenanceInstanceReport maintenanceInstanceReport = null;

  private BQMaintenanceRetrieveInputModelMaintenanceInstanceAnalysis maintenanceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintenanceRetrieveActionTaskRecord
  **/

  public Object getMaintenanceRetrieveActionTaskRecord() {
    return maintenanceRetrieveActionTaskRecord;
  }

  public void setMaintenanceRetrieveActionTaskRecord(Object maintenanceRetrieveActionTaskRecord) {
    this.maintenanceRetrieveActionTaskRecord = maintenanceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return maintenanceRetrieveActionRequest
  **/

  public String getMaintenanceRetrieveActionRequest() {
    return maintenanceRetrieveActionRequest;
  }

  public void setMaintenanceRetrieveActionRequest(String maintenanceRetrieveActionRequest) {
    this.maintenanceRetrieveActionRequest = maintenanceRetrieveActionRequest;
  }


  /**
   * Get maintenanceInstanceReport
   * @return maintenanceInstanceReport
  **/

  public BQMaintenanceRetrieveInputModelMaintenanceInstanceReport getMaintenanceInstanceReport() {
    return maintenanceInstanceReport;
  }

  public void setMaintenanceInstanceReport(BQMaintenanceRetrieveInputModelMaintenanceInstanceReport maintenanceInstanceReport) {
    this.maintenanceInstanceReport = maintenanceInstanceReport;
  }


  /**
   * Get maintenanceInstanceAnalysis
   * @return maintenanceInstanceAnalysis
  **/

  public BQMaintenanceRetrieveInputModelMaintenanceInstanceAnalysis getMaintenanceInstanceAnalysis() {
    return maintenanceInstanceAnalysis;
  }

  public void setMaintenanceInstanceAnalysis(BQMaintenanceRetrieveInputModelMaintenanceInstanceAnalysis maintenanceInstanceAnalysis) {
    this.maintenanceInstanceAnalysis = maintenanceInstanceAnalysis;
  }


}

