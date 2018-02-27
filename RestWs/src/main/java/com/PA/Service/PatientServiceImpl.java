package com.PA.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.NotFoundException;
//import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.PA.Exception.PatientBusinessException;
import com.PA.Model.Patient;

@Service
public class PatientServiceImpl implements PatientService{

	Map<Long, Patient> patients=new HashMap<>();
	long curId=123;

	public PatientServiceImpl() {
		init();//Method Calling
	}

	void init()
	{
		Patient patient=new Patient();
		patient.setId(curId);
		patient.setName("Chandraveer");
		patients.put(patient.getId(), patient);	
	}

	@Override
	public List<Patient> getPatients() {
		Collection<Patient> val = patients.values();
		List<Patient> res=new ArrayList<>(val);
		return res;
	}

	@Override
	public Patient getPatient(Long id) {
		
		if(patients.get(id)==null)
		{
			//throw new WebApplicationException(Response.Status.NOT_FOUND);
			throw new NotFoundException();
		}
		return patients.get(id);
	}

	@Override
	public Response createPatient(Patient p) {
		p.setId(++curId);
		patients.put(p.getId(), p);
		return Response.ok(p).build();//static methods in response class
	}

	@Override
	public Response updatePatient(Patient patient) {
		
		Patient currentpatient=patients.get(patient.getId());
		
		Response response;
		if(currentpatient!=null)
		{
			patients.put(patient.getId(), patient);
			response=Response.ok().build();
		}
		else
		{
			//response=Response.notModified().build();
			throw new PatientBusinessException();
		}
		return response;
	}

	@Override
	public Response deletePatient(Long id) {
		Patient currentPatient=patients.get(id);
		
		Response response;
		if(currentPatient!=null)
		{
			patients.remove(id);
			response=Response.ok().build();
		}
		else
		{
			response=Response.noContent().build();
		}
		return response;
	}


}
