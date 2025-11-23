/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_24_11.v1;

import io.yupiik.kubernetes.bindings.v1_24_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_11.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonEndpoint implements Validable<DaemonEndpoint>, Exportable {
    private int Port;

    public DaemonEndpoint() {
        // no-op
    }

    public DaemonEndpoint(final int Port) {
        this.Port = Port;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(final int Port) {
        this.Port = Port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonEndpoint)) {
            return false;
        }
        final DaemonEndpoint __otherCasted = (DaemonEndpoint) __other;
        return Objects.equals(Port, __otherCasted.Port);
    }

    public DaemonEndpoint Port(final int Port) {
        this.Port = Port;
        return this;
    }

    @Override
    public DaemonEndpoint validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"Port\":" + Port)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
