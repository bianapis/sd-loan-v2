package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementUpdateInputModelLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementUpdateInputModel
 */
public class CRLoanFulfillmentArrangementUpdateInputModel   {
  private String loanServicingSessionReference = null;

  private String loanFulfillmentArrangementInstanceReference = null;

  private CRLoanFulfillmentArrangementUpdateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;

  private Object loanFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return loanServicingSessionReference
  **/

  public String getLoanServicingSessionReference() {
    return loanServicingSessionReference;
  }

  public void setLoanServicingSessionReference(String loanServicingSessionReference) {
    this.loanServicingSessionReference = loanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Loan Fulfillment Arrangement instance 
   * @return loanFulfillmentArrangementInstanceReference
  **/

  public String getLoanFulfillmentArrangementInstanceReference() {
    return loanFulfillmentArrangementInstanceReference;
  }

  public void setLoanFulfillmentArrangementInstanceReference(String loanFulfillmentArrangementInstanceReference) {
    this.loanFulfillmentArrangementInstanceReference = loanFulfillmentArrangementInstanceReference;
  }


  /**
   * Get loanFulfillmentArrangementInstanceRecord
   * @return loanFulfillmentArrangementInstanceRecord
  **/

  public CRLoanFulfillmentArrangementUpdateInputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(CRLoanFulfillmentArrangementUpdateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return loanFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getLoanFulfillmentArrangementUpdateActionTaskRecord() {
    return loanFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setLoanFulfillmentArrangementUpdateActionTaskRecord(Object loanFulfillmentArrangementUpdateActionTaskRecord) {
    this.loanFulfillmentArrangementUpdateActionTaskRecord = loanFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

