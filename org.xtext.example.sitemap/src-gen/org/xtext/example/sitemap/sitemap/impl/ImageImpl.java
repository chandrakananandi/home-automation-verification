/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.sitemap.sitemap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.sitemap.sitemap.ColorArray;
import org.xtext.example.sitemap.sitemap.Image;
import org.xtext.example.sitemap.sitemap.SitemapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sitemap.sitemap.impl.ImageImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.example.sitemap.sitemap.impl.ImageImpl#getRefresh <em>Refresh</em>}</li>
 *   <li>{@link org.xtext.example.sitemap.sitemap.impl.ImageImpl#getIconColor <em>Icon Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends LinkableWidgetImpl implements Image
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getRefresh() <em>Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefresh()
   * @generated
   * @ordered
   */
  protected static final int REFRESH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRefresh() <em>Refresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefresh()
   * @generated
   * @ordered
   */
  protected int refresh = REFRESH_EDEFAULT;

  /**
   * The cached value of the '{@link #getIconColor() <em>Icon Color</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconColor()
   * @generated
   * @ordered
   */
  protected EList<ColorArray> iconColor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SitemapPackage.Literals.IMAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SitemapPackage.IMAGE__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRefresh()
  {
    return refresh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefresh(int newRefresh)
  {
    int oldRefresh = refresh;
    refresh = newRefresh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SitemapPackage.IMAGE__REFRESH, oldRefresh, refresh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColorArray> getIconColor()
  {
    if (iconColor == null)
    {
      iconColor = new EObjectContainmentEList<ColorArray>(ColorArray.class, this, SitemapPackage.IMAGE__ICON_COLOR);
    }
    return iconColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SitemapPackage.IMAGE__ICON_COLOR:
        return ((InternalEList<?>)getIconColor()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SitemapPackage.IMAGE__URL:
        return getUrl();
      case SitemapPackage.IMAGE__REFRESH:
        return getRefresh();
      case SitemapPackage.IMAGE__ICON_COLOR:
        return getIconColor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SitemapPackage.IMAGE__URL:
        setUrl((String)newValue);
        return;
      case SitemapPackage.IMAGE__REFRESH:
        setRefresh((Integer)newValue);
        return;
      case SitemapPackage.IMAGE__ICON_COLOR:
        getIconColor().clear();
        getIconColor().addAll((Collection<? extends ColorArray>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SitemapPackage.IMAGE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case SitemapPackage.IMAGE__REFRESH:
        setRefresh(REFRESH_EDEFAULT);
        return;
      case SitemapPackage.IMAGE__ICON_COLOR:
        getIconColor().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SitemapPackage.IMAGE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case SitemapPackage.IMAGE__REFRESH:
        return refresh != REFRESH_EDEFAULT;
      case SitemapPackage.IMAGE__ICON_COLOR:
        return iconColor != null && !iconColor.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (url: ");
    result.append(url);
    result.append(", refresh: ");
    result.append(refresh);
    result.append(')');
    return result.toString();
  }

} //ImageImpl
