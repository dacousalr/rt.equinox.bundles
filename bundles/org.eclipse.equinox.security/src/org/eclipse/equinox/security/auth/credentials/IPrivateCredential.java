/*******************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.equinox.security.auth.credentials;

import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Subject;

/**
 * This interface describes private credentials added by the Equinox login modules.
 * <p>
 * This interface should not be extended by clients.
 * </p>
 * @see Subject#getPrivateCredentials()
 */
public interface IPrivateCredential {

	/**
	 * Returns private key stored in this credential
	 * @return private key
	 */
	public PBEKeySpec getPrivateKey();

	/**
	 * ID of the provider of this private credential. 
	 * @return provider ID 
	 */
	public String getProviderID();

	/**
	 * Clears private key from memory.
	 */
	public void clear();

}