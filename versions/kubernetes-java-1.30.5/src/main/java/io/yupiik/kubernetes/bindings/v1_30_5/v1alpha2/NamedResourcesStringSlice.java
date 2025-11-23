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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesStringSlice implements Validable<NamedResourcesStringSlice>, Exportable {
    private List<String> strings;

    public NamedResourcesStringSlice() {
        // no-op
    }

    public NamedResourcesStringSlice(final List<String> strings) {
        this.strings = strings;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(final List<String> strings) {
        this.strings = strings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strings);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesStringSlice)) {
            return false;
        }
        final NamedResourcesStringSlice __otherCasted = (NamedResourcesStringSlice) __other;
        return Objects.equals(strings, __otherCasted.strings);
    }

    public NamedResourcesStringSlice strings(final List<String> strings) {
        this.strings = strings;
        return this;
    }

    @Override
    public NamedResourcesStringSlice validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (strings == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "strings", "strings",
                "Missing 'strings' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (strings != null ? "\"strings\":" + strings.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
