package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord;
import org.bian.dto.CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersInitiateOutputModel
 */
public class BQTrackingandRemindersInitiateOutputModel   {
  private CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private String trackingandRemindersInstanceReference = null;

  private String trackingandRemindersInitiateActionReference = null;

  private Object trackingandRemindersInitiateActionRecord = null;

  private String trackingandRemindersInstanceStatus = null;

  private BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord trackingandRemindersInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return trackingandRemindersInitiateActionReference
  **/

  public String getTrackingandRemindersInitiateActionReference() {
    return trackingandRemindersInitiateActionReference;
  }

  public void setTrackingandRemindersInitiateActionReference(String trackingandRemindersInitiateActionReference) {
    this.trackingandRemindersInitiateActionReference = trackingandRemindersInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return trackingandRemindersInitiateActionRecord
  **/

  public Object getTrackingandRemindersInitiateActionRecord() {
    return trackingandRemindersInitiateActionRecord;
  }

  public void setTrackingandRemindersInitiateActionRecord(Object trackingandRemindersInitiateActionRecord) {
    this.trackingandRemindersInitiateActionRecord = trackingandRemindersInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Tracking and Reminders instance (e.g. initialised, pending, active) 
   * @return trackingandRemindersInstanceStatus
  **/

  public String getTrackingandRemindersInstanceStatus() {
    return trackingandRemindersInstanceStatus;
  }

  public void setTrackingandRemindersInstanceStatus(String trackingandRemindersInstanceStatus) {
    this.trackingandRemindersInstanceStatus = trackingandRemindersInstanceStatus;
  }


  /**
   * Get trackingandRemindersInstanceRecord
   * @return trackingandRemindersInstanceRecord
  **/

  public BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord getTrackingandRemindersInstanceRecord() {
    return trackingandRemindersInstanceRecord;
  }

  public void setTrackingandRemindersInstanceRecord(BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord trackingandRemindersInstanceRecord) {
    this.trackingandRemindersInstanceRecord = trackingandRemindersInstanceRecord;
  }


}

