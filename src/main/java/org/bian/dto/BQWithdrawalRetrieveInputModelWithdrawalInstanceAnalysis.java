package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalRetrieveInputModelWithdrawalInstanceAnalysis
 */
public class BQWithdrawalRetrieveInputModelWithdrawalInstanceAnalysis   {
  private String withdrawalInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return withdrawalInstanceAnalysisReference
  **/

  public String getWithdrawalInstanceAnalysisReference() {
    return withdrawalInstanceAnalysisReference;
  }

  public void setWithdrawalInstanceAnalysisReference(String withdrawalInstanceAnalysisReference) {
    this.withdrawalInstanceAnalysisReference = withdrawalInstanceAnalysisReference;
  }


}

