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
package io.yupiik.kubernetes.bindings.v1_10_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelfSubjectRulesReviewSpec implements Validable<SelfSubjectRulesReviewSpec>, Exportable {
    private String namespace;

    public SelfSubjectRulesReviewSpec() {
        // no-op
    }

    public SelfSubjectRulesReviewSpec(final String namespace) {
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
        if (!(__other instanceof SelfSubjectRulesReviewSpec)) {
            return false;
        }
        final SelfSubjectRulesReviewSpec __otherCasted = (SelfSubjectRulesReviewSpec) __other;
        return Objects.equals(namespace, __otherCasted.namespace);
    }

    public SelfSubjectRulesReviewSpec namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public SelfSubjectRulesReviewSpec validate() {
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
