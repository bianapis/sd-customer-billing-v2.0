/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerBillingApiService {

	SDCustomerBillingActivateOutputModel activate(SDCustomerBillingActivateInputModel request);
	
	SDCustomerBillingConfigureOutputModel configure(String sdReferenceId, SDCustomerBillingConfigureInputModel request);
	
	CRCustomerBillingProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureControlInputModel request);
	
	BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request);
	
	BQTrackingandRemindersExchangeOutputModel exchangeTrackingandreminders(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandRemindersExchangeInputModel request);
	
	CRCustomerBillingProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureExecuteInputModel request);
	
	SDCustomerBillingFeedbackOutputModel feedback(String sdReferenceId, SDCustomerBillingFeedbackInputModel request);
	
	CRCustomerBillingProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerBillingProcedureInitiateInputModel request);
	
	BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request);
	
	BQTrackingandRemindersInitiateOutputModel initiateTrackingandreminders(String sdReferenceId, String crReferenceId, BQTrackingandRemindersInitiateInputModel request);
	
	CRCustomerBillingProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureRequestInputModel request);
	
	CRCustomerBillingProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQInvoicingRetrieveOutputModel retrieveInvoicing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTrackingandRemindersRetrieveOutputModel retrieveTrackingandreminders(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerBillingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerBillingProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureUpdateInputModel request);
	
	BQInvoicingUpdateOutputModel updateInvoicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInvoicingUpdateInputModel request);
	
	BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request);
	
}
