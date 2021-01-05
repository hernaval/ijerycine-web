package com.github.yjj.dto;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("data")
public class DiffusionList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<DiffusionDto> diffusions;
	
	public DiffusionList() {
		
	}

	public List<DiffusionDto> getDiffusions() {
		return diffusions;
	}

	public void setDiffusions(List<DiffusionDto> diffusions) {
		this.diffusions = diffusions;
	}

	
	
	
}
