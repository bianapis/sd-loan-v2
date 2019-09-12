package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRequestInputModelRequestRecordType;
import org.bian.dto.BQWithdrawalRequestInputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRequestInputModel
 */
public class BQWithdrawalRequestInputModel   {
  private String loanFulfillmentArrangementInstanceReference = null;

  private String withdrawalInstanceReference = null;

  private BQWithdrawalRequestInputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private Object withdrawalRequestActionTaskRecord = null;

  private BQMaintenanceRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Loan Fulfillment Arrangement instance 
   * @return loanFulfillmentArrangementInstanceReference
  **/

  public String getLoanFulfillmentArrangementInstanceReference() {
    return loanFulfillmentArrangementInstanceReference;
  }

  public void setLoanFulfillmentArrangementInstanceReference(String loanFulfillmentArrangementInstanceReference) {
    this.loanFulfillmentArrangementInstanceReference = loanFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Withdrawal instance 
   * @return withdrawalInstanceReference
  **/

  public String getWithdrawalInstanceReference() {
    return withdrawalInstanceReference;
  }

  public void setWithdrawalInstanceReference(String withdrawalInstanceReference) {
    this.withdrawalInstanceReference = withdrawalInstanceReference;
  }


  /**
   * Get withdrawalInstanceRecord
   * @return withdrawalInstanceRecord
  **/

  public BQWithdrawalRequestInputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalRequestInputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return withdrawalRequestActionTaskRecord
  **/

  public Object getWithdrawalRequestActionTaskRecord() {
    return withdrawalRequestActionTaskRecord;
  }

  public void setWithdrawalRequestActionTaskRecord(Object withdrawalRequestActionTaskRecord) {
    this.withdrawalRequestActionTaskRecord = withdrawalRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQMaintenanceRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQMaintenanceRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

