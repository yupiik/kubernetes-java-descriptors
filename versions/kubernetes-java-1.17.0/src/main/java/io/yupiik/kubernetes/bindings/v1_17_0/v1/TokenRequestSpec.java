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
package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import io.yupiik.kubernetes.bindings.v1_17_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_0.Validable;
import io.yupiik.kubernetes.bindings.v1_17_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenRequestSpec implements Validable<TokenRequestSpec>, Exportable {
    private List<String> audiences;
    private BoundObjectReference boundObjectRef;
    private Integer expirationSeconds;

    public TokenRequestSpec() {
        // no-op
    }

    public TokenRequestSpec(final List<String> audiences,
                            final BoundObjectReference boundObjectRef,
                            final Integer expirationSeconds) {
        this.audiences = audiences;
        this.boundObjectRef = boundObjectRef;
        this.expirationSeconds = expirationSeconds;
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public BoundObjectReference getBoundObjectRef() {
        return boundObjectRef;
    }

    public void setBoundObjectRef(final BoundObjectReference boundObjectRef) {
        this.boundObjectRef = boundObjectRef;
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audiences,
                boundObjectRef,
                expirationSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenRequestSpec)) {
            return false;
        }
        final TokenRequestSpec __otherCasted = (TokenRequestSpec) __other;
        return Objects.equals(audiences, __otherCasted.audiences) &&
            Objects.equals(boundObjectRef, __otherCasted.boundObjectRef) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds);
    }

    public TokenRequestSpec audiences(final List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenRequestSpec boundObjectRef(final BoundObjectReference boundObjectRef) {
        this.boundObjectRef = boundObjectRef;
        return this;
    }

    public TokenRequestSpec expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    @Override
    public TokenRequestSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (audiences == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "audiences", "audiences",
                "Missing 'audiences' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (audiences != null ? "\"audiences\":" + audiences.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (boundObjectRef != null ? "\"boundObjectRef\":" + boundObjectRef.asJson() : ""),
                    (expirationSeconds != null ? "\"expirationSeconds\":" + expirationSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
