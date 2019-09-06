package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureUpdateOutputModel
 */
public class CRCustomerBillingProcedureUpdateOutputModel   {
  private CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private String customerBillingProcedureUpdateActionTaskReference = null;

  private Object customerBillingProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerBillingProcedureInstanceRecord")
  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureUpdateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerBillingProcedureUpdateActionTaskReference
  **/

  public String getCustomerBillingProcedureUpdateActionTaskReference() {
    return customerBillingProcedureUpdateActionTaskReference;
  }

  public void setCustomerBillingProcedureUpdateActionTaskReference(String customerBillingProcedureUpdateActionTaskReference) {
    this.customerBillingProcedureUpdateActionTaskReference = customerBillingProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerBillingProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerBillingProcedureUpdateActionTaskRecord() {
    return customerBillingProcedureUpdateActionTaskRecord;
  }

  public void setCustomerBillingProcedureUpdateActionTaskRecord(Object customerBillingProcedureUpdateActionTaskRecord) {
    this.customerBillingProcedureUpdateActionTaskRecord = customerBillingProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

