package fr.pe.jvi.cdi.rest;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


/**
 * 
 * @author julien
 *
 */
@Path("validator")
@Stateless
public class RessourceREST
{
	
	@POST
	@Path("test")
	public String getValeurParametreExterne(@Valid final MonPojo p_pojo)
	{
		return "OK";
	}
}
