package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureInitiateInputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureInitiateInputModel
 */
public class CRCustomerBillingProcedureInitiateInputModel   {
  private String customerBillingServicingSessionReference = null;

  private Object customerBillingProcedureInitiateActionRecord = null;

  private String customerBillingProcedureInstanceStatus = null;

  private CRCustomerBillingProcedureInitiateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerBillingServicingSessionReference
  **/

  public String getCustomerBillingServicingSessionReference() {
    return customerBillingServicingSessionReference;
  }

  public void setCustomerBillingServicingSessionReference(String customerBillingServicingSessionReference) {
    this.customerBillingServicingSessionReference = customerBillingServicingSessionReference;
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

  public CRCustomerBillingProcedureInitiateInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureInitiateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


}

