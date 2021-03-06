/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.items.items;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.items.items.ItemsPackage
 * @generated
 */
public interface ItemsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ItemsFactory eINSTANCE = org.xtext.example.items.items.impl.ItemsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Item Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Model</em>'.
   * @generated
   */
  ItemModel createItemModel();

  /**
   * Returns a new object of class '<em>Model Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Item</em>'.
   * @generated
   */
  ModelItem createModelItem();

  /**
   * Returns a new object of class '<em>Model Group Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Group Item</em>'.
   * @generated
   */
  ModelGroupItem createModelGroupItem();

  /**
   * Returns a new object of class '<em>Model Normal Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Normal Item</em>'.
   * @generated
   */
  ModelNormalItem createModelNormalItem();

  /**
   * Returns a new object of class '<em>Model Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Binding</em>'.
   * @generated
   */
  ModelBinding createModelBinding();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ItemsPackage getItemsPackage();

} //ItemsFactory
