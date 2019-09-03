package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRetrieveInputModel
 */
public class CRCustomerBillingProcedureRetrieveInputModel   {
  private Object customerBillingProcedureRetrieveActionTaskRecord = null;

  private String customerBillingProcedureRetrieveActionRequest = null;

  private CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceReportRecord customerBillingProcedureInstanceReportRecord = null;

  private CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceAnalysis customerBillingProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerBillingProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerBillingProcedureRetrieveActionTaskRecord() {
    return customerBillingProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerBillingProcedureRetrieveActionTaskRecord(Object customerBillingProcedureRetrieveActionTaskRecord) {
    this.customerBillingProcedureRetrieveActionTaskRecord = customerBillingProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerBillingProcedureRetrieveActionRequest
  **/

  public String getCustomerBillingProcedureRetrieveActionRequest() {
    return customerBillingProcedureRetrieveActionRequest;
  }

  public void setCustomerBillingProcedureRetrieveActionRequest(String customerBillingProcedureRetrieveActionRequest) {
    this.customerBillingProcedureRetrieveActionRequest = customerBillingProcedureRetrieveActionRequest;
  }


  /**
   * Get customerBillingProcedureInstanceReportRecord
   * @return customerBillingProcedureInstanceReportRecord
  **/

  public CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceReportRecord getCustomerBillingProcedureInstanceReportRecord() {
    return customerBillingProcedureInstanceReportRecord;
  }

  public void setCustomerBillingProcedureInstanceReportRecord(CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceReportRecord customerBillingProcedureInstanceReportRecord) {
    this.customerBillingProcedureInstanceReportRecord = customerBillingProcedureInstanceReportRecord;
  }


  /**
   * Get customerBillingProcedureInstanceAnalysis
   * @return customerBillingProcedureInstanceAnalysis
  **/

  public CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceAnalysis getCustomerBillingProcedureInstanceAnalysis() {
    return customerBillingProcedureInstanceAnalysis;
  }

  public void setCustomerBillingProcedureInstanceAnalysis(CRCustomerBillingProcedureRetrieveInputModelCustomerBillingProcedureInstanceAnalysis customerBillingProcedureInstanceAnalysis) {
    this.customerBillingProcedureInstanceAnalysis = customerBillingProcedureInstanceAnalysis;
  }


}

