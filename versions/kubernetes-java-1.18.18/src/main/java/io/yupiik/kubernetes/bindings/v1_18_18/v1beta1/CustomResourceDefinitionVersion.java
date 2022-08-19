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
package io.yupiik.kubernetes.bindings.v1_18_18.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_18.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_18.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_18.Validable;
import io.yupiik.kubernetes.bindings.v1_18_18.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceDefinitionVersion implements Validable<CustomResourceDefinitionVersion>, Exportable {
    private List<CustomResourceColumnDefinition> additionalPrinterColumns;
    private String name;
    private CustomResourceValidation schema;
    private boolean served;
    private boolean storage;
    private CustomResourceSubresources subresources;

    public CustomResourceDefinitionVersion() {
        // no-op
    }

    public CustomResourceDefinitionVersion(final List<CustomResourceColumnDefinition> additionalPrinterColumns,
                                           final String name,
                                           final CustomResourceValidation schema,
                                           final boolean served,
                                           final boolean storage,
                                           final CustomResourceSubresources subresources) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.name = name;
        this.schema = schema;
        this.served = served;
        this.storage = storage;
        this.subresources = subresources;
    }

    public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    public void setAdditionalPrinterColumns(final List<CustomResourceColumnDefinition> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public CustomResourceValidation getSchema() {
        return schema;
    }

    public void setSchema(final CustomResourceValidation schema) {
        this.schema = schema;
    }

    public boolean getServed() {
        return served;
    }

    public void setServed(final boolean served) {
        this.served = served;
    }

    public boolean getStorage() {
        return storage;
    }

    public void setStorage(final boolean storage) {
        this.storage = storage;
    }

    public CustomResourceSubresources getSubresources() {
        return subresources;
    }

    public void setSubresources(final CustomResourceSubresources subresources) {
        this.subresources = subresources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                additionalPrinterColumns,
                name,
                schema,
                served,
                storage,
                subresources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionVersion)) {
            return false;
        }
        final CustomResourceDefinitionVersion __otherCasted = (CustomResourceDefinitionVersion) __other;
        return Objects.equals(additionalPrinterColumns, __otherCasted.additionalPrinterColumns) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(schema, __otherCasted.schema) &&
            Objects.equals(served, __otherCasted.served) &&
            Objects.equals(storage, __otherCasted.storage) &&
            Objects.equals(subresources, __otherCasted.subresources);
    }

    public CustomResourceDefinitionVersion additionalPrinterColumns(final List<CustomResourceColumnDefinition> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        return this;
    }

    public CustomResourceDefinitionVersion name(final String name) {
        this.name = name;
        return this;
    }

    public CustomResourceDefinitionVersion schema(final CustomResourceValidation schema) {
        this.schema = schema;
        return this;
    }

    public CustomResourceDefinitionVersion served(final boolean served) {
        this.served = served;
        return this;
    }

    public CustomResourceDefinitionVersion storage(final boolean storage) {
        this.storage = storage;
        return this;
    }

    public CustomResourceDefinitionVersion subresources(final CustomResourceSubresources subresources) {
        this.subresources = subresources;
        return this;
    }

    @Override
    public CustomResourceDefinitionVersion validate() {
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
                    (additionalPrinterColumns != null ? "\"additionalPrinterColumns\":" + additionalPrinterColumns.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (schema != null ? "\"schema\":" + schema.asJson() : ""),
                    "\"served\":" + served,
                    "\"storage\":" + storage,
                    (subresources != null ? "\"subresources\":" + subresources.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
