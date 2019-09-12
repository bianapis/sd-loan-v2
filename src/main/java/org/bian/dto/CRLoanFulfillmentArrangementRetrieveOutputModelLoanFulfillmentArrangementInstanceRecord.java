package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLoanFulfillmentArrangementInitiateInputModelLoanFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecordAssociations;

import javax.validation.Valid;
  
/**
 * CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord
 */
public class CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String loanNumber = null;

  private String customerReference = null;

  private String partyReference = null;

  private String customerAgreementReference = null;

  private String customerCreditAssessmentReference = null;

  private String insuranceReference = null;

  private String delinquencyCollectionReference = null;

  private String bankBranchLocationReference = null;

  private String bankAccountingUnitReference = null;

  private String loanType = null;

  private String loanAmount = null;

  private String loanCurrency = null;

  private String loanRateType = null;

  private String loanApplicableRate = null;

  private String repaymentType = null;

  private String interestType = null;

  private String interestAccrualMethod = null;

  private String loanOriginationDate = null;

  private String loanMaturityDate = null;

  private String collateralReference = null;

  private String collateralAllocation = null;

  private String taxReference = null;

  private String loanAccessTerms = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecordAssociations associations = null;

  private String loanRepaymentSchedule = null;

  private String stagedRepaymentStatement = null;

  private String customerCommentary = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer agreement 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an associated credit assessment 
   * @return customerCreditAssessmentReference
  **/

  public String getCustomerCreditAssessmentReference() {
    return customerCreditAssessmentReference;
  }

  public void setCustomerCreditAssessmentReference(String customerCreditAssessmentReference) {
    this.customerCreditAssessmentReference = customerCreditAssessmentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to applicable insurance arrangements 
   * @return insuranceReference
  **/

  public String getInsuranceReference() {
    return insuranceReference;
  }

  public void setInsuranceReference(String insuranceReference) {
    this.insuranceReference = insuranceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to collections/delinquency processing made against the loan 
   * @return delinquencyCollectionReference
  **/

  public String getDelinquencyCollectionReference() {
    return delinquencyCollectionReference;
  }

  public void setDelinquencyCollectionReference(String delinquencyCollectionReference) {
    this.delinquencyCollectionReference = delinquencyCollectionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank accounting unit associated with the account for booking purposes 
   * @return bankAccountingUnitReference
  **/

  public String getBankAccountingUnitReference() {
    return bankAccountingUnitReference;
  }

  public void setBankAccountingUnitReference(String bankAccountingUnitReference) {
    this.bankAccountingUnitReference = bankAccountingUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific type of loan (e.g. term, revolving, evergreen) 
   * @return loanType
  **/

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the loan 
   * @return loanAmount
  **/

  public String getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(String loanAmount) {
    this.loanAmount = loanAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the loan account 
   * @return loanCurrency
  **/

  public String getLoanCurrency() {
    return loanCurrency;
  }

  public void setLoanCurrency(String loanCurrency) {
    this.loanCurrency = loanCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The rate type to be applied to the loan 
   * @return loanRateType
  **/

  public String getLoanRateType() {
    return loanRateType;
  }

  public void setLoanRateType(String loanRateType) {
    this.loanRateType = loanRateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The applicable rate for the loan 
   * @return loanApplicableRate
  **/

  public String getLoanApplicableRate() {
    return loanApplicableRate;
  }

  public void setLoanApplicableRate(String loanApplicableRate) {
    this.loanApplicableRate = loanApplicableRate;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of interest to be applied (e.g. prime plus) 
   * @return interestType
  **/

  public String getInterestType() {
    return interestType;
  }

  public void setInterestType(String interestType) {
    this.interestType = interestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The accrual method applied to interest calculations 
   * @return interestAccrualMethod
  **/

  public String getInterestAccrualMethod() {
    return interestAccrualMethod;
  }

  public void setInterestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The origination date for the loan 
   * @return loanOriginationDate
  **/

  public String getLoanOriginationDate() {
    return loanOriginationDate;
  }

  public void setLoanOriginationDate(String loanOriginationDate) {
    this.loanOriginationDate = loanOriginationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The planned maturity date of the loan 
   * @return loanMaturityDate
  **/

  public String getLoanMaturityDate() {
    return loanMaturityDate;
  }

  public void setLoanMaturityDate(String loanMaturityDate) {
    this.loanMaturityDate = loanMaturityDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to allocated collateral 
   * @return collateralReference
  **/

  public String getCollateralReference() {
    return collateralReference;
  }

  public void setCollateralReference(String collateralReference) {
    this.collateralReference = collateralReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The collateral value applied to the loan 
   * @return collateralAllocation
  **/

  public String getCollateralAllocation() {
    return collateralAllocation;
  }

  public void setCollateralAllocation(String collateralAllocation) {
    this.collateralAllocation = collateralAllocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
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
   * Get associations
   * @return associations
  **/

  public CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRLoanFulfillmentArrangementRetrieveOutputModelLoanFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for loan repayments 
   * @return loanRepaymentSchedule
  **/

  public String getLoanRepaymentSchedule() {
    return loanRepaymentSchedule;
  }

  public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
    this.loanRepaymentSchedule = loanRepaymentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A statement maintained tracking repayments 
   * @return stagedRepaymentStatement
  **/

  public String getStagedRepaymentStatement() {
    return stagedRepaymentStatement;
  }

  public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of customer correspondence/feedback 
   * @return customerCommentary
  **/

  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
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

