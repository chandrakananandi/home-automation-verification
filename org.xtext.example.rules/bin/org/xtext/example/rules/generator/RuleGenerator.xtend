package org.xtext.example.rules.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.rules.rules.Rule
import org.xtext.example.rules.rules.RuleModel
/**
 * 
 * @author cnandi
 * 
 */
class RuleGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.size > 0) {
			val model = resource.contents.get(0) as RuleModel
			fsa.generateFile("ast.txt", model.gen)
		}
	}
	
	def gen(RuleModel m) {
		'''
		Model:
		«FOR g : m.rules»
			«g.gen»
		«ENDFOR»
		'''
	}
	
	def gen(Rule g) {
		'''
		Rule: «g.name»
		'''
	}

	
}