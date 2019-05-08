package com.capgemini.bankapp.controller;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capgemini.bank.exception.BankAccountNotFoundException;
import com.capgemini.bank.exception.LowBalanceException;
import com.capgemini.bank.model.BankAccount;
import com.capgemini.bank.service.BankAccountService;
import com.capgemini.bank.service.impl.BankAccountServiceImpl;

@WebServlet(urlPatterns = { "*.do" }, loadOnStartup = 1)
public class BankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(BankAccountController.class);

	private BankAccountService bankService;

	public BankAccountController() {
		bankService = new BankAccountServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String path = request.getServletPath();

		if (path.equals("/display_all.do")) {

			List<BankAccount> bankAccounts = bankService.findAllBankAccount();
			RequestDispatcher dispatcher = request.getRequestDispatcher("display_all.jsp");
			request.setAttribute("accounts", bankAccounts);
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String path = request.getServletPath();
		System.out.println(path);

		if (path.equals("/new_account.do")) {
			String accountHolderName = request.getParameter("accountHolderName");
			String accountType = request.getParameter("accountType");
			double accountBalance = Double.parseDouble(request.getParameter("accountBalance"));

			BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);
			if (bankService.addNewBankAccount(account)) {
				out.println("<h2>Bank Account is created successfully</h2>");
				out.close();
			}

		}

		if (path.equals("/delete_account.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));

			try {
				if (bankService.deleteBankAccount(accountNumber)) {
					out.println("<h2>Bank Account is deleted successfully</h2>");
					out.close();
				}
			} catch (BankAccountNotFoundException e) {
				out.println("<h2>Account does not exist</h2>");
				out.close();
				logger.error("Exception", e);
			}

		}

		if (path.equals("/fund_transfer.do")) {
			long fromAccount = Long.parseLong(request.getParameter("fromAccount"));
			long toAccount = Long.parseLong(request.getParameter("toAccount"));
			double amount = Double.parseDouble(request.getParameter("amount"));

			try {
				double balance = bankService.fundTransfer(fromAccount, toAccount, amount);

				out.println("<h2>Fund is trasfered successfully</h2>");
				out.close();

			} catch (LowBalanceException e) {
				out.println("<h2>Account Does not have sufficient fund</h2>");
				out.close();
				logger.error("Exception", e);

			} catch (BankAccountNotFoundException e) {
				out.println("<h2>Account does not exist</h2>");
				out.close();

				logger.error("Exception", e);

			} catch (SQLException e) {
				logger.error("Exception", e);

			} catch (Exception e) {
				logger.error("Exception", e);
			}

		}

		if (path.equals("/withdraw.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
			double amount = Double.parseDouble(request.getParameter("amount"));

			try {
				double balance = bankService.withdraw(accountNumber, amount);
				out.println("<h2>Bank Account is deleted successfully</h2>");
				out.close();
			} catch (LowBalanceException e) {
				out.println("<h2>Account Does not have sufficient fund</h2>");
				out.close();
				logger.error("Exception", e);
			} catch (SQLException e) {
				logger.error("Exception", e);
			} catch (BankAccountNotFoundException e) {
				out.println("Account does not exist");
				out.close();

				logger.error("Exception", e);
			}

		}

		if (path.equals("/deposit.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
			double amount = Double.parseDouble(request.getParameter("amount"));

			try {
				double balance = bankService.deposit(accountNumber, amount);
				out.println("<h2>Amount is deposited successfully</h2>");
				out.close();
			} catch (BankAccountNotFoundException e) {
				out.println("<h2>Account does not exist</h2>");
				out.close();
				logger.error("Exception", e);
			} catch (SQLException e) {
				logger.error("Exception", e);
			}

		}

		if (path.equals("/check_balance.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));

			try {
				double balance = bankService.checkBalance(accountNumber);
				out.println("<h2>Your acount balance is </h2>" + balance);
				out.close();
			} catch (BankAccountNotFoundException e) {
				out.println("<h2>Account does not exist</h2>");
				out.close();
				logger.error("Exception", e);
			}

		}

		if (path.equals("/search.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));

			List<BankAccount> bankAccounts;
			try {
				bankAccounts = bankService.searchBankAccount(accountNumber);
				BankAccount account = bankAccounts.get(0);
				RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
				request.setAttribute("account", account);
				dispatcher.forward(request, response);

			}

			catch (BankAccountNotFoundException e) {
				out.println("<h2>Account does not exist</h2>");
				out.close();
				logger.error("Exception", e);
			}

		}
		
		
		if (path.equals("/update.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));

			List<BankAccount> bankAccounts;
			try {
				bankAccounts = bankService.searchBankAccount(accountNumber);
				BankAccount accounts = bankAccounts.get(0);
				RequestDispatcher dispatcher = request.getRequestDispatcher("update.jsp");
				request.setAttribute("account", accounts);
				dispatcher.forward(request, response);

			}

			catch (BankAccountNotFoundException e) {
				out.println("<h2>Account does not exist</h2>");
				out.close();
				logger.error("Exception", e);
			}

		}
		
		if (path.equals("/update_details.do")) {
			long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
			String accountHolderName = request.getParameter("accountHolderName");
			String accountType = request.getParameter("accountType");
			double accountBalance = Double.parseDouble(request.getParameter("accountBalance"));

		BankAccount account = new BankAccount(accountType,accountHolderName, accountNumber);
	
		
		try {
			if(bankService.updateAccountDetails(accountNumber, accountHolderName, accountType)) 
				response.sendRedirect("display_all.do");
			
			} catch (BankAccountNotFoundException e) {
			logger.error("Exception", e);
		}

	}

	}
}
