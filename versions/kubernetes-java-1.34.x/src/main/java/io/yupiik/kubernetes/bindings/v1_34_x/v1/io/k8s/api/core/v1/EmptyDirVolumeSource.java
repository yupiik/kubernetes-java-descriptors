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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.EmptyDirVolumeSource implements Validable<io.k8s.api.core.v1.EmptyDirVolumeSource>, Exportable {
    private String medium;
    private String sizeLimit;

    public io.k8s.api.core.v1.EmptyDirVolumeSource() {
        // no-op
    }

    public io.k8s.api.core.v1.EmptyDirVolumeSource(final String medium,
                                                   final String sizeLimit) {
        this.medium = medium;
        this.sizeLimit = sizeLimit;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(final String medium) {
        this.medium = medium;
    }

    public String getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                medium,
                sizeLimit);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.EmptyDirVolumeSource)) {
            return false;
        }
        final io.k8s.api.core.v1.EmptyDirVolumeSource __otherCasted = (io.k8s.api.core.v1.EmptyDirVolumeSource) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }

    public io.k8s.api.core.v1.EmptyDirVolumeSource medium(final String medium) {
        this.medium = medium;
        return this;
    }

    public io.k8s.api.core.v1.EmptyDirVolumeSource sizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.EmptyDirVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (medium != null ? "\"medium\":\"" +  JsonStrings.escapeJson(medium) + "\"" : ""),
                    (sizeLimit != null ? "\"sizeLimit\":\"" +  JsonStrings.escapeJson(sizeLimit) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
