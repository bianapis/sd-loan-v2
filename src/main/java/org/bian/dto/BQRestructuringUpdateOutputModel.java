package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateOutputModelRestructuringInstanceRecord;
import org.bian.dto.BQRestructuringUpdateInputModelLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringUpdateOutputModel
 */
public class BQRestructuringUpdateOutputModel   {
  private BQRestructuringUpdateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;

  private BQRestructuringInitiateOutputModelRestructuringInstanceRecord restructuringInstanceRecord = null;

  private String restructuringUpdateActionTaskReference = null;

  private Object restructuringUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get loanFulfillmentArrangementInstanceRecord
   * @return loanFulfillmentArrangementInstanceRecord
  **/

  public BQRestructuringUpdateInputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(BQRestructuringUpdateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return restructuringUpdateActionTaskReference
  **/

  public String getRestructuringUpdateActionTaskReference() {
    return restructuringUpdateActionTaskReference;
  }

  public void setRestructuringUpdateActionTaskReference(String restructuringUpdateActionTaskReference) {
    this.restructuringUpdateActionTaskReference = restructuringUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return restructuringUpdateActionTaskRecord
  **/

  public Object getRestructuringUpdateActionTaskRecord() {
    return restructuringUpdateActionTaskRecord;
  }

  public void setRestructuringUpdateActionTaskRecord(Object restructuringUpdateActionTaskRecord) {
    this.restructuringUpdateActionTaskRecord = restructuringUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

