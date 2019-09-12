package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementControlOutputModel
 */
public class CRLoanFulfillmentArrangementControlOutputModel   {
  private String loanFulfillmentArrangementControlActionTaskReference = null;

  private Object loanFulfillmentArrangementControlActionTaskRecord = null;

  private String loanFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Loan Fulfillment Arrangement instance control processing service call 
   * @return loanFulfillmentArrangementControlActionTaskReference
  **/

  public String getLoanFulfillmentArrangementControlActionTaskReference() {
    return loanFulfillmentArrangementControlActionTaskReference;
  }

  public void setLoanFulfillmentArrangementControlActionTaskReference(String loanFulfillmentArrangementControlActionTaskReference) {
    this.loanFulfillmentArrangementControlActionTaskReference = loanFulfillmentArrangementControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return loanFulfillmentArrangementControlActionResponse
  **/

  public String getLoanFulfillmentArrangementControlActionResponse() {
    return loanFulfillmentArrangementControlActionResponse;
  }

  public void setLoanFulfillmentArrangementControlActionResponse(String loanFulfillmentArrangementControlActionResponse) {
    this.loanFulfillmentArrangementControlActionResponse = loanFulfillmentArrangementControlActionResponse;
  }


}

