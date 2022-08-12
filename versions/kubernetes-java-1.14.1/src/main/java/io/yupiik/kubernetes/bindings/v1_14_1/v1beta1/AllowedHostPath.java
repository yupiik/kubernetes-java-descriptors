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
package io.yupiik.kubernetes.bindings.v1_14_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_1.Validable;
import io.yupiik.kubernetes.bindings.v1_14_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllowedHostPath implements Validable<AllowedHostPath>, Exportable {
    private String pathPrefix;
    private Boolean readOnly;

    public AllowedHostPath() {
        // no-op
    }

    public AllowedHostPath(final String pathPrefix,
                           final Boolean readOnly) {
        // no-op
    }

    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(final String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pathPrefix,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllowedHostPath)) {
            return false;
        }
        final AllowedHostPath __otherCasted = (AllowedHostPath) __other;
        return Objects.equals(pathPrefix, __otherCasted.pathPrefix) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public AllowedHostPath pathPrefix(final String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    public AllowedHostPath readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public AllowedHostPath validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (pathPrefix != null ? "\"pathPrefix\":\"" +  JsonStrings.escapeJson(pathPrefix) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
