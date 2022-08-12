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
package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import io.yupiik.kubernetes.bindings.v1_23_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_9.Validable;
import io.yupiik.kubernetes.bindings.v1_23_9.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceSubresources implements Validable<CustomResourceSubresources>, Exportable {
    private CustomResourceSubresourceScale scale;
    private JsonObject status;

    public CustomResourceSubresources() {
        // no-op
    }

    public CustomResourceSubresources(final CustomResourceSubresourceScale scale,
                                      final JsonObject status) {
        // no-op
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
        if (!(__other instanceof CustomResourceSubresources)) {
            return false;
        }
        final CustomResourceSubresources __otherCasted = (CustomResourceSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }

    public CustomResourceSubresources scale(final CustomResourceSubresourceScale scale) {
        this.scale = scale;
        return this;
    }

    public CustomResourceSubresources status(final JsonObject status) {
        this.status = status;
        return this;
    }

    @Override
    public CustomResourceSubresources validate() {
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
