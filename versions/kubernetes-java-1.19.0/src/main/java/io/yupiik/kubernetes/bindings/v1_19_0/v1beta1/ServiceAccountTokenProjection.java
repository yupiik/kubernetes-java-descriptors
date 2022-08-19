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
package io.yupiik.kubernetes.bindings.v1_19_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_0.Validable;
import io.yupiik.kubernetes.bindings.v1_19_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceAccountTokenProjection implements Validable<ServiceAccountTokenProjection>, Exportable {
    private String audience;
    private Integer expirationSeconds;
    private String path;

    public ServiceAccountTokenProjection() {
        // no-op
    }

    public ServiceAccountTokenProjection(final String audience,
                                         final Integer expirationSeconds,
                                         final String path) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
        this.path = path;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(final String audience) {
        this.audience = audience;
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audience,
                expirationSeconds,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceAccountTokenProjection)) {
            return false;
        }
        final ServiceAccountTokenProjection __otherCasted = (ServiceAccountTokenProjection) __other;
        return Objects.equals(audience, __otherCasted.audience) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds) &&
            Objects.equals(path, __otherCasted.path);
    }

    public ServiceAccountTokenProjection audience(final String audience) {
        this.audience = audience;
        return this;
    }

    public ServiceAccountTokenProjection expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    public ServiceAccountTokenProjection path(final String path) {
        this.path = path;
        return this;
    }

    @Override
    public ServiceAccountTokenProjection validate() {
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
                    (audience != null ? "\"audience\":\"" +  JsonStrings.escapeJson(audience) + "\"" : ""),
                    (expirationSeconds != null ? "\"expirationSeconds\":" + expirationSeconds : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
