/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.persistence.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPersistenceValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.persistence.persistence.PersistencePackage.eINSTANCE);
		return result;
	}
	
}
