package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersExchangeOutputModel
 */
public class BQTrackingandRemindersExchangeOutputModel   {
  private String trackingandRemindersExchangeActionTaskReference = null;

  private Object trackingandRemindersExchangeActionTaskRecord = null;

  private String trackingandRemindersExchangeActionResponse = null;

  private String trackingandRemindersInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tracking and Reminders instance exchange service call 
   * @return trackingandRemindersExchangeActionTaskReference
  **/

  public String getTrackingandRemindersExchangeActionTaskReference() {
    return trackingandRemindersExchangeActionTaskReference;
  }

  public void setTrackingandRemindersExchangeActionTaskReference(String trackingandRemindersExchangeActionTaskReference) {
    this.trackingandRemindersExchangeActionTaskReference = trackingandRemindersExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return trackingandRemindersExchangeActionResponse
  **/

  public String getTrackingandRemindersExchangeActionResponse() {
    return trackingandRemindersExchangeActionResponse;
  }

  public void setTrackingandRemindersExchangeActionResponse(String trackingandRemindersExchangeActionResponse) {
    this.trackingandRemindersExchangeActionResponse = trackingandRemindersExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Tracking and Reminders instance (e.g. accepted, rejected, verified) 
   * @return trackingandRemindersInstanceStatus
  **/

  public String getTrackingandRemindersInstanceStatus() {
    return trackingandRemindersInstanceStatus;
  }

  public void setTrackingandRemindersInstanceStatus(String trackingandRemindersInstanceStatus) {
    this.trackingandRemindersInstanceStatus = trackingandRemindersInstanceStatus;
  }


}

