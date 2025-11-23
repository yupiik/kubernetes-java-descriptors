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
package io.yupiik.kubernetes.bindings.v1_30_0.v1;

import io.yupiik.kubernetes.bindings.v1_30_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SessionAffinityConfig implements Validable<SessionAffinityConfig>, Exportable {
    private ClientIPConfig clientIP;

    public SessionAffinityConfig() {
        // no-op
    }

    public SessionAffinityConfig(final ClientIPConfig clientIP) {
        this.clientIP = clientIP;
    }

    public ClientIPConfig getClientIP() {
        return clientIP;
    }

    public void setClientIP(final ClientIPConfig clientIP) {
        this.clientIP = clientIP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientIP);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SessionAffinityConfig)) {
            return false;
        }
        final SessionAffinityConfig __otherCasted = (SessionAffinityConfig) __other;
        return Objects.equals(clientIP, __otherCasted.clientIP);
    }

    public SessionAffinityConfig clientIP(final ClientIPConfig clientIP) {
        this.clientIP = clientIP;
        return this;
    }

    @Override
    public SessionAffinityConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (clientIP != null ? "\"clientIP\":" + clientIP.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
