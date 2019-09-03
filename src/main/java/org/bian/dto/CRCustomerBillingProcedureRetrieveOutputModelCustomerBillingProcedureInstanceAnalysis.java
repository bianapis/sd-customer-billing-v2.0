package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceAnalysis
 */
public class CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceAnalysis   {
  private String customerBillingProcedureInstanceAnalysisData = null;

  private String customerBillingProcedureInstanceAnalysisReportType = null;

  private Object customerBillingProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerBillingProcedureInstanceAnalysisData
  **/

  public String getCustomerBillingProcedureInstanceAnalysisData() {
    return customerBillingProcedureInstanceAnalysisData;
  }

  public void setCustomerBillingProcedureInstanceAnalysisData(String customerBillingProcedureInstanceAnalysisData) {
    this.customerBillingProcedureInstanceAnalysisData = customerBillingProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerBillingProcedureInstanceAnalysisReport
  **/

  public Object getCustomerBillingProcedureInstanceAnalysisReport() {
    return customerBillingProcedureInstanceAnalysisReport;
  }

  public void setCustomerBillingProcedureInstanceAnalysisReport(Object customerBillingProcedureInstanceAnalysisReport) {
    this.customerBillingProcedureInstanceAnalysisReport = customerBillingProcedureInstanceAnalysisReport;
  }


}

