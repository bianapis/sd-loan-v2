package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRequestInputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestOutputModel
 */
public class BQMaintenanceRequestOutputModel   {
  private BQMaintenanceRequestInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;

  private String maintenanceRequestActionTaskReference = null;

  private Object maintenanceRequestActionTaskRecord = null;

  private String maintenanceRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceRequestInputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceRequestInputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance instance request service call 
   * @return maintenanceRequestActionTaskReference
  **/

  public String getMaintenanceRequestActionTaskReference() {
    return maintenanceRequestActionTaskReference;
  }

  public void setMaintenanceRequestActionTaskReference(String maintenanceRequestActionTaskReference) {
    this.maintenanceRequestActionTaskReference = maintenanceRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return maintenanceRequestActionTaskRecord
  **/

  public Object getMaintenanceRequestActionTaskRecord() {
    return maintenanceRequestActionTaskRecord;
  }

  public void setMaintenanceRequestActionTaskRecord(Object maintenanceRequestActionTaskRecord) {
    this.maintenanceRequestActionTaskRecord = maintenanceRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance service request record 
   * @return maintenanceRequestRecordReference
  **/

  public String getMaintenanceRequestRecordReference() {
    return maintenanceRequestRecordReference;
  }

  public void setMaintenanceRequestRecordReference(String maintenanceRequestRecordReference) {
    this.maintenanceRequestRecordReference = maintenanceRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

