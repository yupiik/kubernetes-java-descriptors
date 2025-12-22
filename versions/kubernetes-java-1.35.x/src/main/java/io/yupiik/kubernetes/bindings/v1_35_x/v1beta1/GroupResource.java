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
package io.yupiik.kubernetes.bindings.v1_35_x.v1beta1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import io.yupiik.kubernetes.bindings.v1_35_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GroupResource implements Validable<GroupResource>, Exportable {
    private String group;
    private String resource;

    public GroupResource() {
        // no-op
    }

    public GroupResource(final String group,
                         final String resource) {
        this.group = group;
        this.resource = resource;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                resource);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GroupResource)) {
            return false;
        }
        final GroupResource __otherCasted = (GroupResource) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(resource, __otherCasted.resource);
    }

    public GroupResource group(final String group) {
        this.group = group;
        return this;
    }

    public GroupResource resource(final String resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public GroupResource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (group == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "group", "group",
                "Missing 'group' attribute.", true));
        }
        if (resource == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resource", "resource",
                "Missing 'resource' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
