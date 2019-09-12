package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentExecuteOutputModelRepaymentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRepaymentRequestOutputModel
 */
public class BQRepaymentRequestOutputModel   {
  private BQRepaymentExecuteOutputModelRepaymentInstanceRecord repaymentInstanceRecord = null;

  private String repaymentRequestActionTaskReference = null;

  private Object repaymentRequestActionTaskRecord = null;

  private String repaymentRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get repaymentInstanceRecord
   * @return repaymentInstanceRecord
  **/

  public BQRepaymentExecuteOutputModelRepaymentInstanceRecord getRepaymentInstanceRecord() {
    return repaymentInstanceRecord;
  }

  public void setRepaymentInstanceRecord(BQRepaymentExecuteOutputModelRepaymentInstanceRecord repaymentInstanceRecord) {
    this.repaymentInstanceRecord = repaymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Repayment instance request service call 
   * @return repaymentRequestActionTaskReference
  **/

  public String getRepaymentRequestActionTaskReference() {
    return repaymentRequestActionTaskReference;
  }

  public void setRepaymentRequestActionTaskReference(String repaymentRequestActionTaskReference) {
    this.repaymentRequestActionTaskReference = repaymentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return repaymentRequestActionTaskRecord
  **/

  public Object getRepaymentRequestActionTaskRecord() {
    return repaymentRequestActionTaskRecord;
  }

  public void setRepaymentRequestActionTaskRecord(Object repaymentRequestActionTaskRecord) {
    this.repaymentRequestActionTaskRecord = repaymentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Repayment service request record 
   * @return repaymentRequestRecordReference
  **/

  public String getRepaymentRequestRecordReference() {
    return repaymentRequestRecordReference;
  }

  public void setRepaymentRequestRecordReference(String repaymentRequestRecordReference) {
    this.repaymentRequestRecordReference = repaymentRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

