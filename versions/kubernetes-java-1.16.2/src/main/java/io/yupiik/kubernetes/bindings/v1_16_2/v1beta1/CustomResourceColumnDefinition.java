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
package io.yupiik.kubernetes.bindings.v1_16_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_2.Validable;
import io.yupiik.kubernetes.bindings.v1_16_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceColumnDefinition implements Validable<CustomResourceColumnDefinition>, Exportable {
    private String JSONPath;
    private String description;
    private String format;
    private String name;
    private Integer priority;
    private String type;

    public CustomResourceColumnDefinition() {
        // no-op
    }

    public CustomResourceColumnDefinition(final String JSONPath,
                                          final String description,
                                          final String format,
                                          final String name,
                                          final Integer priority,
                                          final String type) {
        this.JSONPath = JSONPath;
        this.description = description;
        this.format = format;
        this.name = name;
        this.priority = priority;
        this.type = type;
    }

    public String getJSONPath() {
        return JSONPath;
    }

    public void setJSONPath(final String JSONPath) {
        this.JSONPath = JSONPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(final Integer priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                JSONPath,
                description,
                format,
                name,
                priority,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceColumnDefinition)) {
            return false;
        }
        final CustomResourceColumnDefinition __otherCasted = (CustomResourceColumnDefinition) __other;
        return Objects.equals(JSONPath, __otherCasted.JSONPath) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(format, __otherCasted.format) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(priority, __otherCasted.priority) &&
            Objects.equals(type, __otherCasted.type);
    }

    public CustomResourceColumnDefinition JSONPath(final String JSONPath) {
        this.JSONPath = JSONPath;
        return this;
    }

    public CustomResourceColumnDefinition description(final String description) {
        this.description = description;
        return this;
    }

    public CustomResourceColumnDefinition format(final String format) {
        this.format = format;
        return this;
    }

    public CustomResourceColumnDefinition name(final String name) {
        this.name = name;
        return this;
    }

    public CustomResourceColumnDefinition priority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    public CustomResourceColumnDefinition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public CustomResourceColumnDefinition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (JSONPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "JSONPath", "JSONPath",
                "Missing 'JSONPath' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (JSONPath != null ? "\"JSONPath\":\"" +  JsonStrings.escapeJson(JSONPath) + "\"" : ""),
                    (description != null ? "\"description\":\"" +  JsonStrings.escapeJson(description) + "\"" : ""),
                    (format != null ? "\"format\":\"" +  JsonStrings.escapeJson(format) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (priority != null ? "\"priority\":" + priority : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
