package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalUpdateInputModelWithdrawalInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQWithdrawalUpdateInputModelWithdrawalInstanceRecord
 */
public class BQWithdrawalUpdateInputModelWithdrawalInstanceRecord   {
  private BQWithdrawalUpdateInputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQWithdrawalUpdateInputModelWithdrawalInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQWithdrawalUpdateInputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

