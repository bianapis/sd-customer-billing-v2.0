package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceReport
 */
public class BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceReport   {
  private Object trackingandRemindersInstanceReportRecord = null;

  private String trackingandRemindersInstanceReportType = null;

  private String trackingandRemindersInstanceReportParameters = null;

  private Object trackingandRemindersInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return trackingandRemindersInstanceReportRecord
  **/

  public Object getTrackingandRemindersInstanceReportRecord() {
    return trackingandRemindersInstanceReportRecord;
  }

  public void setTrackingandRemindersInstanceReportRecord(Object trackingandRemindersInstanceReportRecord) {
    this.trackingandRemindersInstanceReportRecord = trackingandRemindersInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return trackingandRemindersInstanceReportType
  **/

  public String getTrackingandRemindersInstanceReportType() {
    return trackingandRemindersInstanceReportType;
  }

  public void setTrackingandRemindersInstanceReportType(String trackingandRemindersInstanceReportType) {
    this.trackingandRemindersInstanceReportType = trackingandRemindersInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return trackingandRemindersInstanceReportParameters
  **/

  public String getTrackingandRemindersInstanceReportParameters() {
    return trackingandRemindersInstanceReportParameters;
  }

  public void setTrackingandRemindersInstanceReportParameters(String trackingandRemindersInstanceReportParameters) {
    this.trackingandRemindersInstanceReportParameters = trackingandRemindersInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return trackingandRemindersInstanceReport
  **/

  public Object getTrackingandRemindersInstanceReport() {
    return trackingandRemindersInstanceReport;
  }

  public void setTrackingandRemindersInstanceReport(Object trackingandRemindersInstanceReport) {
    this.trackingandRemindersInstanceReport = trackingandRemindersInstanceReport;
  }


}

