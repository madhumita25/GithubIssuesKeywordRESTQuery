package com.peritus.github.rest;  

import java.net.URL;

import java.util.ArrayList;

import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

/**
 * Keyword-based REST Service for lookup 
 * @author bharde
 */

@Path("/KeywordURLService") 

public class KeywordURLService  {  
	
	@GET
	@Path("{keyword}") 
	@Produces(MediaType.TEXT_XML)
	/**
	 * Query keyword lookup 
	 * @param keyword : input keyword
	 * @return ArrayList with issue URLs
	 */
    public Issues queryKW(@PathParam("keyword") String keyword) {
	    Issues w = new Issues();
	    w.Issue = (ArrayList<URL>) QueryKeywordURL.queryKeywordUrl(keyword.toLowerCase());
	    return w;
	}
}
