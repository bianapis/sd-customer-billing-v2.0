package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecordCustomerReminderContactRecord;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord
 */
public class BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord   {
  private BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecordCustomerReminderContactRecord customerReminderContactRecord = null;

  private String trackingandRemindersResult = null;

  private String trackingandRemindersWorkProduct = null;


  /**
   * Get customerReminderContactRecord
   * @return customerReminderContactRecord
  **/

  public BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecordCustomerReminderContactRecord getCustomerReminderContactRecord() {
    return customerReminderContactRecord;
  }

  public void setCustomerReminderContactRecord(BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecordCustomerReminderContactRecord customerReminderContactRecord) {
    this.customerReminderContactRecord = customerReminderContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the tracking and reminder activity 
   * @return trackingandRemindersResult
  **/

  public String getTrackingandRemindersResult() {
    return trackingandRemindersResult;
  }

  public void setTrackingandRemindersResult(String trackingandRemindersResult) {
    this.trackingandRemindersResult = trackingandRemindersResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return trackingandRemindersWorkProduct
  **/

  public String getTrackingandRemindersWorkProduct() {
    return trackingandRemindersWorkProduct;
  }

  public void setTrackingandRemindersWorkProduct(String trackingandRemindersWorkProduct) {
    this.trackingandRemindersWorkProduct = trackingandRemindersWorkProduct;
  }


}

