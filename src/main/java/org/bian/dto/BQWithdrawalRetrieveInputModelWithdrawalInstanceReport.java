package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveInputModelWithdrawalInstanceReport
 */
public class BQWithdrawalRetrieveInputModelWithdrawalInstanceReport   {
  private String withdrawalInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return withdrawalInstanceReportReference
  **/

  public String getWithdrawalInstanceReportReference() {
    return withdrawalInstanceReportReference;
  }

  public void setWithdrawalInstanceReportReference(String withdrawalInstanceReportReference) {
    this.withdrawalInstanceReportReference = withdrawalInstanceReportReference;
  }


}

