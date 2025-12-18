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
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.IngressClassSpec implements Validable<io.k8s.api.networking.v1.IngressClassSpec>, Exportable {
    private String controller;
    private IngressClassParametersReference parameters;

    public io.k8s.api.networking.v1.IngressClassSpec() {
        // no-op
    }

    public io.k8s.api.networking.v1.IngressClassSpec(final String controller,
                                                     final IngressClassParametersReference parameters) {
        this.controller = controller;
        this.parameters = parameters;
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public IngressClassParametersReference getParameters() {
        return parameters;
    }

    public void setParameters(final IngressClassParametersReference parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                controller,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.IngressClassSpec)) {
            return false;
        }
        final io.k8s.api.networking.v1.IngressClassSpec __otherCasted = (io.k8s.api.networking.v1.IngressClassSpec) __other;
        return Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public io.k8s.api.networking.v1.IngressClassSpec controller(final String controller) {
        this.controller = controller;
        return this;
    }

    public io.k8s.api.networking.v1.IngressClassSpec parameters(final IngressClassParametersReference parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.IngressClassSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (controller != null ? "\"controller\":\"" +  JsonStrings.escapeJson(controller) + "\"" : ""),
                    (parameters != null ? "\"parameters\":" + parameters.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
