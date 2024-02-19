package com.rest.Service;
import com.rest.Entity.BankEntity;
import com.rest.Entity.Transfer;
public interface BankService {
	public BankEntity saveBank(BankEntity bankEntity);
	  public BankEntity balance(long accno);
	  public BankEntity deposit(long accno,double money);
	  public BankEntity withdraw(long accno,double amt);
	  public BankEntity transfer(long accno,Transfer tuser,double amt);
	}
