package com.phanit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.phanit.request.SearchRequest;
import com.phanit.request.SearchResponse;

public interface IReportService {
	
	public List<String> getUniquePlanNames();
	
	public List<String> getUniquePlanStatuses();
	
	public List<SearchResponse> search(SearchRequest request);
	
	public void generateExcel(HttpServletResponse response) throws Exception;
	
	public void generatePdf(HttpServletResponse response) throws Exception;
}
