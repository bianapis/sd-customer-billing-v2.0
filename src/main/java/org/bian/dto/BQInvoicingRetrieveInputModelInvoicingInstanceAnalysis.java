package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveInputModelInvoicingInstanceAnalysis
 */
public class BQInvoicingRetrieveInputModelInvoicingInstanceAnalysis   {
  private String invoicingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return invoicingInstanceAnalysisReference
  **/

  public String getInvoicingInstanceAnalysisReference() {
    return invoicingInstanceAnalysisReference;
  }

  public void setInvoicingInstanceAnalysisReference(String invoicingInstanceAnalysisReference) {
    this.invoicingInstanceAnalysisReference = invoicingInstanceAnalysisReference;
  }


}

