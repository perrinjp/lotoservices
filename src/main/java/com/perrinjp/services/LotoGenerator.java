package com.perrinjp.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.perrinjp.entities.LotoDAO;


public class LotoGenerator {
	
	private String drawType;
	private int totalOfDraws;
	private ArrayList<LotoDAO> results;

	public static LotoGenerator getInstance() 
	{
		return new LotoGenerator();
	}

	public LotoGenerator calculerLoto(String aDrawType, int tirage) 
	{
		LotoDAO result;
		totalOfDraws = tirage;
		int i;
		int j;
		
		if(aDrawType.equalsIgnoreCase("649"))
		{
			i=6;
		}
		else
		{
			i=7;
		}
		
		drawType = aDrawType;
		results = new ArrayList<LotoDAO>();
		
		for(j=1;j<=tirage;j++)
		{
			result = new LotoDAO();
			
			result.setDrawNumber(j);
			computeDraw(result, i);
			results.add(result);
		}	
		return this;
	}

	private void computeDraw(LotoDAO result, int loopCount) 
	{
		HashMap<Long,Long> bowls;

		boolean loop;
		Random randomGenerator;
		Long draw;
		Integer i;
		
		loop = true;
		i = 1;
		bowls = new HashMap<Long, Long>();
		randomGenerator = new Random();
		
		while(loop)
		{
			draw = new Long(randomGenerator.nextInt(49));
			if(!bowls.containsValue(draw) && draw != 0)
			{
				bowls.put(i.longValue(),draw);
				i = i+1;
				if(bowls.size() >= loopCount)
				{
					loop = false;
				}
			}
		}
						
		result.setBowlOne(bowls.get(1L));
		result.setBowlTwo(bowls.get(2L));
		result.setBowlThree(bowls.get(3L));
		result.setBowlFour(bowls.get(4L));
		result.setBowlFive(bowls.get(5L));
		result.setBowlSix(bowls.get(6L));
		result.setBowlSeven(bowls.get(7L));
		
		
	}

	public String getDrawType() {
		return drawType;
	}

	public void setDrawType(String drawType) {
		this.drawType = drawType;
	}

	public int getTotalOfDraws() {
		return totalOfDraws;
	}

	public void setTotalOfDraws(int totalOfDraws) {
		this.totalOfDraws = totalOfDraws;
	}

	public ArrayList<LotoDAO> getResults() {
		return results;
	}
	
}
