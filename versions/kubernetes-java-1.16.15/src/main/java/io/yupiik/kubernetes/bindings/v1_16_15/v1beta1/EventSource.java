/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_16_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_15.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EventSource implements Validable<EventSource>, Exportable {
    private String component;
    private String host;

    public EventSource() {
        // no-op
    }

    public EventSource(final String component,
                       final String host) {
        this.component = component;
        this.host = host;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(final String component) {
        this.component = component;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                component,
                host);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventSource)) {
            return false;
        }
        final EventSource __otherCasted = (EventSource) __other;
        return Objects.equals(component, __otherCasted.component) &&
            Objects.equals(host, __otherCasted.host);
    }

    public EventSource component(final String component) {
        this.component = component;
        return this;
    }

    public EventSource host(final String host) {
        this.host = host;
        return this;
    }

    @Override
    public EventSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (component != null ? "\"component\":\"" +  JsonStrings.escapeJson(component) + "\"" : ""),
                    (host != null ? "\"host\":\"" +  JsonStrings.escapeJson(host) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
