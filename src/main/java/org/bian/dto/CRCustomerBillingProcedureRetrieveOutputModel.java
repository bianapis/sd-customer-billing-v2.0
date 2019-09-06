package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRetrieveOutputModel
 */
public class CRCustomerBillingProcedureRetrieveOutputModel   {
  private CRCustomerBillingProcedureRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private String customerBillingProcedureRetrieveActionTaskReference = null;

  private Object customerBillingProcedureRetrieveActionTaskRecord = null;

  private String customerBillingProcedureRetrieveActionResponse = null;

  private CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceReportRecord customerBillingProcedureInstanceReportRecord = null;

  private CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceAnalysis customerBillingProcedureInstanceAnalysis = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public CRCustomerBillingProcedureRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerBillingProcedureInstanceRecord")
  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Billing Procedure instance retrieve service call 
   * @return customerBillingProcedureRetrieveActionTaskReference
  **/

  public String getCustomerBillingProcedureRetrieveActionTaskReference() {
    return customerBillingProcedureRetrieveActionTaskReference;
  }

  public void setCustomerBillingProcedureRetrieveActionTaskReference(String customerBillingProcedureRetrieveActionTaskReference) {
    this.customerBillingProcedureRetrieveActionTaskReference = customerBillingProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerBillingProcedureRetrieveActionResponse
  **/

  public String getCustomerBillingProcedureRetrieveActionResponse() {
    return customerBillingProcedureRetrieveActionResponse;
  }

  public void setCustomerBillingProcedureRetrieveActionResponse(String customerBillingProcedureRetrieveActionResponse) {
    this.customerBillingProcedureRetrieveActionResponse = customerBillingProcedureRetrieveActionResponse;
  }


  /**
   * Get customerBillingProcedureInstanceReportRecord
   * @return customerBillingProcedureInstanceReportRecord
  **/

  public CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceReportRecord getCustomerBillingProcedureInstanceReportRecord() {
    return customerBillingProcedureInstanceReportRecord;
  }

  public void setCustomerBillingProcedureInstanceReportRecord(CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceReportRecord customerBillingProcedureInstanceReportRecord) {
    this.customerBillingProcedureInstanceReportRecord = customerBillingProcedureInstanceReportRecord;
  }


  /**
   * Get customerBillingProcedureInstanceAnalysis
   * @return customerBillingProcedureInstanceAnalysis
  **/

  public CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceAnalysis getCustomerBillingProcedureInstanceAnalysis() {
    return customerBillingProcedureInstanceAnalysis;
  }

  public void setCustomerBillingProcedureInstanceAnalysis(CRCustomerBillingProcedureRetrieveOutputModelCustomerBillingProcedureInstanceAnalysis customerBillingProcedureInstanceAnalysis) {
    this.customerBillingProcedureInstanceAnalysis = customerBillingProcedureInstanceAnalysis;
  }


}

