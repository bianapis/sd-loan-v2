package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRequestOutputModel
 */
public class BQWithdrawalRequestOutputModel   {
  private BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private String withdrawalRequestActionTaskReference = null;

  private Object withdrawalRequestActionTaskRecord = null;

  private String withdrawalRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Withdrawal instance request service call 
   * @return withdrawalRequestActionTaskReference
  **/

  public String getWithdrawalRequestActionTaskReference() {
    return withdrawalRequestActionTaskReference;
  }

  public void setWithdrawalRequestActionTaskReference(String withdrawalRequestActionTaskReference) {
    this.withdrawalRequestActionTaskReference = withdrawalRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Withdrawal service request record 
   * @return withdrawalRequestRecordReference
  **/

  public String getWithdrawalRequestRecordReference() {
    return withdrawalRequestRecordReference;
  }

  public void setWithdrawalRequestRecordReference(String withdrawalRequestRecordReference) {
    this.withdrawalRequestRecordReference = withdrawalRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

