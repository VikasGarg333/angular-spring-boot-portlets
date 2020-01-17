package com.wordpress.kkaravitis.modules.authors;

import com.wordpress.kkaravitis.modules.books.catalog.AbstractAngularPortlet;
import com.wordpress.kkaravitis.modules.books.catalog.AngularPortletConfig;
import com.wordpress.kkaravitis.modules.books.catalog.exception.ApplicationException;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Konstantinos Karavitis
 **/
public class AuthorsCatalogPortlet extends AbstractAngularPortlet {
    @Override
    protected AngularPortletConfig createAngularPortletConfiguration(String apiUrl, RenderRequest request, RenderResponse response) throws ApplicationException {
        return new AngularPortletConfig(apiUrl, getResourceBundle(request.getLocale()));
    }
}
