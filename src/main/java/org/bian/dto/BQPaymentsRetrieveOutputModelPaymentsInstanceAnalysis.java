package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveOutputModelPaymentsInstanceAnalysis
 */
public class BQPaymentsRetrieveOutputModelPaymentsInstanceAnalysis   {
  private Object paymentsInstanceAnalysisRecord = null;

  private String paymentsInstanceAnalysisReportType = null;

  private String paymentsInstanceAnalysisParameters = null;

  private Object paymentsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentsInstanceAnalysisRecord
  **/

  public Object getPaymentsInstanceAnalysisRecord() {
    return paymentsInstanceAnalysisRecord;
  }

  public void setPaymentsInstanceAnalysisRecord(Object paymentsInstanceAnalysisRecord) {
    this.paymentsInstanceAnalysisRecord = paymentsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentsInstanceAnalysisReportType
  **/

  public String getPaymentsInstanceAnalysisReportType() {
    return paymentsInstanceAnalysisReportType;
  }

  public void setPaymentsInstanceAnalysisReportType(String paymentsInstanceAnalysisReportType) {
    this.paymentsInstanceAnalysisReportType = paymentsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentsInstanceAnalysisParameters
  **/

  public String getPaymentsInstanceAnalysisParameters() {
    return paymentsInstanceAnalysisParameters;
  }

  public void setPaymentsInstanceAnalysisParameters(String paymentsInstanceAnalysisParameters) {
    this.paymentsInstanceAnalysisParameters = paymentsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return paymentsInstanceAnalysisReport
  **/

  public Object getPaymentsInstanceAnalysisReport() {
    return paymentsInstanceAnalysisReport;
  }

  public void setPaymentsInstanceAnalysisReport(Object paymentsInstanceAnalysisReport) {
    this.paymentsInstanceAnalysisReport = paymentsInstanceAnalysisReport;
  }


}

