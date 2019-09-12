package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementInitiateInputModel
 */
public class CRLoanFulfillmentArrangementInitiateInputModel   {
  private String loanServicingSessionReference = null;

  private Object loanFulfillmentArrangementInitiateActionRecord = null;

  private String loanFulfillmentArrangementInstanceStatus = null;

  private CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return loanFulfillmentArrangementInitiateActionRecord
  **/

  public Object getLoanFulfillmentArrangementInitiateActionRecord() {
    return loanFulfillmentArrangementInitiateActionRecord;
  }

  public void setLoanFulfillmentArrangementInitiateActionRecord(Object loanFulfillmentArrangementInitiateActionRecord) {
    this.loanFulfillmentArrangementInitiateActionRecord = loanFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Loan Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return loanFulfillmentArrangementInstanceStatus
  **/

  public String getLoanFulfillmentArrangementInstanceStatus() {
    return loanFulfillmentArrangementInstanceStatus;
  }

  public void setLoanFulfillmentArrangementInstanceStatus(String loanFulfillmentArrangementInstanceStatus) {
    this.loanFulfillmentArrangementInstanceStatus = loanFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get loanFulfillmentArrangementInstanceRecord
   * @return loanFulfillmentArrangementInstanceRecord
  **/

  public CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


}

