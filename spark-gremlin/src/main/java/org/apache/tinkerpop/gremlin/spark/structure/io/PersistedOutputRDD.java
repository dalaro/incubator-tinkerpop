/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.tinkerpop.gremlin.spark.structure.io;

import org.apache.commons.configuration.Configuration;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.tinkerpop.gremlin.hadoop.Constants;
import org.apache.tinkerpop.gremlin.hadoop.structure.io.VertexWritable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public final class PersistedOutputRDD implements OutputRDD {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersistedOutputRDD.class);

    @Override
    public void writeGraphRDD(final Configuration configuration, final JavaPairRDD<Object, VertexWritable> graphRDD) {
        if (!configuration.getBoolean(Constants.GREMLIN_SPARK_PERSIST_CONTEXT, false))
            LOGGER.warn("The SparkContext should be persisted in order for the RDD to persist across jobs. To do so, set " + Constants.GREMLIN_SPARK_PERSIST_CONTEXT + " to true");
    }
}
