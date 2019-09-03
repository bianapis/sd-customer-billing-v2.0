package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceAnalysis
 */
public class BQTrackingandRemindersRetrieveInputModelTrackingandRemindersInstanceAnalysis   {
  private String trackingandRemindersInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return trackingandRemindersInstanceAnalysisReference
  **/

  public String getTrackingandRemindersInstanceAnalysisReference() {
    return trackingandRemindersInstanceAnalysisReference;
  }

  public void setTrackingandRemindersInstanceAnalysisReference(String trackingandRemindersInstanceAnalysisReference) {
    this.trackingandRemindersInstanceAnalysisReference = trackingandRemindersInstanceAnalysisReference;
  }


}

