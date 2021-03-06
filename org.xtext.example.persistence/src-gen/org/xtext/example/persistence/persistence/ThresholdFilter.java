/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.persistence.persistence;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.persistence.persistence.ThresholdFilter#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.persistence.persistence.ThresholdFilter#isPercent <em>Percent</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.persistence.persistence.PersistencePackage#getThresholdFilter()
 * @model
 * @generated
 */
public interface ThresholdFilter extends FilterDetails
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigDecimal)
   * @see org.xtext.example.persistence.persistence.PersistencePackage#getThresholdFilter_Value()
   * @model
   * @generated
   */
  BigDecimal getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.persistence.persistence.ThresholdFilter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Percent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percent</em>' attribute.
   * @see #setPercent(boolean)
   * @see org.xtext.example.persistence.persistence.PersistencePackage#getThresholdFilter_Percent()
   * @model
   * @generated
   */
  boolean isPercent();

  /**
   * Sets the value of the '{@link org.xtext.example.persistence.persistence.ThresholdFilter#isPercent <em>Percent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percent</em>' attribute.
   * @see #isPercent()
   * @generated
   */
  void setPercent(boolean value);

} // ThresholdFilter
