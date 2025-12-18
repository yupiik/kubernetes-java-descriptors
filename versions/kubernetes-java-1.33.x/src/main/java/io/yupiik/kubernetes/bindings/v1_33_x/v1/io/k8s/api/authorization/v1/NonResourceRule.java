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
import io.yupiik.kubernetes.bindings.v1_33_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.authorization.v1.NonResourceRule implements Validable<io.k8s.api.authorization.v1.NonResourceRule>, Exportable {
    private List<String> nonResourceURLs;
    private List<String> verbs;

    public io.k8s.api.authorization.v1.NonResourceRule() {
        // no-op
    }

    public io.k8s.api.authorization.v1.NonResourceRule(final List<String> nonResourceURLs,
                                                       final List<String> verbs) {
        this.nonResourceURLs = nonResourceURLs;
        this.verbs = verbs;
    }

    public List<String> getNonResourceURLs() {
        return nonResourceURLs;
    }

    public void setNonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(final List<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceURLs,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.authorization.v1.NonResourceRule)) {
            return false;
        }
        final io.k8s.api.authorization.v1.NonResourceRule __otherCasted = (io.k8s.api.authorization.v1.NonResourceRule) __other;
        return Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public io.k8s.api.authorization.v1.NonResourceRule nonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public io.k8s.api.authorization.v1.NonResourceRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public io.k8s.api.authorization.v1.NonResourceRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (verbs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "verbs", "verbs",
                "Missing 'verbs' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nonResourceURLs != null ? "\"nonResourceURLs\":" + nonResourceURLs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (verbs != null ? "\"verbs\":" + verbs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
