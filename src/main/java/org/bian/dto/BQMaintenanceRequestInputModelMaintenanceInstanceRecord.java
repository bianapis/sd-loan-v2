package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestInputModelMaintenanceInstanceRecord
 */
public class BQMaintenanceRequestInputModelMaintenanceInstanceRecord   {
  private BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType maintenanceReportType = null;


  /**
   * Get maintenanceReportType
   * @return maintenanceReportType
  **/

  public BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType getMaintenanceReportType() {
    return maintenanceReportType;
  }

  public void setMaintenanceReportType(BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType maintenanceReportType) {
    this.maintenanceReportType = maintenanceReportType;
  }


}

