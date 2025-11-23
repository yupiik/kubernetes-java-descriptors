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
package io.yupiik.kubernetes.bindings.v1_30_4.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_4.Validable;
import io.yupiik.kubernetes.bindings.v1_30_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesInstance implements Validable<NamedResourcesInstance>, Exportable {
    private List<NamedResourcesAttribute> attributes;
    private String name;

    public NamedResourcesInstance() {
        // no-op
    }

    public NamedResourcesInstance(final List<NamedResourcesAttribute> attributes,
                                  final String name) {
        this.attributes = attributes;
        this.name = name;
    }

    public List<NamedResourcesAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(final List<NamedResourcesAttribute> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attributes,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesInstance)) {
            return false;
        }
        final NamedResourcesInstance __otherCasted = (NamedResourcesInstance) __other;
        return Objects.equals(attributes, __otherCasted.attributes) &&
            Objects.equals(name, __otherCasted.name);
    }

    public NamedResourcesInstance attributes(final List<NamedResourcesAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public NamedResourcesInstance name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public NamedResourcesInstance validate() {
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
                    (attributes != null ? "\"attributes\":" + attributes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
