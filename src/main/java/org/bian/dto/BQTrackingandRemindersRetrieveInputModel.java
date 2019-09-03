package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceAnalysis;
import org.bian.dto.BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersRetrieveInputModel
 */
public class BQTrackingandRemindersRetrieveInputModel   {
  private Object trackingandRemindersRetrieveActionTaskRecord = null;

  private String trackingandRemindersRetrieveActionRequest = null;

  private BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceReport trackingandRemindersInstanceReport = null;

  private BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceAnalysis trackingandRemindersInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trackingandRemindersRetrieveActionTaskRecord
  **/

  public Object getTrackingandRemindersRetrieveActionTaskRecord() {
    return trackingandRemindersRetrieveActionTaskRecord;
  }

  public void setTrackingandRemindersRetrieveActionTaskRecord(Object trackingandRemindersRetrieveActionTaskRecord) {
    this.trackingandRemindersRetrieveActionTaskRecord = trackingandRemindersRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return trackingandRemindersRetrieveActionRequest
  **/

  public String getTrackingandRemindersRetrieveActionRequest() {
    return trackingandRemindersRetrieveActionRequest;
  }

  public void setTrackingandRemindersRetrieveActionRequest(String trackingandRemindersRetrieveActionRequest) {
    this.trackingandRemindersRetrieveActionRequest = trackingandRemindersRetrieveActionRequest;
  }


  /**
   * Get trackingandRemindersInstanceReport
   * @return trackingandRemindersInstanceReport
  **/

  public BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceReport getTrackingandRemindersInstanceReport() {
    return trackingandRemindersInstanceReport;
  }

  public void setTrackingandRemindersInstanceReport(BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceReport trackingandRemindersInstanceReport) {
    this.trackingandRemindersInstanceReport = trackingandRemindersInstanceReport;
  }


  /**
   * Get trackingandRemindersInstanceAnalysis
   * @return trackingandRemindersInstanceAnalysis
  **/

  public BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceAnalysis getTrackingandRemindersInstanceAnalysis() {
    return trackingandRemindersInstanceAnalysis;
  }

  public void setTrackingandRemindersInstanceAnalysis(BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceAnalysis trackingandRemindersInstanceAnalysis) {
    this.trackingandRemindersInstanceAnalysis = trackingandRemindersInstanceAnalysis;
  }


}

