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
package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import io.yupiik.kubernetes.bindings.v1_24_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GRPCAction implements Validable<GRPCAction>, Exportable {
    private int port;
    private String service;

    public GRPCAction() {
        // no-op
    }

    public GRPCAction(final int port,
                      final String service) {
        this.port = port;
        this.service = service;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                port,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GRPCAction)) {
            return false;
        }
        final GRPCAction __otherCasted = (GRPCAction) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }

    public GRPCAction port(final int port) {
        this.port = port;
        return this;
    }

    public GRPCAction service(final String service) {
        this.service = service;
        return this;
    }

    @Override
    public GRPCAction validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"port\":" + port,
                    (service != null ? "\"service\":\"" +  JsonStrings.escapeJson(service) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
