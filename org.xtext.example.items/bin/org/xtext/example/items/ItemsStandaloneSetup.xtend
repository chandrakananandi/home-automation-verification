/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.items


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ItemsStandaloneSetup extends ItemsStandaloneSetupGenerated {

	def static void doSetup() {
		new ItemsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
