package fr.pe.jvi.cdi.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rs")
public class ApplicationConfig extends Application
{
	@Override
	public Set<Class<?>> getClasses()
	{
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(RessourceREST.class);
		return classes;
	}

}
