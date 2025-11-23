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
package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import io.yupiik.kubernetes.bindings.v1_30_5.ValidationException;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesAttribute implements Validable<NamedResourcesAttribute>, Exportable {
    private Boolean bool;
    private NamedResourcesIntSlice intSlice;
    @JsonbProperty("int")
    private Integer intValue;
    private String name;
    private String quantity;
    private String string;
    private NamedResourcesStringSlice stringSlice;
    private String version;

    public NamedResourcesAttribute() {
        // no-op
    }

    public NamedResourcesAttribute(final Boolean bool,
                                   final NamedResourcesIntSlice intSlice,
                                   final Integer intValue,
                                   final String name,
                                   final String quantity,
                                   final String string,
                                   final NamedResourcesStringSlice stringSlice,
                                   final String version) {
        this.bool = bool;
        this.intSlice = intSlice;
        this.intValue = intValue;
        this.name = name;
        this.quantity = quantity;
        this.string = string;
        this.stringSlice = stringSlice;
        this.version = version;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(final Boolean bool) {
        this.bool = bool;
    }

    public NamedResourcesIntSlice getIntSlice() {
        return intSlice;
    }

    public void setIntSlice(final NamedResourcesIntSlice intSlice) {
        this.intSlice = intSlice;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(final Integer intValue) {
        this.intValue = intValue;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    public String getString() {
        return string;
    }

    public void setString(final String string) {
        this.string = string;
    }

    public NamedResourcesStringSlice getStringSlice() {
        return stringSlice;
    }

    public void setStringSlice(final NamedResourcesStringSlice stringSlice) {
        this.stringSlice = stringSlice;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bool,
                intSlice,
                intValue,
                name,
                quantity,
                string,
                stringSlice,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesAttribute)) {
            return false;
        }
        final NamedResourcesAttribute __otherCasted = (NamedResourcesAttribute) __other;
        return Objects.equals(bool, __otherCasted.bool) &&
            Objects.equals(intSlice, __otherCasted.intSlice) &&
            Objects.equals(intValue, __otherCasted.intValue) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(quantity, __otherCasted.quantity) &&
            Objects.equals(string, __otherCasted.string) &&
            Objects.equals(stringSlice, __otherCasted.stringSlice) &&
            Objects.equals(version, __otherCasted.version);
    }

    public NamedResourcesAttribute bool(final Boolean bool) {
        this.bool = bool;
        return this;
    }

    public NamedResourcesAttribute intSlice(final NamedResourcesIntSlice intSlice) {
        this.intSlice = intSlice;
        return this;
    }

    public NamedResourcesAttribute intValue(final Integer intValue) {
        this.intValue = intValue;
        return this;
    }

    public NamedResourcesAttribute name(final String name) {
        this.name = name;
        return this;
    }

    public NamedResourcesAttribute quantity(final String quantity) {
        this.quantity = quantity;
        return this;
    }

    public NamedResourcesAttribute string(final String string) {
        this.string = string;
        return this;
    }

    public NamedResourcesAttribute stringSlice(final NamedResourcesStringSlice stringSlice) {
        this.stringSlice = stringSlice;
        return this;
    }

    public NamedResourcesAttribute version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public NamedResourcesAttribute validate() {
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
                    (bool != null ? "\"bool\":" + bool : ""),
                    (intSlice != null ? "\"intSlice\":" + intSlice.asJson() : ""),
                    (intValue != null ? "\"int\":" + intValue : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (quantity != null ? "\"quantity\":\"" +  JsonStrings.escapeJson(quantity) + "\"" : ""),
                    (string != null ? "\"string\":\"" +  JsonStrings.escapeJson(string) + "\"" : ""),
                    (stringSlice != null ? "\"stringSlice\":" + stringSlice.asJson() : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
