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
package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import io.yupiik.kubernetes.bindings.v1_21_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_3.Validable;
import io.yupiik.kubernetes.bindings.v1_21_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressBackend implements Validable<IngressBackend>, Exportable {
    private TypedLocalObjectReference resource;
    private IngressServiceBackend service;

    public IngressBackend() {
        // no-op
    }

    public IngressBackend(final TypedLocalObjectReference resource,
                          final IngressServiceBackend service) {
        // no-op
    }

    public TypedLocalObjectReference getResource() {
        return resource;
    }

    public void setResource(final TypedLocalObjectReference resource) {
        this.resource = resource;
    }

    public IngressServiceBackend getService() {
        return service;
    }

    public void setService(final IngressServiceBackend service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resource,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressBackend)) {
            return false;
        }
        final IngressBackend __otherCasted = (IngressBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(service, __otherCasted.service);
    }

    public IngressBackend resource(final TypedLocalObjectReference resource) {
        this.resource = resource;
        return this;
    }

    public IngressBackend service(final IngressServiceBackend service) {
        this.service = service;
        return this;
    }

    @Override
    public IngressBackend validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resource != null ? "\"resource\":" + resource.asJson() : ""),
                    (service != null ? "\"service\":" + service.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
