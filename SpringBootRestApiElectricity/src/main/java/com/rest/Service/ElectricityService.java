package com.rest.Service;
import java.util.List;
import com.rest.Model.Electricity;
public interface ElectricityService 
{
	public Electricity saveRecord(Electricity electricity);
	public Electricity updateRecord(Electricity electricity, int cid);
	public void deleteRecord(int cid);
	public Electricity getOneRecord(int cid);
	public List<Electricity> getAllRecord();
}
