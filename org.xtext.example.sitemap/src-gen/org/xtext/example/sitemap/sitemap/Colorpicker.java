/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.sitemap.sitemap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colorpicker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sitemap.sitemap.Colorpicker#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sitemap.sitemap.SitemapPackage#getColorpicker()
 * @model
 * @generated
 */
public interface Colorpicker extends NonLinkableWidget
{
  /**
   * Returns the value of the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frequency</em>' attribute.
   * @see #setFrequency(int)
   * @see org.xtext.example.sitemap.sitemap.SitemapPackage#getColorpicker_Frequency()
   * @model
   * @generated
   */
  int getFrequency();

  /**
   * Sets the value of the '{@link org.xtext.example.sitemap.sitemap.Colorpicker#getFrequency <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frequency</em>' attribute.
   * @see #getFrequency()
   * @generated
   */
  void setFrequency(int value);

} // Colorpicker
