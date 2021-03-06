/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2012 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2012 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/
package org.opennms.features.vaadin.dashboard.ui;

import com.vaadin.ui.UI;
import org.ops4j.pax.vaadin.AbstractApplicationFactory;
import org.osgi.service.blueprint.container.BlueprintContainer;

/**
 * A factory class responsible for constructing the wallboard application.
 *
 * @author Christian Pape
 * @author Marcus Hellberg (marcus@vaadin.com)
 */
public class WallboardUIFactory extends AbstractApplicationFactory {
    /**
     * The {@link BlueprintContainer} associated with this object
     */
    private final BlueprintContainer m_blueprintContainer;
    /**
     * The bean name
     */
    private final String m_beanName;

    /**
     * Constructor for instantiating a new factory.
     *
     * @param container the bean container to use
     * @param beanName  the beam name to use
     */
    public WallboardUIFactory(BlueprintContainer container, String beanName) {
        m_blueprintContainer = container;
        m_beanName = beanName;
    }

    /**
     * Returns the application's instance.
     *
     * @return the application instance
     */
    @Override
    public UI getUI() {
        return (UI) m_blueprintContainer.getComponentInstance(m_beanName);
    }

    /**
     * Returns the {@link Class} of the application's instance
     *
     * @return class of the application
     */
    @Override
    public Class<? extends UI> getUIClass() {
        return WallboardUI.class;
    }
}
