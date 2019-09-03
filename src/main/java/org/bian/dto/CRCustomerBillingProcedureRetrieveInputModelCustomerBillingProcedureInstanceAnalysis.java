package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceAnalysis
 */
public class CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceAnalysis   {
  private String customerBillingProcedureInstanceAnalysisReference = null;

  private String customerBillingProcedureInstanceAnalysisReportType = null;

  private String customerBillingProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerBillingProcedureInstanceAnalysisReference
  **/

  public String getCustomerBillingProcedureInstanceAnalysisReference() {
    return customerBillingProcedureInstanceAnalysisReference;
  }

  public void setCustomerBillingProcedureInstanceAnalysisReference(String customerBillingProcedureInstanceAnalysisReference) {
    this.customerBillingProcedureInstanceAnalysisReference = customerBillingProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerBillingProcedureInstanceAnalysisReportType
  **/

  public String getCustomerBillingProcedureInstanceAnalysisReportType() {
    return customerBillingProcedureInstanceAnalysisReportType;
  }

  public void setCustomerBillingProcedureInstanceAnalysisReportType(String customerBillingProcedureInstanceAnalysisReportType) {
    this.customerBillingProcedureInstanceAnalysisReportType = customerBillingProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerBillingProcedureInstanceAnalysisParameters
  **/

  public String getCustomerBillingProcedureInstanceAnalysisParameters() {
    return customerBillingProcedureInstanceAnalysisParameters;
  }

  public void setCustomerBillingProcedureInstanceAnalysisParameters(String customerBillingProcedureInstanceAnalysisParameters) {
    this.customerBillingProcedureInstanceAnalysisParameters = customerBillingProcedureInstanceAnalysisParameters;
  }


}

