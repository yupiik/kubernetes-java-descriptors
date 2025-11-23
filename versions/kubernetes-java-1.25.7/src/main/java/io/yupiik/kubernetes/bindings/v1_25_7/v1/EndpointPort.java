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
package io.yupiik.kubernetes.bindings.v1_25_7.v1;

import io.yupiik.kubernetes.bindings.v1_25_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_25_7.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointPort implements Validable<EndpointPort>, Exportable {
    private String appProtocol;
    private String name;
    private Integer port;
    private String protocol;

    public EndpointPort() {
        // no-op
    }

    public EndpointPort(final String appProtocol,
                        final String name,
                        final Integer port,
                        final String protocol) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.port = port;
        this.protocol = protocol;
    }

    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(final Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                appProtocol,
                name,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointPort)) {
            return false;
        }
        final EndpointPort __otherCasted = (EndpointPort) __other;
        return Objects.equals(appProtocol, __otherCasted.appProtocol) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public EndpointPort appProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
        return this;
    }

    public EndpointPort name(final String name) {
        this.name = name;
        return this;
    }

    public EndpointPort port(final Integer port) {
        this.port = port;
        return this;
    }

    public EndpointPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public EndpointPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (appProtocol != null ? "\"appProtocol\":\"" +  JsonStrings.escapeJson(appProtocol) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (port != null ? "\"port\":" + port : ""),
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
