package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceAnalysis
 */
public class BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceAnalysis   {
  private Object trackingandRemindersInstanceAnalysisRecord = null;

  private String trackingandRemindersInstanceAnalysisReportType = null;

  private String trackingandRemindersInstanceAnalysisParameters = null;

  private Object trackingandRemindersInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return trackingandRemindersInstanceAnalysisRecord
  **/

  public Object getTrackingandRemindersInstanceAnalysisRecord() {
    return trackingandRemindersInstanceAnalysisRecord;
  }

  public void setTrackingandRemindersInstanceAnalysisRecord(Object trackingandRemindersInstanceAnalysisRecord) {
    this.trackingandRemindersInstanceAnalysisRecord = trackingandRemindersInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return trackingandRemindersInstanceAnalysisReportType
  **/

  public String getTrackingandRemindersInstanceAnalysisReportType() {
    return trackingandRemindersInstanceAnalysisReportType;
  }

  public void setTrackingandRemindersInstanceAnalysisReportType(String trackingandRemindersInstanceAnalysisReportType) {
    this.trackingandRemindersInstanceAnalysisReportType = trackingandRemindersInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return trackingandRemindersInstanceAnalysisParameters
  **/

  public String getTrackingandRemindersInstanceAnalysisParameters() {
    return trackingandRemindersInstanceAnalysisParameters;
  }

  public void setTrackingandRemindersInstanceAnalysisParameters(String trackingandRemindersInstanceAnalysisParameters) {
    this.trackingandRemindersInstanceAnalysisParameters = trackingandRemindersInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return trackingandRemindersInstanceAnalysisReport
  **/

  public Object getTrackingandRemindersInstanceAnalysisReport() {
    return trackingandRemindersInstanceAnalysisReport;
  }

  public void setTrackingandRemindersInstanceAnalysisReport(Object trackingandRemindersInstanceAnalysisReport) {
    this.trackingandRemindersInstanceAnalysisReport = trackingandRemindersInstanceAnalysisReport;
  }


}

