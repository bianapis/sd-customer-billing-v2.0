package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureExecuteOutputModel
 */
public class CRCustomerBillingProcedureExecuteOutputModel   {
  private CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private String customerBillingProcedureExecuteActionTaskReference = null;

  private Object customerBillingProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerBillingProcedureInstanceRecord")
  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Billing Procedure instance execute service call 
   * @return customerBillingProcedureExecuteActionTaskReference
  **/

  public String getCustomerBillingProcedureExecuteActionTaskReference() {
    return customerBillingProcedureExecuteActionTaskReference;
  }

  public void setCustomerBillingProcedureExecuteActionTaskReference(String customerBillingProcedureExecuteActionTaskReference) {
    this.customerBillingProcedureExecuteActionTaskReference = customerBillingProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerBillingProcedureExecuteActionTaskRecord
  **/

  public Object getCustomerBillingProcedureExecuteActionTaskRecord() {
    return customerBillingProcedureExecuteActionTaskRecord;
  }

  public void setCustomerBillingProcedureExecuteActionTaskRecord(Object customerBillingProcedureExecuteActionTaskRecord) {
    this.customerBillingProcedureExecuteActionTaskRecord = customerBillingProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

