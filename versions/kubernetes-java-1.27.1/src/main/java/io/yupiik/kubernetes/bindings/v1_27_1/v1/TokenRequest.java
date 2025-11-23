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
package io.yupiik.kubernetes.bindings.v1_27_1.v1;

import io.yupiik.kubernetes.bindings.v1_27_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_1.Validable;
import io.yupiik.kubernetes.bindings.v1_27_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenRequest implements Validable<TokenRequest>, Exportable {
    private String audience;
    private Integer expirationSeconds;

    public TokenRequest() {
        // no-op
    }

    public TokenRequest(final String audience,
                        final Integer expirationSeconds) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                audience,
                expirationSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenRequest)) {
            return false;
        }
        final TokenRequest __otherCasted = (TokenRequest) __other;
        return Objects.equals(audience, __otherCasted.audience) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds);
    }

    public TokenRequest audience(final String audience) {
        this.audience = audience;
        return this;
    }

    public TokenRequest expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    @Override
    public TokenRequest validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (audience == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "audience", "audience",
                "Missing 'audience' attribute.", true));
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
                    (expirationSeconds != null ? "\"expirationSeconds\":" + expirationSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
