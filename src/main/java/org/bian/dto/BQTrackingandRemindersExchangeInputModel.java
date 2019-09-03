package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersExchangeInputModel
 */
public class BQTrackingandRemindersExchangeInputModel   {
  private String customerBillingProcedureInstanceReference = null;

  private String trackingandRemindersInstanceReference = null;

  private Object trackingandRemindersExchangeActionTaskRecord = null;

  private BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest trackingandRemindersExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Tracking and Reminders instance 
   * @return trackingandRemindersInstanceReference
  **/

  public String getTrackingandRemindersInstanceReference() {
    return trackingandRemindersInstanceReference;
  }

  public void setTrackingandRemindersInstanceReference(String trackingandRemindersInstanceReference) {
    this.trackingandRemindersInstanceReference = trackingandRemindersInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return trackingandRemindersExchangeActionTaskRecord
  **/

  public Object getTrackingandRemindersExchangeActionTaskRecord() {
    return trackingandRemindersExchangeActionTaskRecord;
  }

  public void setTrackingandRemindersExchangeActionTaskRecord(Object trackingandRemindersExchangeActionTaskRecord) {
    this.trackingandRemindersExchangeActionTaskRecord = trackingandRemindersExchangeActionTaskRecord;
  }


  /**
   * Get trackingandRemindersExchangeActionRequest
   * @return trackingandRemindersExchangeActionRequest
  **/

  public BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest getTrackingandRemindersExchangeActionRequest() {
    return trackingandRemindersExchangeActionRequest;
  }

  public void setTrackingandRemindersExchangeActionRequest(BQTrackingandRemindersExchangeInputModelTrackingandRemindersExchangeActionRequest trackingandRemindersExchangeActionRequest) {
    this.trackingandRemindersExchangeActionRequest = trackingandRemindersExchangeActionRequest;
  }


}

