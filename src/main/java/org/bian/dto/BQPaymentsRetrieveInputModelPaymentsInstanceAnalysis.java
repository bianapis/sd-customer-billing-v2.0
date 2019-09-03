package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis
 */
public class BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis   {
  private String paymentsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentsInstanceAnalysisReference
  **/

  public String getPaymentsInstanceAnalysisReference() {
    return paymentsInstanceAnalysisReference;
  }

  public void setPaymentsInstanceAnalysisReference(String paymentsInstanceAnalysisReference) {
    this.paymentsInstanceAnalysisReference = paymentsInstanceAnalysisReference;
  }


}

