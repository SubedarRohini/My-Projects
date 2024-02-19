package com.rest.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rest.Entity.BankEntity;
import com.rest.Entity.Transfer;
import com.rest.Service.BankService;
@RestController
public class BankController
{
	  @Autowired
	  private BankService service;
	  
	  @PostMapping("/save")
	  public BankEntity saveAccount(@RequestBody BankEntity bankEntity)
	  {	    
		  BankEntity b1=service.saveBank(bankEntity);	    
	    return b1;
	  }	  
	  @GetMapping("/balance/{accno}")
	  public BankEntity balance(@PathVariable long accno) 
	  {	    
		  BankEntity res=service.balance(accno);
	    return res;	  
	  }	  
	  @GetMapping("/deposit/{accno}/{amount}")
	  public BankEntity deposit(@PathVariable long accno,@PathVariable double amount) 
	  {    
		  BankEntity dep=service.deposit(accno, amount);
	    return dep;
	  }	  
	  @GetMapping("/withdraw/{accno}/{amount}")
	  public BankEntity withdraw(@PathVariable long accno,@PathVariable double amount) 
	  {	    
		  BankEntity dep=service.withdraw(accno, amount);
	    return dep;
	  }	  
	  @GetMapping("/transfer/{accno}/{taccno}/{amount}")
	  public BankEntity transferAmount(@PathVariable long accno,@PathVariable long taccno,@PathVariable double amount,Transfer tuser) {
		  BankEntity transfer=service.transfer(accno,tuser, amount);
	    return transfer;
	  }
}

