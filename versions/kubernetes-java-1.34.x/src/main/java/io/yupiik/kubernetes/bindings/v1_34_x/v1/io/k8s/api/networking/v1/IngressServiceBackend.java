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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.IngressServiceBackend implements Validable<io.k8s.api.networking.v1.IngressServiceBackend>, Exportable {
    private String name;
    private ServiceBackendPort port;

    public io.k8s.api.networking.v1.IngressServiceBackend() {
        // no-op
    }

    public io.k8s.api.networking.v1.IngressServiceBackend(final String name,
                                                          final ServiceBackendPort port) {
        this.name = name;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ServiceBackendPort getPort() {
        return port;
    }

    public void setPort(final ServiceBackendPort port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.IngressServiceBackend)) {
            return false;
        }
        final io.k8s.api.networking.v1.IngressServiceBackend __otherCasted = (io.k8s.api.networking.v1.IngressServiceBackend) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port);
    }

    public io.k8s.api.networking.v1.IngressServiceBackend name(final String name) {
        this.name = name;
        return this;
    }

    public io.k8s.api.networking.v1.IngressServiceBackend port(final ServiceBackendPort port) {
        this.port = port;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.IngressServiceBackend validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (port != null ? "\"port\":" + port.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
