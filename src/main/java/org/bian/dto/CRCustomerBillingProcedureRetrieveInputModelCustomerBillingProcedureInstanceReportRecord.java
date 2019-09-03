package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceReportRecord
 */
public class CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceReportRecord   {
  private String customerBillingProcedureInstanceReportReference = null;

  private String customerBillingProcedureInstanceReportType = null;

  private String customerBillingProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerBillingProcedureInstanceReportReference
  **/

  public String getCustomerBillingProcedureInstanceReportReference() {
    return customerBillingProcedureInstanceReportReference;
  }

  public void setCustomerBillingProcedureInstanceReportReference(String customerBillingProcedureInstanceReportReference) {
    this.customerBillingProcedureInstanceReportReference = customerBillingProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerBillingProcedureInstanceReportType
  **/

  public String getCustomerBillingProcedureInstanceReportType() {
    return customerBillingProcedureInstanceReportType;
  }

  public void setCustomerBillingProcedureInstanceReportType(String customerBillingProcedureInstanceReportType) {
    this.customerBillingProcedureInstanceReportType = customerBillingProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerBillingProcedureInstanceReportParameters
  **/

  public String getCustomerBillingProcedureInstanceReportParameters() {
    return customerBillingProcedureInstanceReportParameters;
  }

  public void setCustomerBillingProcedureInstanceReportParameters(String customerBillingProcedureInstanceReportParameters) {
    this.customerBillingProcedureInstanceReportParameters = customerBillingProcedureInstanceReportParameters;
  }


}

