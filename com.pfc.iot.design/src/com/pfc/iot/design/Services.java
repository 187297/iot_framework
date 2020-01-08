package com.pfc.iot.design;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.pfc.iot.IterativeLoop;
import com.pfc.iot.gen.main.Generate;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public void run(EObject self, String path, String targetFolder) {
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
    
    public String generateUUID(EObject self) {
    	return self.eClass().getName().concat(EcoreUtil.generateUUID().replaceAll("-", "_"));
    }
}
