package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPaymentsExchangeInputModel
 */
public class BQPaymentsExchangeInputModel   {
  private String customerBillingProcedureInstanceReference = null;

  private String paymentsInstanceReference = null;

  private Object paymentsExchangeActionTaskRecord = null;

  private BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest paymentsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentsExchangeActionTaskRecord
  **/

  public Object getPaymentsExchangeActionTaskRecord() {
    return paymentsExchangeActionTaskRecord;
  }

  public void setPaymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
    this.paymentsExchangeActionTaskRecord = paymentsExchangeActionTaskRecord;
  }


  /**
   * Get paymentsExchangeActionRequest
   * @return paymentsExchangeActionRequest
  **/

  public BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest getPaymentsExchangeActionRequest() {
    return paymentsExchangeActionRequest;
  }

  public void setPaymentsExchangeActionRequest(BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest paymentsExchangeActionRequest) {
    this.paymentsExchangeActionRequest = paymentsExchangeActionRequest;
  }


}

