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
package org.apache.tinkerpop.gremlin.structure.io.kryoshim.shaded;

import org.apache.tinkerpop.gremlin.structure.io.kryoshim.OutputShim;
import org.apache.tinkerpop.shaded.kryo.io.Output;

public class ShadedOutputAdapter implements OutputShim {

    private final Output shadedOutput;

    public ShadedOutputAdapter(Output shadedOutput) {
        this.shadedOutput = shadedOutput;
    }

    @Override
    public void writeByte(byte b)
    {
        shadedOutput.writeByte(b);
    }

    @Override
    public void writeBytes(byte[] array, int offset, int count) {
        shadedOutput.writeBytes(array, offset, count);
    }

    @Override
    public void writeString(String s) {
        shadedOutput.writeString(s);
    }

    @Override
    public void writeLong(long l) {
        shadedOutput.writeLong(l);
    }

    @Override
    public void writeInt(int i) {
        shadedOutput.writeInt(i);
    }

    @Override
    public void writeDouble(double d) {
        shadedOutput.writeDouble(d);
    }

    Output getShadedOutput()
    {
        return shadedOutput;
    }
}
