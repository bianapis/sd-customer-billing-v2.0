package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.BQPaymentsRetrieveOutputModelPaymentsInstanceAnalysis;
import org.bian.dto.BQPaymentsRetrieveOutputModelPaymentsInstanceRecord;
import org.bian.dto.BQPaymentsRetrieveOutputModelPaymentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveOutputModel
 */
public class BQPaymentsRetrieveOutputModel   {
  private BQPaymentsRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private BQPaymentsRetrieveOutputModelPaymentsInstanceRecord paymentsInstanceRecord = null;

  private String paymentsRetrieveActionTaskReference = null;

  private Object paymentsRetrieveActionTaskRecord = null;

  private String paymentsRetrieveActionResponse = null;

  private BQPaymentsRetrieveOutputModelPaymentsInstanceReport paymentsInstanceReport = null;

  private BQPaymentsRetrieveOutputModelPaymentsInstanceAnalysis paymentsInstanceAnalysis = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public BQPaymentsRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(BQPaymentsRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsRetrieveOutputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsRetrieveOutputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance retrieve service call 
   * @return paymentsRetrieveActionTaskReference
  **/

  public String getPaymentsRetrieveActionTaskReference() {
    return paymentsRetrieveActionTaskReference;
  }

  public void setPaymentsRetrieveActionTaskReference(String paymentsRetrieveActionTaskReference) {
    this.paymentsRetrieveActionTaskReference = paymentsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentsRetrieveActionTaskRecord
  **/

  public Object getPaymentsRetrieveActionTaskRecord() {
    return paymentsRetrieveActionTaskRecord;
  }

  public void setPaymentsRetrieveActionTaskRecord(Object paymentsRetrieveActionTaskRecord) {
    this.paymentsRetrieveActionTaskRecord = paymentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentsRetrieveActionResponse
  **/

  public String getPaymentsRetrieveActionResponse() {
    return paymentsRetrieveActionResponse;
  }

  public void setPaymentsRetrieveActionResponse(String paymentsRetrieveActionResponse) {
    this.paymentsRetrieveActionResponse = paymentsRetrieveActionResponse;
  }


  /**
   * Get paymentsInstanceReport
   * @return paymentsInstanceReport
  **/

  public BQPaymentsRetrieveOutputModelPaymentsInstanceReport getPaymentsInstanceReport() {
    return paymentsInstanceReport;
  }

  public void setPaymentsInstanceReport(BQPaymentsRetrieveOutputModelPaymentsInstanceReport paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
  }


  /**
   * Get paymentsInstanceAnalysis
   * @return paymentsInstanceAnalysis
  **/

  public BQPaymentsRetrieveOutputModelPaymentsInstanceAnalysis getPaymentsInstanceAnalysis() {
    return paymentsInstanceAnalysis;
  }

  public void setPaymentsInstanceAnalysis(BQPaymentsRetrieveOutputModelPaymentsInstanceAnalysis paymentsInstanceAnalysis) {
    this.paymentsInstanceAnalysis = paymentsInstanceAnalysis;
  }


}

