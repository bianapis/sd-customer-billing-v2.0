package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureInitiateOutputModel
 */
public class CRCustomerBillingProcedureInitiateOutputModel   {
  private String customerBillingProcedureInstanceReference = null;

  private String customerBillingProcedureInitiateActionReference = null;

  private Object customerBillingProcedureInitiateActionRecord = null;

  private String customerBillingProcedureInstanceStatus = null;

  private CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Billing Procedure instance 
   * @return customerBillingProcedureInstanceReference
  **/

  public String getCustomerBillingProcedureInstanceReference() {
    return customerBillingProcedureInstanceReference;
  }

  public void setCustomerBillingProcedureInstanceReference(String customerBillingProcedureInstanceReference) {
    this.customerBillingProcedureInstanceReference = customerBillingProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerBillingProcedureInitiateActionReference
  **/

  public String getCustomerBillingProcedureInitiateActionReference() {
    return customerBillingProcedureInitiateActionReference;
  }

  public void setCustomerBillingProcedureInitiateActionReference(String customerBillingProcedureInitiateActionReference) {
    this.customerBillingProcedureInitiateActionReference = customerBillingProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerBillingProcedureInitiateActionRecord
  **/

  public Object getCustomerBillingProcedureInitiateActionRecord() {
    return customerBillingProcedureInitiateActionRecord;
  }

  public void setCustomerBillingProcedureInitiateActionRecord(Object customerBillingProcedureInitiateActionRecord) {
    this.customerBillingProcedureInitiateActionRecord = customerBillingProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Billing Procedure instance (e.g. initialised, pending, active) 
   * @return customerBillingProcedureInstanceStatus
  **/

  public String getCustomerBillingProcedureInstanceStatus() {
    return customerBillingProcedureInstanceStatus;
  }

  public void setCustomerBillingProcedureInstanceStatus(String customerBillingProcedureInstanceStatus) {
    this.customerBillingProcedureInstanceStatus = customerBillingProcedureInstanceStatus;
  }


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerBillingProcedureInstanceRecord")
  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


}

