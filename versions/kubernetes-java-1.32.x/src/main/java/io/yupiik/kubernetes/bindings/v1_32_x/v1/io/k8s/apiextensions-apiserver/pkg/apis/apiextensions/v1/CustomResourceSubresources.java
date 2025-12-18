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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources implements Validable<io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources>, Exportable {
    private CustomResourceSubresourceScale scale;
    private JsonObject status;

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources() {
        // no-op
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources(final CustomResourceSubresourceScale scale,
                                                                                               final JsonObject status) {
        this.scale = scale;
        this.status = status;
    }

    public CustomResourceSubresourceScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceSubresourceScale scale) {
        this.scale = scale;
    }

    public JsonObject getStatus() {
        return status;
    }

    public void setStatus(final JsonObject status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scale,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources)) {
            return false;
        }
        final io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources __otherCasted = (io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources scale(final CustomResourceSubresourceScale scale) {
        this.scale = scale;
        return this;
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources status(final JsonObject status) {
        this.status = status;
        return this;
    }

    @Override
    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceSubresources validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (scale != null ? "\"scale\":" + scale.asJson() : ""),
                    (status != null ? "\"status\":" + status : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
