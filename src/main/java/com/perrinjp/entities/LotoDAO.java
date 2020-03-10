package com.perrinjp.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LotoDAO {
	
	private Integer drawNumber;
	private Long bowlOne;
	private Long bowlTwo;
	private Long bowlThree;
	private Long bowlFour;
	private Long bowlFive;
	private Long bowlSix;
	private Long bowlSeven;

	/**
	 * @return the drawNumber
	 */
	public Integer getDrawNumber() {
		return drawNumber;
	}
	/**
	 * @param drawNumber the drawNumber to set
	 */
	public void setDrawNumber(Integer drawNumber) {
		this.drawNumber = drawNumber;
	}
	/**
	 * @return the bowlOne
	 */
	public Long getBowlOne() {
		return bowlOne;
	}
	/**
	 * @param bowlOne the bowlOne to set
	 */
	public void setBowlOne(Long bowlOne) {
		this.bowlOne = bowlOne;
	}
	/**
	 * @return the bowlTwo
	 */
	public Long getBowlTwo() {
		return bowlTwo;
	}
	/**
	 * @param bowlTwo the bowlTwo to set
	 */
	public void setBowlTwo(Long bowlTwo) {
		this.bowlTwo = bowlTwo;
	}
	/**
	 * @return the bowlThree
	 */
	public Long getBowlThree() {
		return bowlThree;
	}
	/**
	 * @param bowlThree the bowlThree to set
	 */
	public void setBowlThree(Long bowlThree) {
		this.bowlThree = bowlThree;
	}
	/**
	 * @return the bowlFour
	 */
	public Long getBowlFour() {
		return bowlFour;
	}
	/**
	 * @param bowlFour the bowlFour to set
	 */
	public void setBowlFour(Long bowlFour) {
		this.bowlFour = bowlFour;
	}
	/**
	 * @return the bowlFive
	 */
	public Long getBowlFive() {
		return bowlFive;
	}
	/**
	 * @param bowlFive the bowlFive to set
	 */
	public void setBowlFive(Long bowlFive) {
		this.bowlFive = bowlFive;
	}
	/**
	 * @return the bowlSix
	 */
	public Long getBowlSix() {
		return bowlSix;
	}
	/**
	 * @param bowlSix the bowlSix to set
	 */
	public void setBowlSix(Long bowlSix) {
		this.bowlSix = bowlSix;
	}
	/**
	 * @return the bowlSeven
	 */
	public Long getBowlSeven() {
		return bowlSeven;
	}
	/**
	 * @param bowlSeven the bowlSeven to set
	 */
	public void setBowlSeven(Long bowlSeven) {
		this.bowlSeven = bowlSeven;
	}

}
