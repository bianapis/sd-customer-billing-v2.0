package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureControlInputModelCustomerBillingProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureControlInputModel
 */
public class CRCustomerBillingProcedureControlInputModel   {
  private String customerBillingServicingSessionReference = null;

  private String customerBillingProcedureInstanceReference = null;

  private Object customerBillingProcedureControlActionTaskRecord = null;

  private CRCustomerBillingProcedureControlInputModelCustomerBillingProcedureControlActionRequest customerBillingProcedureControlActionRequest = null;


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
   * Get customerBillingProcedureControlActionRequest
   * @return customerBillingProcedureControlActionRequest
  **/

  public CRCustomerBillingProcedureControlInputModelCustomerBillingProcedureControlActionRequest getCustomerBillingProcedureControlActionRequest() {
    return customerBillingProcedureControlActionRequest;
  }

  public void setCustomerBillingProcedureControlActionRequest(CRCustomerBillingProcedureControlInputModelCustomerBillingProcedureControlActionRequest customerBillingProcedureControlActionRequest) {
    this.customerBillingProcedureControlActionRequest = customerBillingProcedureControlActionRequest;
  }


}

