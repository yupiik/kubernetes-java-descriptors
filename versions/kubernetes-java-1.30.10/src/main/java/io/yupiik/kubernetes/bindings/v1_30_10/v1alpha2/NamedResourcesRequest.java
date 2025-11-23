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
package io.yupiik.kubernetes.bindings.v1_30_10.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_10.Validable;
import io.yupiik.kubernetes.bindings.v1_30_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesRequest implements Validable<NamedResourcesRequest>, Exportable {
    private String selector;

    public NamedResourcesRequest() {
        // no-op
    }

    public NamedResourcesRequest(final String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(final String selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesRequest)) {
            return false;
        }
        final NamedResourcesRequest __otherCasted = (NamedResourcesRequest) __other;
        return Objects.equals(selector, __otherCasted.selector);
    }

    public NamedResourcesRequest selector(final String selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public NamedResourcesRequest validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (selector != null ? "\"selector\":\"" +  JsonStrings.escapeJson(selector) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
