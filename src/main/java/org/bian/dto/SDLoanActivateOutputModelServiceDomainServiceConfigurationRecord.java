package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDLoanActivateInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import org.bian.dto.SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement;
import org.bian.dto.SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDLoanActivateOutputModelServiceDomainServiceConfigurationRecord
 */
public class SDLoanActivateOutputModelServiceDomainServiceConfigurationRecord   {
  private String serviceDomainServiceConfigurationSettingReference = null;

  private String serviceDomainServiceConfigurationSettingDescription = null;

  private SDLoanActivateInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup = null;

  private SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription = null;

  private SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement = null;

  private String serviceDomainServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  **/

  public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return serviceDomainServiceConfigurationSettingDescription
  **/

  public String getServiceDomainServiceConfigurationSettingDescription() {
    return serviceDomainServiceConfigurationSettingDescription;
  }

  public void setServiceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
    this.serviceDomainServiceConfigurationSettingDescription = serviceDomainServiceConfigurationSettingDescription;
  }


  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/

  public SDLoanActivateInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(SDLoanActivateInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }


  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  **/

  public SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }


  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  **/

  public SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(SDLoanActivateOutputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return serviceDomainServiceStatus
  **/

  public String getServiceDomainServiceStatus() {
    return serviceDomainServiceStatus;
  }

  public void setServiceDomainServiceStatus(String serviceDomainServiceStatus) {
    this.serviceDomainServiceStatus = serviceDomainServiceStatus;
  }


}

