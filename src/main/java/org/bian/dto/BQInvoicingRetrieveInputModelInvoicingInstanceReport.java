package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveInputModelInvoicingInstanceReport
 */
public class BQInvoicingRetrieveInputModelInvoicingInstanceReport   {
  private String invoicingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return invoicingInstanceReportReference
  **/

  public String getInvoicingInstanceReportReference() {
    return invoicingInstanceReportReference;
  }

  public void setInvoicingInstanceReportReference(String invoicingInstanceReportReference) {
    this.invoicingInstanceReportReference = invoicingInstanceReportReference;
  }


}

