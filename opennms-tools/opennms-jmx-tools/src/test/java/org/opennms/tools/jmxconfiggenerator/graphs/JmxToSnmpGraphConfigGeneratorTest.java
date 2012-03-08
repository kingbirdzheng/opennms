/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2007-2011 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2011 The OpenNMS Group, Inc.
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

package org.opennms.tools.jmxconfiggenerator.graphs;

import java.util.Collection;
import org.junit.*;

/**
 * @author Simon Walter <simon.walter@hp-factory.de>
 * @author Markus Neumann <markus@opennms.com>
 */

public class JmxToSnmpGraphConfigGeneratorTest {

    private JmxToSnmpGraphConfigGenerator jmxToSnmpGraphConfigGen;

    public JmxToSnmpGraphConfigGeneratorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        jmxToSnmpGraphConfigGen = new JmxToSnmpGraphConfigGenerator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testVelociteyRun() {
        Collection<Report> reports = jmxToSnmpGraphConfigGen.generateReportsByJmxDatacollectionConfig("src/test/resources/jmx-datacollection-config.xml");
        System.out.println("reports:\n" + reports);
        String snmpGraphConfig = jmxToSnmpGraphConfigGen.generateSnmpGraph(reports, "src/main/resources/graphTemplate.vm");
        System.out.println(snmpGraphConfig);
    }
}