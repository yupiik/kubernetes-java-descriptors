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
package io.yupiik.kubernetes.bindings.v1_20_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_12.Validable;
import io.yupiik.kubernetes.bindings.v1_20_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlowDistinguisherMethod implements Validable<FlowDistinguisherMethod>, Exportable {
    private String type;

    public FlowDistinguisherMethod() {
        // no-op
    }

    public FlowDistinguisherMethod(final String type) {
        // no-op
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
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowDistinguisherMethod)) {
            return false;
        }
        final FlowDistinguisherMethod __otherCasted = (FlowDistinguisherMethod) __other;
        return Objects.equals(type, __otherCasted.type);
    }

    public FlowDistinguisherMethod type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public FlowDistinguisherMethod validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
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
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
