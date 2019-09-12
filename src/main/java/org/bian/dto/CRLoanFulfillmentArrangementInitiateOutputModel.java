package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateOutputModelLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementInitiateOutputModel
 */
public class CRLoanFulfillmentArrangementInitiateOutputModel   {
  private String loanFulfillmentArrangementInstanceReference = null;

  private String loanFulfillmentArrangementInitiateActionReference = null;

  private Object loanFulfillmentArrangementInitiateActionRecord = null;

  private String loanFulfillmentArrangementInstanceStatus = null;

  private CRLoanFulfillmentArrangementInitiateOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return loanFulfillmentArrangementInitiateActionReference
  **/

  public String getLoanFulfillmentArrangementInitiateActionReference() {
    return loanFulfillmentArrangementInitiateActionReference;
  }

  public void setLoanFulfillmentArrangementInitiateActionReference(String loanFulfillmentArrangementInitiateActionReference) {
    this.loanFulfillmentArrangementInitiateActionReference = loanFulfillmentArrangementInitiateActionReference;
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

  public CRLoanFulfillmentArrangementInitiateOutputModelLoanFulfillmentArrangementInstanceRecord getLoanFulfillmentArrangementInstanceRecord() {
    return loanFulfillmentArrangementInstanceRecord;
  }

  public void setLoanFulfillmentArrangementInstanceRecord(CRLoanFulfillmentArrangementInitiateOutputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord) {
    this.loanFulfillmentArrangementInstanceRecord = loanFulfillmentArrangementInstanceRecord;
  }


}

