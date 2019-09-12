package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveInputModelDisbursementInstanceAnalysis
 */
public class BQDisbursementRetrieveInputModelDisbursementInstanceAnalysis   {
  private String disbursementInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return disbursementInstanceAnalysisReference
  **/

  public String getDisbursementInstanceAnalysisReference() {
    return disbursementInstanceAnalysisReference;
  }

  public void setDisbursementInstanceAnalysisReference(String disbursementInstanceAnalysisReference) {
    this.disbursementInstanceAnalysisReference = disbursementInstanceAnalysisReference;
  }


}

