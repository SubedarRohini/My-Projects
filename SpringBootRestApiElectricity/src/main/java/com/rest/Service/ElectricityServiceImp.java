package com.rest.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.Model.Electricity;
import com.rest.repo.ElectricityRepo;
@Service
public class ElectricityServiceImp implements ElectricityService
{
	@Autowired
	private ElectricityRepo electricityRepo;
	@Override
	public Electricity saveRecord(Electricity electricity) 
	{
		int units=0;
		double total=0.0;
		units=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		electricity.setUnits(units); 
		  if(units<300) 
		  { 
		   total=units*1.75; 
		  } 
		  else if(units>=300 && units<500) 
		  { 
		   total=units*3.75; 
		  } 
		  else if(units>=500) 
		  { 
		   total=units*7.35; 
		  } 
		  electricity.setTotalBill(total); 
		  Electricity e=electricityRepo.save(electricity); 
		  return e; 
	} 
	 @Override 
	 public Electricity getOneRecord(int cid) { 
	  Electricity get=electricityRepo.findById(cid).get(); 
	  return get; 
	 } 
	 @Override 
	 public List<Electricity> getAllRecord() { 
	  List<Electricity> getAll=electricityRepo.findAll(); 
	  return getAll; 
	 } 
	  
	 @Override 
	 public void deleteRecord(int cid) { 
	  electricityRepo.deleteById(cid); 
	 }  
	@Override
	public Electricity updateRecord(Electricity electricity, int cid) 
	{
		Electricity oldRecord=electricityRepo.findById(cid).get();
		oldRecord.setCname(electricity.getCname());
		oldRecord.setCurrent_reading(electricity.getCurrent_reading());
		oldRecord.setPrevious_reading(electricity.getPrevious_reading());
		int units=0;
		double total=0.0;
		units=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		electricity.setUnits(units); 
		  if(units<300) 
		  { 
		   total=units*1.75; 
		  } 
		  else if(units>=300 && units<500) 
		  { 
		   total=units*3.75; 
		  } 
		  else if(units>=500) 
		  { 
		   total=units*7.35; 
		  } 
		  oldRecord.setUnits(units);
		  oldRecord.setTotalBill(total);
		  Electricity e=electricityRepo.save(oldRecord); 
		  return e; 
	}
}
