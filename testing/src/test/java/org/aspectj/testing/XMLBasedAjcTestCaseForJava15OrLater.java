/* *******************************************************************
 * Copyright (c) 2021 Contributors
 * All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************/
package org.aspectj.testing;

import org.aspectj.util.LangUtil;

/**
 * Makes sure tests are running on the right level of JDK.
 *
 * @author Alexander Kriegisch
 */
public abstract class XMLBasedAjcTestCaseForJava15OrLater extends XMLBasedAjcTestCase {

	@Override
	public void setUp() throws Exception {
		if (!LangUtil.is15VMOrGreater())
			throw new IllegalStateException("These tests should be run on Java 15 or later");
		super.setUp();
	}

}
