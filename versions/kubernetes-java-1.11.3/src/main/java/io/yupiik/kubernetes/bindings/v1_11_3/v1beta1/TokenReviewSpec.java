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
package io.yupiik.kubernetes.bindings.v1_11_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_11_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenReviewSpec implements Validable<TokenReviewSpec>, Exportable {
    private String token;

    public TokenReviewSpec() {
        // no-op
    }

    public TokenReviewSpec(final String token) {
        this.token = token;
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
                token);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewSpec)) {
            return false;
        }
        final TokenReviewSpec __otherCasted = (TokenReviewSpec) __other;
        return Objects.equals(token, __otherCasted.token);
    }

    public TokenReviewSpec token(final String token) {
        this.token = token;
        return this;
    }

    @Override
    public TokenReviewSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (token != null ? "\"token\":\"" +  JsonStrings.escapeJson(token) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
