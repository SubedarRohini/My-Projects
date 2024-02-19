package com.rest.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.Entity.BankEntity;
import com.rest.Entity.Transfer;
import com.rest.Repo.BankRepo;
@Service
public class BankServiceImp implements BankService 
{
	 @Autowired
	  private BankRepo repo;
	  @Override
	  public BankEntity saveBank(BankEntity bankEntity) 
	  { 
		  BankEntity save=repo.save(bankEntity); 
	    return save;
	  }
	  @Override
	  public BankEntity balance(long accno) {
	    
		  BankEntity b=repo.findById(accno).get();
	    return b;
	  }
	  @Override
	  public BankEntity deposit(long accno,double amount) 
	  {	    
		  BankEntity r=repo.findById(accno).get();
	    double amt=r.getAmount()+amount;
	    r.setAmount(amt);
	    BankEntity save=repo.save(r);    
	    return r;
	  }
	  @Override
	  public BankEntity withdraw(long accno, double amt)
	  {
		  BankEntity w=repo.findById(accno).get();
	    double amtount=w.getAmount()-amt;
	    w.setAmount(amtount);  
	     repo.save(w);
	    return w;
	  }
	  @Override
	  public BankEntity transfer(long accno, Transfer tuser,double amt)
	  {
		  BankEntity me=repo.findById(accno).get();
		  BankEntity target=repo.findById(tuser.getTaccno()).get();	    
	    double bal=me.getAmount()-amt;
	    me.setAmount(bal);	    
	    double balance=target.getAmount()+amt;
	    target.setAmount(balance);	     
	    repo.save(me);
	    repo.save(target);
	    return me;
	  }
}