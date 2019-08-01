package com.shell.resource;

import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shell.bean.Candidate;

@Path("/candidate-resource")

public class CandidateResource {

	ArrayList<Candidate> candidates=new ArrayList<>();
	public CandidateResource()
	{
	Candidate c1=new Candidate(1,"abc",new int[]{50,50,50},true);
	Candidate c2=new Candidate(2,"abd",new int[]{100,100,100},true);

	Candidate c3=new Candidate(3,"abe",new int[]{90,80,70},false);
	candidates.add(c1);
	candidates.add(c2);

	candidates.add(c3);
	}
	@Path("/candidatenames")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[] getCandidateNames()
	{
		String[] names=new String[candidates.size()];
		for(int i=0;i<candidates.size();i++)
			names[i]=candidates.get(i).getName();
		Arrays.sort(names);
		return names;
		
		
	}
	@Path("/highestmarkscandidate")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Candidate getHighestMarksCandidate()
	{
		int[] marks=new int[candidates.size()]; 
		Candidate m = null;
		int max=0;
		for(int i=0;i<candidates.size();i++)
		{
			marks[i]=candidates.get(i).getMarks()[0]+candidates.get(i).getMarks()[1]+candidates.get(i).getMarks()[2];
			if(marks[i]>max)
			{
				max=marks[i];
				m=candidates.get(i);
			}
		}
			
		return m;
		
	}
	@Path("/candidates")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Candidate> getCandidates()
	{
		return candidates;
	
	}
	@Path("add-candidate")
	@POST
	//@Produces(MediaType.APPLICATION_JSON)

	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<Candidate> addCandidate(Candidate c)
	{
		candidates.add(c);
		return candidates;
		
	}
	
	@Path("/joiningcandidates")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Candidate> joiningCandidates()
	{
		ArrayList<Candidate> res=new ArrayList<Candidate>();
		for(Candidate c:candidates)
			if(c.isJoining())
				res.add(c);
		return res;
		
	}
	
	
	
	

	
	
	
	
}
