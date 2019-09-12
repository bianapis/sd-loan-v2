/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LoanApiService {

	SDLoanActivateOutputModel activate(SDLoanActivateInputModel request);
	
	SDLoanConfigureOutputModel configure(String sdReferenceId, SDLoanConfigureInputModel request);
	
	CRLoanFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRLoanFulfillmentArrangementControlInputModel request);
	
	BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request);
	
	BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	BQWithdrawalExecuteOutputModel executeWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalExecuteInputModel request);
	
	SDLoanFeedbackOutputModel feedback(String sdReferenceId, SDLoanFeedbackInputModel request);
	
	CRLoanFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRLoanFulfillmentArrangementInitiateInputModel request);
	
	BQRestructuringInitiateOutputModel initiateRestructuring(String sdReferenceId, String crReferenceId, BQRestructuringInitiateInputModel request);
	
	BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request);
	
	BQRepaymentRequestOutputModel requestRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentRequestInputModel request);
	
	BQRestructuringRequestOutputModel requestRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringRequestInputModel request);
	
	BQWithdrawalRequestOutputModel requestWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalRequestInputModel request);
	
	CRLoanFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQDisbursementRetrieveOutputModel retrieveDisbursement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQWithdrawalRetrieveOutputModel retrieveWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDLoanRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRLoanFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLoanFulfillmentArrangementUpdateInputModel request);
	
	BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request);
	
	BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request);
	
	BQWithdrawalUpdateOutputModel updateWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalUpdateInputModel request);
	
}
