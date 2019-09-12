package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRetrieveInputModelMaintenanceInstanceAnalysis
 */
public class BQMaintenanceRetrieveInputModelMaintenanceInstanceAnalysis   {
  private String maintenanceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return maintenanceInstanceAnalysisReference
  **/

  public String getMaintenanceInstanceAnalysisReference() {
    return maintenanceInstanceAnalysisReference;
  }

  public void setMaintenanceInstanceAnalysisReference(String maintenanceInstanceAnalysisReference) {
    this.maintenanceInstanceAnalysisReference = maintenanceInstanceAnalysisReference;
  }


}

