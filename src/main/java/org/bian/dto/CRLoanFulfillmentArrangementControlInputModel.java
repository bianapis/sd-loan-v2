package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementControlInputModelLoanFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementControlInputModel
 */
public class CRLoanFulfillmentArrangementControlInputModel   {
  private String loanServicingSessionReference = null;

  private String loanFulfillmentArrangementInstanceReference = null;

  private Object loanFulfillmentArrangementControlActionTaskRecord = null;

  private CRLoanFulfillmentArrangementControlInputModelLoanFulfillmentArrangementControlActionRequest loanFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return loanFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getLoanFulfillmentArrangementControlActionTaskRecord() {
    return loanFulfillmentArrangementControlActionTaskRecord;
  }

  public void setLoanFulfillmentArrangementControlActionTaskRecord(Object loanFulfillmentArrangementControlActionTaskRecord) {
    this.loanFulfillmentArrangementControlActionTaskRecord = loanFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get loanFulfillmentArrangementControlActionRequest
   * @return loanFulfillmentArrangementControlActionRequest
  **/

  public CRLoanFulfillmentArrangementControlInputModelLoanFulfillmentArrangementControlActionRequest getLoanFulfillmentArrangementControlActionRequest() {
    return loanFulfillmentArrangementControlActionRequest;
  }

  public void setLoanFulfillmentArrangementControlActionRequest(CRLoanFulfillmentArrangementControlInputModelLoanFulfillmentArrangementControlActionRequest loanFulfillmentArrangementControlActionRequest) {
    this.loanFulfillmentArrangementControlActionRequest = loanFulfillmentArrangementControlActionRequest;
  }


}

