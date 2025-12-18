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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec implements Validable<io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec>, Exportable {
    private String namespace;

    public io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec() {
        // no-op
    }

    public io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec(final String namespace) {
        this.namespace = namespace;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec)) {
            return false;
        }
        final io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec __otherCasted = (io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec) __other;
        return Objects.equals(namespace, __otherCasted.namespace);
    }

    public io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
