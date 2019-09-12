package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType
 */
public class BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType   {
  private Object loanTaxReport = null;

  private String loanFeeType = null;

  private String loanFees = null;

  private String penalties = null;

  private String collateralValuation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A report summarizing tax considerations 
   * @return loanTaxReport
  **/

  public Object getLoanTaxReport() {
    return loanTaxReport;
  }

  public void setLoanTaxReport(Object loanTaxReport) {
    this.loanTaxReport = loanTaxReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of fee applied 
   * @return loanFeeType
  **/

  public String getLoanFeeType() {
    return loanFeeType;
  }

  public void setLoanFeeType(String loanFeeType) {
    this.loanFeeType = loanFeeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A report detailing fees applied to the loan account (range of fees possible for different actions) 
   * @return loanFees
  **/

  public String getLoanFees() {
    return loanFees;
  }

  public void setLoanFees(String loanFees) {
    this.loanFees = loanFees;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A report detailing penalties incurred as booked against loan account 
   * @return penalties
  **/

  public String getPenalties() {
    return penalties;
  }

  public void setPenalties(String penalties) {
    this.penalties = penalties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A report detailing the current applied collateral valuation (value confirmed as of date) 
   * @return collateralValuation
  **/

  public String getCollateralValuation() {
    return collateralValuation;
  }

  public void setCollateralValuation(String collateralValuation) {
    this.collateralValuation = collateralValuation;
  }


}

