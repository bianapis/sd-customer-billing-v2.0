package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveInputModelPaymentsInstanceReport
 */
public class BQPaymentsRetrieveInputModelPaymentsInstanceReport   {
  private String paymentsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentsInstanceReportReference
  **/

  public String getPaymentsInstanceReportReference() {
    return paymentsInstanceReportReference;
  }

  public void setPaymentsInstanceReportReference(String paymentsInstanceReportReference) {
    this.paymentsInstanceReportReference = paymentsInstanceReportReference;
  }


}

