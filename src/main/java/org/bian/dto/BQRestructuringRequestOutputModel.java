package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateOutputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringRequestOutputModel
 */
public class BQRestructuringRequestOutputModel   {
  private BQRestructuringInitiateOutputModelRestructuringInstanceRecord restructuringInstanceRecord = null;

  private String restructuringRequestActionTaskReference = null;

  private Object restructuringRequestActionTaskRecord = null;

  private String restructuringRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringInitiateOutputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringInitiateOutputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Restructuring instance request service call 
   * @return restructuringRequestActionTaskReference
  **/

  public String getRestructuringRequestActionTaskReference() {
    return restructuringRequestActionTaskReference;
  }

  public void setRestructuringRequestActionTaskReference(String restructuringRequestActionTaskReference) {
    this.restructuringRequestActionTaskReference = restructuringRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return restructuringRequestActionTaskRecord
  **/

  public Object getRestructuringRequestActionTaskRecord() {
    return restructuringRequestActionTaskRecord;
  }

  public void setRestructuringRequestActionTaskRecord(Object restructuringRequestActionTaskRecord) {
    this.restructuringRequestActionTaskRecord = restructuringRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restructuring service request record 
   * @return restructuringRequestRecordReference
  **/

  public String getRestructuringRequestRecordReference() {
    return restructuringRequestRecordReference;
  }

  public void setRestructuringRequestRecordReference(String restructuringRequestRecordReference) {
    this.restructuringRequestRecordReference = restructuringRequestRecordReference;
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

