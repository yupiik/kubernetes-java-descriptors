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
package io.yupiik.kubernetes.bindings.v1_21_7.v1;

import io.yupiik.kubernetes.bindings.v1_21_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_7.Validable;
import io.yupiik.kubernetes.bindings.v1_21_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeAddress implements Validable<NodeAddress>, Exportable {
    private String address;
    private String type;

    public NodeAddress() {
        // no-op
    }

    public NodeAddress(final String address,
                       final String type) {
        // no-op
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
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
                address,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeAddress)) {
            return false;
        }
        final NodeAddress __otherCasted = (NodeAddress) __other;
        return Objects.equals(address, __otherCasted.address) &&
            Objects.equals(type, __otherCasted.type);
    }

    public NodeAddress address(final String address) {
        this.address = address;
        return this;
    }

    public NodeAddress type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public NodeAddress validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (address == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "address", "address",
                "Missing 'address' attribute.", true));
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
                    (address != null ? "\"address\":\"" +  JsonStrings.escapeJson(address) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
