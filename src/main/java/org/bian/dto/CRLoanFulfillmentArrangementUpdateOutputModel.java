package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementUpdateInputModelLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementUpdateOutputModel
 */
public class CRLoanFulfillmentArrangementUpdateOutputModel   {
  private CRLoanFulfillmentArrangementUpdateInputModelLoanFulfillmentArrangementInstanceRecord loanFulfillmentArrangementInstanceRecord = null;

  private String loanFulfillmentArrangementUpdateActionTaskReference = null;

  private Object loanFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return loanFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getLoanFulfillmentArrangementUpdateActionTaskReference() {
    return loanFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setLoanFulfillmentArrangementUpdateActionTaskReference(String loanFulfillmentArrangementUpdateActionTaskReference) {
    this.loanFulfillmentArrangementUpdateActionTaskReference = loanFulfillmentArrangementUpdateActionTaskReference;
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

