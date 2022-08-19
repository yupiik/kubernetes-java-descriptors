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
package io.yupiik.kubernetes.bindings.v1_23_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EmptyDirVolumeSource implements Validable<EmptyDirVolumeSource>, Exportable {
    private String medium;
    private String sizeLimit;

    public EmptyDirVolumeSource() {
        // no-op
    }

    public EmptyDirVolumeSource(final String medium,
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
        if (!(__other instanceof EmptyDirVolumeSource)) {
            return false;
        }
        final EmptyDirVolumeSource __otherCasted = (EmptyDirVolumeSource) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }

    public EmptyDirVolumeSource medium(final String medium) {
        this.medium = medium;
        return this;
    }

    public EmptyDirVolumeSource sizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }

    @Override
    public EmptyDirVolumeSource validate() {
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
