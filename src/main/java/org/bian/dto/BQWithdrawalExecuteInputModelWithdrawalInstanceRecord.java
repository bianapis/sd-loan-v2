package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalExecuteInputModelWithdrawalInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQWithdrawalExecuteInputModelWithdrawalInstanceRecord
 */
public class BQWithdrawalExecuteInputModelWithdrawalInstanceRecord   {
  private BQWithdrawalExecuteInputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQWithdrawalExecuteInputModelWithdrawalInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQWithdrawalExecuteInputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

