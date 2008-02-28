/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.equinox.internal.security.tests.storage;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Uses whatever default module is provided for the current installation.
 */
public class DefaultPreferencesTest extends SecurePreferencesTest {

	protected String getModuleID() {
		return null;
	}

	public static Test suite() {
		return new TestSuite(DefaultPreferencesTest.class);
	}
}
