/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.persistence.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.persistence.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "persistence";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/persistence/Persistence";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "persistence";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersistencePackage eINSTANCE = org.xtext.example.persistence.persistence.impl.PersistencePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.PersistenceModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.PersistenceModelImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getPersistenceModel()
   * @generated
   */
  int PERSISTENCE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL__STRATEGIES = 0;

  /**
   * The feature id for the '<em><b>Defaults</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL__DEFAULTS = 1;

  /**
   * The feature id for the '<em><b>Filters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL__FILTERS = 2;

  /**
   * The feature id for the '<em><b>Configs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL__CONFIGS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.StrategyImpl <em>Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.StrategyImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getStrategy()
   * @generated
   */
  int STRATEGY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__NAME = 0;

  /**
   * The number of structural features of the '<em>Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.FilterImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getFilter()
   * @generated
   */
  int FILTER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.FilterDetailsImpl <em>Filter Details</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.FilterDetailsImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getFilterDetails()
   * @generated
   */
  int FILTER_DETAILS = 3;

  /**
   * The number of structural features of the '<em>Filter Details</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_DETAILS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.ThresholdFilterImpl <em>Threshold Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.ThresholdFilterImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getThresholdFilter()
   * @generated
   */
  int THRESHOLD_FILTER = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THRESHOLD_FILTER__VALUE = FILTER_DETAILS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THRESHOLD_FILTER__PERCENT = FILTER_DETAILS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Threshold Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THRESHOLD_FILTER_FEATURE_COUNT = FILTER_DETAILS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.TimeFilterImpl <em>Time Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.TimeFilterImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getTimeFilter()
   * @generated
   */
  int TIME_FILTER = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FILTER__VALUE = FILTER_DETAILS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FILTER__UNIT = FILTER_DETAILS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Time Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FILTER_FEATURE_COUNT = FILTER_DETAILS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.PersistenceConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.PersistenceConfigurationImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getPersistenceConfiguration()
   * @generated
   */
  int PERSISTENCE_CONFIGURATION = 6;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_CONFIGURATION__ITEMS = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_CONFIGURATION__ALIAS = 1;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_CONFIGURATION__STRATEGIES = 2;

  /**
   * The feature id for the '<em><b>Filters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_CONFIGURATION__FILTERS = 3;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_CONFIGURATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.AllConfigImpl <em>All Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.AllConfigImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getAllConfig()
   * @generated
   */
  int ALL_CONFIG = 7;

  /**
   * The number of structural features of the '<em>All Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_CONFIG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.ItemConfigImpl <em>Item Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.ItemConfigImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getItemConfig()
   * @generated
   */
  int ITEM_CONFIG = 8;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_CONFIG__ITEM = 0;

  /**
   * The number of structural features of the '<em>Item Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_CONFIG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.GroupConfigImpl <em>Group Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.GroupConfigImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getGroupConfig()
   * @generated
   */
  int GROUP_CONFIG = 9;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_CONFIG__GROUP = 0;

  /**
   * The number of structural features of the '<em>Group Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_CONFIG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.persistence.persistence.impl.CronStrategyImpl <em>Cron Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.persistence.persistence.impl.CronStrategyImpl
   * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getCronStrategy()
   * @generated
   */
  int CRON_STRATEGY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRON_STRATEGY__NAME = STRATEGY__NAME;

  /**
   * The feature id for the '<em><b>Cron Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRON_STRATEGY__CRON_EXPRESSION = STRATEGY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cron Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRON_STRATEGY_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.PersistenceModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceModel
   * @generated
   */
  EClass getPersistenceModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.persistence.persistence.PersistenceModel#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Strategies</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceModel#getStrategies()
   * @see #getPersistenceModel()
   * @generated
   */
  EReference getPersistenceModel_Strategies();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.persistence.persistence.PersistenceModel#getDefaults <em>Defaults</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Defaults</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceModel#getDefaults()
   * @see #getPersistenceModel()
   * @generated
   */
  EReference getPersistenceModel_Defaults();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.persistence.persistence.PersistenceModel#getFilters <em>Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filters</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceModel#getFilters()
   * @see #getPersistenceModel()
   * @generated
   */
  EReference getPersistenceModel_Filters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.persistence.persistence.PersistenceModel#getConfigs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configs</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceModel#getConfigs()
   * @see #getPersistenceModel()
   * @generated
   */
  EReference getPersistenceModel_Configs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy</em>'.
   * @see org.xtext.example.persistence.persistence.Strategy
   * @generated
   */
  EClass getStrategy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.Strategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.persistence.persistence.Strategy#getName()
   * @see #getStrategy()
   * @generated
   */
  EAttribute getStrategy_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see org.xtext.example.persistence.persistence.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.Filter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.persistence.persistence.Filter#getName()
   * @see #getFilter()
   * @generated
   */
  EAttribute getFilter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.persistence.persistence.Filter#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.xtext.example.persistence.persistence.Filter#getDefinition()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_Definition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.FilterDetails <em>Filter Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Details</em>'.
   * @see org.xtext.example.persistence.persistence.FilterDetails
   * @generated
   */
  EClass getFilterDetails();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.ThresholdFilter <em>Threshold Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Threshold Filter</em>'.
   * @see org.xtext.example.persistence.persistence.ThresholdFilter
   * @generated
   */
  EClass getThresholdFilter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.ThresholdFilter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.persistence.persistence.ThresholdFilter#getValue()
   * @see #getThresholdFilter()
   * @generated
   */
  EAttribute getThresholdFilter_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.ThresholdFilter#isPercent <em>Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percent</em>'.
   * @see org.xtext.example.persistence.persistence.ThresholdFilter#isPercent()
   * @see #getThresholdFilter()
   * @generated
   */
  EAttribute getThresholdFilter_Percent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.TimeFilter <em>Time Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Filter</em>'.
   * @see org.xtext.example.persistence.persistence.TimeFilter
   * @generated
   */
  EClass getTimeFilter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.TimeFilter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.persistence.persistence.TimeFilter#getValue()
   * @see #getTimeFilter()
   * @generated
   */
  EAttribute getTimeFilter_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.TimeFilter#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.xtext.example.persistence.persistence.TimeFilter#getUnit()
   * @see #getTimeFilter()
   * @generated
   */
  EAttribute getTimeFilter_Unit();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.PersistenceConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceConfiguration
   * @generated
   */
  EClass getPersistenceConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.persistence.persistence.PersistenceConfiguration#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceConfiguration#getItems()
   * @see #getPersistenceConfiguration()
   * @generated
   */
  EReference getPersistenceConfiguration_Items();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.PersistenceConfiguration#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceConfiguration#getAlias()
   * @see #getPersistenceConfiguration()
   * @generated
   */
  EAttribute getPersistenceConfiguration_Alias();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.persistence.persistence.PersistenceConfiguration#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Strategies</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceConfiguration#getStrategies()
   * @see #getPersistenceConfiguration()
   * @generated
   */
  EReference getPersistenceConfiguration_Strategies();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.persistence.persistence.PersistenceConfiguration#getFilters <em>Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Filters</em>'.
   * @see org.xtext.example.persistence.persistence.PersistenceConfiguration#getFilters()
   * @see #getPersistenceConfiguration()
   * @generated
   */
  EReference getPersistenceConfiguration_Filters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.AllConfig <em>All Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>All Config</em>'.
   * @see org.xtext.example.persistence.persistence.AllConfig
   * @generated
   */
  EClass getAllConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.ItemConfig <em>Item Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Config</em>'.
   * @see org.xtext.example.persistence.persistence.ItemConfig
   * @generated
   */
  EClass getItemConfig();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.ItemConfig#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item</em>'.
   * @see org.xtext.example.persistence.persistence.ItemConfig#getItem()
   * @see #getItemConfig()
   * @generated
   */
  EAttribute getItemConfig_Item();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.GroupConfig <em>Group Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Config</em>'.
   * @see org.xtext.example.persistence.persistence.GroupConfig
   * @generated
   */
  EClass getGroupConfig();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.GroupConfig#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see org.xtext.example.persistence.persistence.GroupConfig#getGroup()
   * @see #getGroupConfig()
   * @generated
   */
  EAttribute getGroupConfig_Group();

  /**
   * Returns the meta object for class '{@link org.xtext.example.persistence.persistence.CronStrategy <em>Cron Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cron Strategy</em>'.
   * @see org.xtext.example.persistence.persistence.CronStrategy
   * @generated
   */
  EClass getCronStrategy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.persistence.persistence.CronStrategy#getCronExpression <em>Cron Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cron Expression</em>'.
   * @see org.xtext.example.persistence.persistence.CronStrategy#getCronExpression()
   * @see #getCronStrategy()
   * @generated
   */
  EAttribute getCronStrategy_CronExpression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PersistenceFactory getPersistenceFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.PersistenceModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.PersistenceModelImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getPersistenceModel()
     * @generated
     */
    EClass PERSISTENCE_MODEL = eINSTANCE.getPersistenceModel();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_MODEL__STRATEGIES = eINSTANCE.getPersistenceModel_Strategies();

    /**
     * The meta object literal for the '<em><b>Defaults</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_MODEL__DEFAULTS = eINSTANCE.getPersistenceModel_Defaults();

    /**
     * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_MODEL__FILTERS = eINSTANCE.getPersistenceModel_Filters();

    /**
     * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_MODEL__CONFIGS = eINSTANCE.getPersistenceModel_Configs();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.StrategyImpl <em>Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.StrategyImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getStrategy()
     * @generated
     */
    EClass STRATEGY = eINSTANCE.getStrategy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRATEGY__NAME = eINSTANCE.getStrategy_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.FilterImpl <em>Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.FilterImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER__NAME = eINSTANCE.getFilter_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER__DEFINITION = eINSTANCE.getFilter_Definition();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.FilterDetailsImpl <em>Filter Details</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.FilterDetailsImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getFilterDetails()
     * @generated
     */
    EClass FILTER_DETAILS = eINSTANCE.getFilterDetails();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.ThresholdFilterImpl <em>Threshold Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.ThresholdFilterImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getThresholdFilter()
     * @generated
     */
    EClass THRESHOLD_FILTER = eINSTANCE.getThresholdFilter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THRESHOLD_FILTER__VALUE = eINSTANCE.getThresholdFilter_Value();

    /**
     * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THRESHOLD_FILTER__PERCENT = eINSTANCE.getThresholdFilter_Percent();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.TimeFilterImpl <em>Time Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.TimeFilterImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getTimeFilter()
     * @generated
     */
    EClass TIME_FILTER = eINSTANCE.getTimeFilter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_FILTER__VALUE = eINSTANCE.getTimeFilter_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_FILTER__UNIT = eINSTANCE.getTimeFilter_Unit();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.PersistenceConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.PersistenceConfigurationImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getPersistenceConfiguration()
     * @generated
     */
    EClass PERSISTENCE_CONFIGURATION = eINSTANCE.getPersistenceConfiguration();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_CONFIGURATION__ITEMS = eINSTANCE.getPersistenceConfiguration_Items();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_CONFIGURATION__ALIAS = eINSTANCE.getPersistenceConfiguration_Alias();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_CONFIGURATION__STRATEGIES = eINSTANCE.getPersistenceConfiguration_Strategies();

    /**
     * The meta object literal for the '<em><b>Filters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_CONFIGURATION__FILTERS = eINSTANCE.getPersistenceConfiguration_Filters();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.AllConfigImpl <em>All Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.AllConfigImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getAllConfig()
     * @generated
     */
    EClass ALL_CONFIG = eINSTANCE.getAllConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.ItemConfigImpl <em>Item Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.ItemConfigImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getItemConfig()
     * @generated
     */
    EClass ITEM_CONFIG = eINSTANCE.getItemConfig();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_CONFIG__ITEM = eINSTANCE.getItemConfig_Item();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.GroupConfigImpl <em>Group Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.GroupConfigImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getGroupConfig()
     * @generated
     */
    EClass GROUP_CONFIG = eINSTANCE.getGroupConfig();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_CONFIG__GROUP = eINSTANCE.getGroupConfig_Group();

    /**
     * The meta object literal for the '{@link org.xtext.example.persistence.persistence.impl.CronStrategyImpl <em>Cron Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.persistence.persistence.impl.CronStrategyImpl
     * @see org.xtext.example.persistence.persistence.impl.PersistencePackageImpl#getCronStrategy()
     * @generated
     */
    EClass CRON_STRATEGY = eINSTANCE.getCronStrategy();

    /**
     * The meta object literal for the '<em><b>Cron Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRON_STRATEGY__CRON_EXPRESSION = eINSTANCE.getCronStrategy_CronExpression();

  }

} //PersistencePackage
