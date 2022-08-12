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
package io.yupiik.kubernetes.bindings.v1_18_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_2.Validable;
import io.yupiik.kubernetes.bindings.v1_18_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DownwardAPIVolumeFile implements Validable<DownwardAPIVolumeFile>, Exportable {
    private ObjectFieldSelector fieldRef;
    private Integer mode;
    private String path;
    private ResourceFieldSelector resourceFieldRef;

    public DownwardAPIVolumeFile() {
        // no-op
    }

    public DownwardAPIVolumeFile(final ObjectFieldSelector fieldRef,
                                 final Integer mode,
                                 final String path,
                                 final ResourceFieldSelector resourceFieldRef) {
        // no-op
    }

    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(final Integer mode) {
        this.mode = mode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fieldRef,
                mode,
                path,
                resourceFieldRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DownwardAPIVolumeFile)) {
            return false;
        }
        final DownwardAPIVolumeFile __otherCasted = (DownwardAPIVolumeFile) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }

    public DownwardAPIVolumeFile fieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public DownwardAPIVolumeFile mode(final Integer mode) {
        this.mode = mode;
        return this;
    }

    public DownwardAPIVolumeFile path(final String path) {
        this.path = path;
        return this;
    }

    public DownwardAPIVolumeFile resourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

    @Override
    public DownwardAPIVolumeFile validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fieldRef != null ? "\"fieldRef\":" + fieldRef.asJson() : ""),
                    (mode != null ? "\"mode\":" + mode : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (resourceFieldRef != null ? "\"resourceFieldRef\":" + resourceFieldRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
