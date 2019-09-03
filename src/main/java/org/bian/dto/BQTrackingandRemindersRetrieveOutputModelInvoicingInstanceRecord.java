package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecord
 */
public class BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecord   {
  private BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord customerInvoiceRecord = null;


  /**
   * Get customerInvoiceRecord
   * @return customerInvoiceRecord
  **/

  public BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord getCustomerInvoiceRecord() {
    return customerInvoiceRecord;
  }

  public void setCustomerInvoiceRecord(BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord customerInvoiceRecord) {
    this.customerInvoiceRecord = customerInvoiceRecord;
  }


}

