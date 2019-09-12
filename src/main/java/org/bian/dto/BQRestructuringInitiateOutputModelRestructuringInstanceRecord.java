package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateOutputModelRestructuringInstanceRecord
 */
public class BQRestructuringInitiateOutputModelRestructuringInstanceRecord   {
  private String restructuringTask = null;

  private String restructuringEvaluation = null;

  private String restructuringWriteDown = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the restructuring required 
   * @return restructuringTask
  **/

  public String getRestructuringTask() {
    return restructuringTask;
  }

  public void setRestructuringTask(String restructuringTask) {
    this.restructuringTask = restructuringTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of issue to resolve and the restructuring solution with associated changes to loan terms and the assessed impact 
   * @return restructuringEvaluation
  **/

  public String getRestructuringEvaluation() {
    return restructuringEvaluation;
  }

  public void setRestructuringEvaluation(String restructuringEvaluation) {
    this.restructuringEvaluation = restructuringEvaluation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Calculated loss/costs of restructuring 
   * @return restructuringWriteDown
  **/

  public String getRestructuringWriteDown() {
    return restructuringWriteDown;
  }

  public void setRestructuringWriteDown(String restructuringWriteDown) {
    this.restructuringWriteDown = restructuringWriteDown;
  }


}

