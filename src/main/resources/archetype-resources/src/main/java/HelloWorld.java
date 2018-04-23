#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * HelloWorld.java - Traackr, Inc.
 *
 * This document set is the property of Traackr, Inc., a Massachusetts
 * Corporation, and contains confidential and trade secret information. It
 * cannot be transferred from the custody or control of Traackr except as
 * authorized in writing by an officer of Traackr. Neither this item nor the
 * information it contains can be used, transferred, reproduced, published,
 * or disclosed, in whole or in part, directly or indirectly, except as
 * expressly authorized by an officer of Traackr, pursuant to written
 * agreement.
 *
 * Copyright 2012-2015 Traackr, Inc. All Rights Reserved.
 */

package ${package};

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.start(7000);
    app.get("/", ctx -> ctx.result("Hello World"));
  }
}
