package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;
import org.bian.dto.BQWithdrawalExecuteInputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalExecuteInputModel
 */
public class BQWithdrawalExecuteInputModel   {
  private String loanFulfillmentArrangementInstanceReference = null;

  private String withdrawalInstanceReference = null;

  private BQWithdrawalExecuteInputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private Object withdrawalExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQWithdrawalExecuteInputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalExecuteInputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return withdrawalExecuteActionTaskRecord
  **/

  public Object getWithdrawalExecuteActionTaskRecord() {
    return withdrawalExecuteActionTaskRecord;
  }

  public void setWithdrawalExecuteActionTaskRecord(Object withdrawalExecuteActionTaskRecord) {
    this.withdrawalExecuteActionTaskRecord = withdrawalExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

