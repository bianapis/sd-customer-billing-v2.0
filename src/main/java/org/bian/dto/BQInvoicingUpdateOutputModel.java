package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvoicingUpdateInputModelInvoicingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvoicingUpdateOutputModel
 */
public class BQInvoicingUpdateOutputModel   {
  private BQInvoicingUpdateInputModelInvoicingInstanceRecord invoicingInstanceRecord = null;

  private String invoicingUpdateActionTaskReference = null;

  private Object invoicingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get invoicingInstanceRecord
   * @return invoicingInstanceRecord
  **/

  public BQInvoicingUpdateInputModelInvoicingInstanceRecord getInvoicingInstanceRecord() {
    return invoicingInstanceRecord;
  }

  public void setInvoicingInstanceRecord(BQInvoicingUpdateInputModelInvoicingInstanceRecord invoicingInstanceRecord) {
    this.invoicingInstanceRecord = invoicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return invoicingUpdateActionTaskReference
  **/

  public String getInvoicingUpdateActionTaskReference() {
    return invoicingUpdateActionTaskReference;
  }

  public void setInvoicingUpdateActionTaskReference(String invoicingUpdateActionTaskReference) {
    this.invoicingUpdateActionTaskReference = invoicingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return invoicingUpdateActionTaskRecord
  **/

  public Object getInvoicingUpdateActionTaskRecord() {
    return invoicingUpdateActionTaskRecord;
  }

  public void setInvoicingUpdateActionTaskRecord(Object invoicingUpdateActionTaskRecord) {
    this.invoicingUpdateActionTaskRecord = invoicingUpdateActionTaskRecord;
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

