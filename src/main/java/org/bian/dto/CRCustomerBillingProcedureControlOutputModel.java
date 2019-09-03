package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureControlOutputModel
 */
public class CRCustomerBillingProcedureControlOutputModel   {
  private String customerBillingProcedureControlActionTaskReference = null;

  private Object customerBillingProcedureControlActionTaskRecord = null;

  private String customerBillingProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Billing Procedure instance control processing service call 
   * @return customerBillingProcedureControlActionTaskReference
  **/

  public String getCustomerBillingProcedureControlActionTaskReference() {
    return customerBillingProcedureControlActionTaskReference;
  }

  public void setCustomerBillingProcedureControlActionTaskReference(String customerBillingProcedureControlActionTaskReference) {
    this.customerBillingProcedureControlActionTaskReference = customerBillingProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerBillingProcedureControlActionTaskRecord
  **/

  public Object getCustomerBillingProcedureControlActionTaskRecord() {
    return customerBillingProcedureControlActionTaskRecord;
  }

  public void setCustomerBillingProcedureControlActionTaskRecord(Object customerBillingProcedureControlActionTaskRecord) {
    this.customerBillingProcedureControlActionTaskRecord = customerBillingProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerBillingProcedureControlActionResponse
  **/

  public String getCustomerBillingProcedureControlActionResponse() {
    return customerBillingProcedureControlActionResponse;
  }

  public void setCustomerBillingProcedureControlActionResponse(String customerBillingProcedureControlActionResponse) {
    this.customerBillingProcedureControlActionResponse = customerBillingProcedureControlActionResponse;
  }


}

