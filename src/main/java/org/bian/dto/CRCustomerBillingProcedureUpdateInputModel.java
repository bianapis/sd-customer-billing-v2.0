package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureUpdateInputModel
 */
public class CRCustomerBillingProcedureUpdateInputModel   {
  private String customerBillingServicingSessionReference = null;

  private String customerBillingProcedureInstanceReference = null;

  private CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private Object customerBillingProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerBillingProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerBillingProcedureUpdateActionTaskRecord() {
    return customerBillingProcedureUpdateActionTaskRecord;
  }

  public void setCustomerBillingProcedureUpdateActionTaskRecord(Object customerBillingProcedureUpdateActionTaskRecord) {
    this.customerBillingProcedureUpdateActionTaskRecord = customerBillingProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

