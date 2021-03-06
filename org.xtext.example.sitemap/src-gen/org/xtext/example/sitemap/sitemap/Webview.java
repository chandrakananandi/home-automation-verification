/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.sitemap.sitemap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sitemap.sitemap.Webview#getHeight <em>Height</em>}</li>
 *   <li>{@link org.xtext.example.sitemap.sitemap.Webview#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sitemap.sitemap.SitemapPackage#getWebview()
 * @model
 * @generated
 */
public interface Webview extends NonLinkableWidget
{
  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see org.xtext.example.sitemap.sitemap.SitemapPackage#getWebview_Height()
   * @model
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link org.xtext.example.sitemap.sitemap.Webview#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.xtext.example.sitemap.sitemap.SitemapPackage#getWebview_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.xtext.example.sitemap.sitemap.Webview#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // Webview
