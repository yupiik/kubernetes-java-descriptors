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
package io.yupiik.kubernetes.bindings.v1_30_6.v1;

import io.yupiik.kubernetes.bindings.v1_30_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_6.Validable;
import io.yupiik.kubernetes.bindings.v1_30_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClusterTrustBundleProjection implements Validable<ClusterTrustBundleProjection>, Exportable {
    private LabelSelector labelSelector;
    private String name;
    private Boolean optional;
    private String path;
    private String signerName;

    public ClusterTrustBundleProjection() {
        // no-op
    }

    public ClusterTrustBundleProjection(final LabelSelector labelSelector,
                                        final String name,
                                        final Boolean optional,
                                        final String path,
                                        final String signerName) {
        this.labelSelector = labelSelector;
        this.name = name;
        this.optional = optional;
        this.path = path;
        this.signerName = signerName;
    }

    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(final String signerName) {
        this.signerName = signerName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                name,
                optional,
                path,
                signerName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterTrustBundleProjection)) {
            return false;
        }
        final ClusterTrustBundleProjection __otherCasted = (ClusterTrustBundleProjection) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(signerName, __otherCasted.signerName);
    }

    public ClusterTrustBundleProjection labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public ClusterTrustBundleProjection name(final String name) {
        this.name = name;
        return this;
    }

    public ClusterTrustBundleProjection optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    public ClusterTrustBundleProjection path(final String path) {
        this.path = path;
        return this;
    }

    public ClusterTrustBundleProjection signerName(final String signerName) {
        this.signerName = signerName;
        return this;
    }

    @Override
    public ClusterTrustBundleProjection validate() {
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
                    (labelSelector != null ? "\"labelSelector\":" + labelSelector.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (signerName != null ? "\"signerName\":\"" +  JsonStrings.escapeJson(signerName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
