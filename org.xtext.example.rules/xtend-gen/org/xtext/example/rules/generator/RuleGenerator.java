package org.xtext.example.rules.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.xtext.example.rules.rules.Rule;
import org.xtext.example.rules.rules.RuleModel;

/**
 * @author cnandi
 */
@SuppressWarnings("all")
public class RuleGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    int _size = _contents.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      EList<EObject> _contents_1 = resource.getContents();
      EObject _get = _contents_1.get(0);
      final RuleModel model = ((RuleModel) _get);
      CharSequence _gen = this.gen(model);
      fsa.generateFile("ast.txt", _gen);
    }
  }
  
  public CharSequence gen(final RuleModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Model:");
    _builder.newLine();
    {
      EList<Rule> _rules = m.getRules();
      for(final Rule g : _rules) {
        CharSequence _gen = this.gen(g);
        _builder.append(_gen, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence gen(final Rule g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Rule: ");
    String _name = g.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
