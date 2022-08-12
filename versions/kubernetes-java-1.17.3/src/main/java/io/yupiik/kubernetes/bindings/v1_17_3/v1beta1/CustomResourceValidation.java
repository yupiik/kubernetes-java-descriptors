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
package io.yupiik.kubernetes.bindings.v1_17_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_3.Validable;
import io.yupiik.kubernetes.bindings.v1_17_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceValidation implements Validable<CustomResourceValidation>, Exportable {
    private JSONSchemaProps openAPIV3Schema;

    public CustomResourceValidation() {
        // no-op
    }

    public CustomResourceValidation(final JSONSchemaProps openAPIV3Schema) {
        // no-op
    }

    public JSONSchemaProps getOpenAPIV3Schema() {
        return openAPIV3Schema;
    }

    public void setOpenAPIV3Schema(final JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                openAPIV3Schema);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceValidation)) {
            return false;
        }
        final CustomResourceValidation __otherCasted = (CustomResourceValidation) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }

    public CustomResourceValidation openAPIV3Schema(final JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
        return this;
    }

    @Override
    public CustomResourceValidation validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (openAPIV3Schema != null ? "\"openAPIV3Schema\":" + openAPIV3Schema.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
