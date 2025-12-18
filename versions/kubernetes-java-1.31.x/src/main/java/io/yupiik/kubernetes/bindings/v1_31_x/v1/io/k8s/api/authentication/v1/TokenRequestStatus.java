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
package io.yupiik.kubernetes.bindings.v1_31_x.v1;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import io.yupiik.kubernetes.bindings.v1_31_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.authentication.v1.TokenRequestStatus implements Validable<io.k8s.api.authentication.v1.TokenRequestStatus>, Exportable {
    private String expirationTimestamp;
    private String token;

    public io.k8s.api.authentication.v1.TokenRequestStatus() {
        // no-op
    }

    public io.k8s.api.authentication.v1.TokenRequestStatus(final String expirationTimestamp,
                                                           final String token) {
        this.expirationTimestamp = expirationTimestamp;
        this.token = token;
    }

    public String getExpirationTimestamp() {
        return expirationTimestamp;
    }

    public void setExpirationTimestamp(final String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                expirationTimestamp,
                token);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.authentication.v1.TokenRequestStatus)) {
            return false;
        }
        final io.k8s.api.authentication.v1.TokenRequestStatus __otherCasted = (io.k8s.api.authentication.v1.TokenRequestStatus) __other;
        return Objects.equals(expirationTimestamp, __otherCasted.expirationTimestamp) &&
            Objects.equals(token, __otherCasted.token);
    }

    public io.k8s.api.authentication.v1.TokenRequestStatus expirationTimestamp(final String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }

    public io.k8s.api.authentication.v1.TokenRequestStatus token(final String token) {
        this.token = token;
        return this;
    }

    @Override
    public io.k8s.api.authentication.v1.TokenRequestStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (expirationTimestamp == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "expirationTimestamp", "expirationTimestamp",
                "Missing 'expirationTimestamp' attribute.", true));
        }
        if (token == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "token", "token",
                "Missing 'token' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expirationTimestamp != null ? "\"expirationTimestamp\":\"" +  JsonStrings.escapeJson(expirationTimestamp) + "\"" : ""),
                    (token != null ? "\"token\":\"" +  JsonStrings.escapeJson(token) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
