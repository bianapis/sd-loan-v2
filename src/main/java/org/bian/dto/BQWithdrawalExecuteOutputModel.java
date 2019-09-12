package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalExecuteOutputModel
 */
public class BQWithdrawalExecuteOutputModel   {
  private BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private String withdrawalExecuteActionTaskReference = null;

  private Object withdrawalExecuteActionTaskRecord = null;

  private String withdrawalExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get withdrawalInstanceRecord
   * @return withdrawalInstanceRecord
  **/

  public BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Withdrawal instance execute service call 
   * @return withdrawalExecuteActionTaskReference
  **/

  public String getWithdrawalExecuteActionTaskReference() {
    return withdrawalExecuteActionTaskReference;
  }

  public void setWithdrawalExecuteActionTaskReference(String withdrawalExecuteActionTaskReference) {
    this.withdrawalExecuteActionTaskReference = withdrawalExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Withdrawal execute transaction/record 
   * @return withdrawalExecuteRecordReference
  **/

  public String getWithdrawalExecuteRecordReference() {
    return withdrawalExecuteRecordReference;
  }

  public void setWithdrawalExecuteRecordReference(String withdrawalExecuteRecordReference) {
    this.withdrawalExecuteRecordReference = withdrawalExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

