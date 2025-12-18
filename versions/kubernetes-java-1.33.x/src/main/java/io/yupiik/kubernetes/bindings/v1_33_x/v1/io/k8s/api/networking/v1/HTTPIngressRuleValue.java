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
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import io.yupiik.kubernetes.bindings.v1_33_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.HTTPIngressRuleValue implements Validable<io.k8s.api.networking.v1.HTTPIngressRuleValue>, Exportable {
    private List<HTTPIngressPath> paths;

    public io.k8s.api.networking.v1.HTTPIngressRuleValue() {
        // no-op
    }

    public io.k8s.api.networking.v1.HTTPIngressRuleValue(final List<HTTPIngressPath> paths) {
        this.paths = paths;
    }

    public List<HTTPIngressPath> getPaths() {
        return paths;
    }

    public void setPaths(final List<HTTPIngressPath> paths) {
        this.paths = paths;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                paths);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.HTTPIngressRuleValue)) {
            return false;
        }
        final io.k8s.api.networking.v1.HTTPIngressRuleValue __otherCasted = (io.k8s.api.networking.v1.HTTPIngressRuleValue) __other;
        return Objects.equals(paths, __otherCasted.paths);
    }

    public io.k8s.api.networking.v1.HTTPIngressRuleValue paths(final List<HTTPIngressPath> paths) {
        this.paths = paths;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.HTTPIngressRuleValue validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (paths == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "paths", "paths",
                "Missing 'paths' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (paths != null ? "\"paths\":" + paths.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
