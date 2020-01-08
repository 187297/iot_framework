package com.pfc.iot.design;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

import com.pfc.iot.gen.main.Generate;

public class ExternalJavaAction extends AbstractExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		System.out.println("RUnning...");
		String path = (String) parameters.get("path");
		String targetFolder = (String) parameters.get("targetFolder");
		URI modelURI = URI.createFileURI(URI.decode(path));
		File f = new File(targetFolder);
		
		Generate generator;
		try {
			generator = new Generate(modelURI, f, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
