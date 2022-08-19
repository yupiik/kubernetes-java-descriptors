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
package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_9.Validable;
import io.yupiik.kubernetes.bindings.v1_14_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ProjectedVolumeSource implements Validable<ProjectedVolumeSource>, Exportable {
    private Integer defaultMode;
    private List<VolumeProjection> sources;

    public ProjectedVolumeSource() {
        // no-op
    }

    public ProjectedVolumeSource(final Integer defaultMode,
                                 final List<VolumeProjection> sources) {
        this.defaultMode = defaultMode;
        this.sources = sources;
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<VolumeProjection> getSources() {
        return sources;
    }

    public void setSources(final List<VolumeProjection> sources) {
        this.sources = sources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                sources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ProjectedVolumeSource)) {
            return false;
        }
        final ProjectedVolumeSource __otherCasted = (ProjectedVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }

    public ProjectedVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public ProjectedVolumeSource sources(final List<VolumeProjection> sources) {
        this.sources = sources;
        return this;
    }

    @Override
    public ProjectedVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (sources == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "sources", "sources",
                "Missing 'sources' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (defaultMode != null ? "\"defaultMode\":" + defaultMode : ""),
                    (sources != null ? "\"sources\":" + sources.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
