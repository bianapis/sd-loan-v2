package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalUpdateInputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalUpdateOutputModel
 */
public class BQWithdrawalUpdateOutputModel   {
  private BQWithdrawalUpdateInputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private String withdrawalUpdateActionTaskReference = null;

  private Object withdrawalUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get withdrawalInstanceRecord
   * @return withdrawalInstanceRecord
  **/

  public BQWithdrawalUpdateInputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalUpdateInputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return withdrawalUpdateActionTaskReference
  **/

  public String getWithdrawalUpdateActionTaskReference() {
    return withdrawalUpdateActionTaskReference;
  }

  public void setWithdrawalUpdateActionTaskReference(String withdrawalUpdateActionTaskReference) {
    this.withdrawalUpdateActionTaskReference = withdrawalUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return withdrawalUpdateActionTaskRecord
  **/

  public Object getWithdrawalUpdateActionTaskRecord() {
    return withdrawalUpdateActionTaskRecord;
  }

  public void setWithdrawalUpdateActionTaskRecord(Object withdrawalUpdateActionTaskRecord) {
    this.withdrawalUpdateActionTaskRecord = withdrawalUpdateActionTaskRecord;
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

