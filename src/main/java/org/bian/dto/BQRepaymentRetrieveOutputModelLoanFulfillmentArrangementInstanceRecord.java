package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord
 */
public class BQRepaymentRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String loanNumber = null;

  private String customerReference = null;

  private String partyReference = null;

  private String repaymentType = null;

  private String loanAccessTerms = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private String loanOutstandingBalance = null;

  private CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the loan product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated loan account number in any suitable format 
   * @return loanNumber
  **/

  public String getLoanNumber() {
    return loanNumber;
  }

  public void setLoanNumber(String loanNumber) {
    this.loanNumber = loanNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The legal entity reference for the borrower, likely to be the same as customer 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of repayment arrangement in place (e.g. structured) 
   * @return repaymentType
  **/

  public String getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(String repaymentType) {
    this.repaymentType = repaymentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Access terms that apply (e.g. allowed payments/withdrawals) 
   * @return loanAccessTerms
  **/

  public String getLoanAccessTerms() {
    return loanAccessTerms;
  }

  public void setLoanAccessTerms(String loanAccessTerms) {
    this.loanAccessTerms = loanAccessTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outstanding balance 
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

