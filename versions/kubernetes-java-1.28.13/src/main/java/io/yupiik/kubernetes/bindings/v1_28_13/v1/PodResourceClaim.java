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
package io.yupiik.kubernetes.bindings.v1_28_13.v1;

import io.yupiik.kubernetes.bindings.v1_28_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_13.Validable;
import io.yupiik.kubernetes.bindings.v1_28_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodResourceClaim implements Validable<PodResourceClaim>, Exportable {
    private String name;
    private ClaimSource source;

    public PodResourceClaim() {
        // no-op
    }

    public PodResourceClaim(final String name,
                            final ClaimSource source) {
        this.name = name;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ClaimSource getSource() {
        return source;
    }

    public void setSource(final ClaimSource source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                source);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodResourceClaim)) {
            return false;
        }
        final PodResourceClaim __otherCasted = (PodResourceClaim) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(source, __otherCasted.source);
    }

    public PodResourceClaim name(final String name) {
        this.name = name;
        return this;
    }

    public PodResourceClaim source(final ClaimSource source) {
        this.source = source;
        return this;
    }

    @Override
    public PodResourceClaim validate() {
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
                    (source != null ? "\"source\":" + source.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
