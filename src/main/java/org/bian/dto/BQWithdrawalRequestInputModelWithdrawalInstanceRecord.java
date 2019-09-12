package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalRequestInputModelWithdrawalInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRequestInputModelWithdrawalInstanceRecord
 */
public class BQWithdrawalRequestInputModelWithdrawalInstanceRecord   {
  private BQWithdrawalRequestInputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQWithdrawalRequestInputModelWithdrawalInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQWithdrawalRequestInputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

