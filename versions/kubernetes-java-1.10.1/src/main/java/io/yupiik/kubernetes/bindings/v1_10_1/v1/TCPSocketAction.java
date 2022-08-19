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
package io.yupiik.kubernetes.bindings.v1_10_1.v1;

import io.yupiik.kubernetes.bindings.v1_10_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_1.Validable;
import io.yupiik.kubernetes.bindings.v1_10_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TCPSocketAction implements Validable<TCPSocketAction>, Exportable {
    private String host;
    private String port;

    public TCPSocketAction() {
        // no-op
    }

    public TCPSocketAction(final String host,
                           final String port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TCPSocketAction)) {
            return false;
        }
        final TCPSocketAction __otherCasted = (TCPSocketAction) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }

    public TCPSocketAction host(final String host) {
        this.host = host;
        return this;
    }

    public TCPSocketAction port(final String port) {
        this.port = port;
        return this;
    }

    @Override
    public TCPSocketAction validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (port == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "port", "port",
                "Missing 'port' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (host != null ? "\"host\":\"" +  JsonStrings.escapeJson(host) + "\"" : ""),
                    (port != null ? "\"port\":\"" +  JsonStrings.escapeJson(port) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
