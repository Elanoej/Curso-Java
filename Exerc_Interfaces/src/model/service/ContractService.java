package model.service;

import java.util.Date;

import model.entitties.Contract;
import model.entitties.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 0; i < months; i++) {

			Date dueDate = addMonths(contract.getDate(), i + 1);
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i + 1);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			Installment inst = new Installment(dueDate, fullQuota);
			contract.addInstallments(inst);
		}
	}

	private Date addMonths(Date date, int n) {
		long months = 1000 * 60 * 60 * 24 * 30 * n;
		Date d01 = new Date(months + date.getTime());
		return d01;
	}

}
