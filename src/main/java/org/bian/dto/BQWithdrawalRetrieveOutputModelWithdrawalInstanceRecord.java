package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecord
 */
public class BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecord   {
  private BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQWithdrawalRetrieveOutputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

