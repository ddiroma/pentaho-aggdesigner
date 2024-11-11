/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/


package org.pentaho.aggdes.output.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.pentaho.aggdes.algorithm.Result;
import org.pentaho.aggdes.model.Parameter;
import org.pentaho.aggdes.model.Schema;
import org.pentaho.aggdes.output.ResultHandler;

/**
 * Stub implementation for <code>ResultHandler</code>. Provides canned answers and some methods are not implemented.
 * 
 * @author mlowery
 */
public class ResultHandlerStub implements ResultHandler {

  public void handle(Map<Parameter, Object> parameterValues, Schema schema, Result result) {

  }

  public String getName() {
    return getClass().getSimpleName();
  }

  public List<Parameter> getParameters() {
    return Collections.emptyList();
  }

}
