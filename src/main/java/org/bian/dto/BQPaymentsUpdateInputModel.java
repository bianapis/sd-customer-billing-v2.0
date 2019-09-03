package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsUpdateInputModelPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsUpdateInputModel
 */
public class BQPaymentsUpdateInputModel   {
  private String customerBillingProcedureInstanceReference = null;

  private String paymentsInstanceReference = null;

  private BQPaymentsUpdateInputModelPaymentsInstanceRecord paymentsInstanceRecord = null;

  private Object paymentsUpdateActionTaskRecord = null;

  private String paymentsUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Billing Procedure instance 
   * @return customerBillingProcedureInstanceReference
  **/

  public String getCustomerBillingProcedureInstanceReference() {
    return customerBillingProcedureInstanceReference;
  }

  public void setCustomerBillingProcedureInstanceReference(String customerBillingProcedureInstanceReference) {
    this.customerBillingProcedureInstanceReference = customerBillingProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  **/

  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsUpdateInputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsUpdateInputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentsUpdateActionTaskRecord
  **/

  public Object getPaymentsUpdateActionTaskRecord() {
    return paymentsUpdateActionTaskRecord;
  }

  public void setPaymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return paymentsUpdateActionRequest
  **/

  public String getPaymentsUpdateActionRequest() {
    return paymentsUpdateActionRequest;
  }

  public void setPaymentsUpdateActionRequest(String paymentsUpdateActionRequest) {
    this.paymentsUpdateActionRequest = paymentsUpdateActionRequest;
  }


}

