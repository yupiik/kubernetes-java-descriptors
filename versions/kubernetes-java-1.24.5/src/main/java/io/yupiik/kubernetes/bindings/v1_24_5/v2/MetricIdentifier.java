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
package io.yupiik.kubernetes.bindings.v1_24_5.v2;

import io.yupiik.kubernetes.bindings.v1_24_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_5.Validable;
import io.yupiik.kubernetes.bindings.v1_24_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MetricIdentifier implements Validable<MetricIdentifier>, Exportable {
    private String name;
    private LabelSelector selector;

    public MetricIdentifier() {
        // no-op
    }

    public MetricIdentifier(final String name,
                            final LabelSelector selector) {
        this.name = name;
        this.selector = selector;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MetricIdentifier)) {
            return false;
        }
        final MetricIdentifier __otherCasted = (MetricIdentifier) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }

    public MetricIdentifier name(final String name) {
        this.name = name;
        return this;
    }

    public MetricIdentifier selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public MetricIdentifier validate() {
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
                    (selector != null ? "\"selector\":" + selector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
