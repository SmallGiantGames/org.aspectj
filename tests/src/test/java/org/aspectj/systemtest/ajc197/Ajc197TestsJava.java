/*******************************************************************************
 * Copyright (c) 2021 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.aspectj.systemtest.ajc197;

import junit.framework.Test;
import org.aspectj.apache.bcel.Constants;
import org.aspectj.testing.XMLBasedAjcTestCase;
import org.aspectj.testing.XMLBasedAjcTestCaseForJava16OrLater;

/**
 * @author Alexander Kriegisch
 */
public class Ajc197TestsJava extends XMLBasedAjcTestCaseForJava16OrLater {

  public void testHiddenClass() {
    runTest("hidden class");
    checkVersion("HiddenClassDemo", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public void testTextBlock1() {
    runTest("textblock 1");
    checkVersion("Code", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public void testTextBlock2() {
    runTest("textblock 2");
    checkVersion("Code2", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public void testRecords() {
    runTest("simple record");
    checkVersion("Person", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public void testRecords2() {
    runTest("using a record");
    checkVersion("UsingPersonRecord", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public void testAdvisingRecords() {
    runTest("advising records");
    checkVersion("TraceRecordComponents", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public void testInstanceofPatterns() {
    runTest("instanceof patterns");
    checkVersion("Jep305", Constants.MAJOR_16, Constants.MINOR_16);
  }

  public static Test suite() {
    return XMLBasedAjcTestCase.loadSuite(Ajc197TestsJava.class);
  }

  @Override
  protected java.net.URL getSpecFile() {
    return getClassResource("ajc197.xml");
  }

}
