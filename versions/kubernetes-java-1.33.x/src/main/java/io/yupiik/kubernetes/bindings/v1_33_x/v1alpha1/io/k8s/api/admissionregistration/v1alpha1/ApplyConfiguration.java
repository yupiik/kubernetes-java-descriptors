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
package io.yupiik.kubernetes.bindings.v1_33_x.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration implements Validable<io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration>, Exportable {
    private String expression;

    public io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration() {
        // no-op
    }

    public io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration(final String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(final String expression) {
        this.expression = expression;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                expression);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration)) {
            return false;
        }
        final io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration __otherCasted = (io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration) __other;
        return Objects.equals(expression, __otherCasted.expression);
    }

    public io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration expression(final String expression) {
        this.expression = expression;
        return this;
    }

    @Override
    public io.k8s.api.admissionregistration.v1alpha1.ApplyConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expression != null ? "\"expression\":\"" +  JsonStrings.escapeJson(expression) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
