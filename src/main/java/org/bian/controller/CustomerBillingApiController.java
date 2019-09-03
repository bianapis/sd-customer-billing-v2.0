/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerBillingApiController {

	@Autowired
	CustomerBillingApiService service;
	
	@Process.Activate
	public BianResponse<SDCustomerBillingActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerBillingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCustomerBillingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerBillingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCustomerBillingProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerBillingProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.Exchange
	public BianResponse<BQPaymentsExchangeOutputModel> exchangePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandreminders")
	@Process.Exchange
	public BianResponse<BQTrackingandRemindersExchangeOutputModel> exchangeTrackingandreminders(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTrackingandRemindersExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTrackingandreminders(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRCustomerBillingProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerBillingProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCustomerBillingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerBillingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCustomerBillingProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerBillingProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.Initiate
	public BianResponse<BQPaymentsInitiateOutputModel> initiatePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePayments(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandreminders")
	@Process.Initiate
	public BianResponse<BQTrackingandRemindersInitiateOutputModel> initiateTrackingandreminders(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTrackingandRemindersInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTrackingandreminders(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCustomerBillingProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerBillingProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCustomerBillingProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("invoicing")
	@Process.Retrieve
	public BianResponse<BQInvoicingRetrieveOutputModel> retrieveInvoicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInvoicing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Process.Retrieve
	public BianResponse<BQPaymentsRetrieveOutputModel> retrievePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("trackingandreminders")
	@Process.Retrieve
	public BianResponse<BQTrackingandRemindersRetrieveOutputModel> retrieveTrackingandreminders(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTrackingandreminders(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCustomerBillingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCustomerBillingProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerBillingProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("invoicing")
	@Process.Update
	public BianResponse<BQInvoicingUpdateOutputModel> updateInvoicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInvoicingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInvoicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.Update
	public BianResponse<BQPaymentsUpdateOutputModel> updatePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
