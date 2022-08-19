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
package io.yupiik.kubernetes.bindings.v1_8_8.v2beta1;

import io.yupiik.kubernetes.bindings.v1_8_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Preconditions implements Validable<Preconditions>, Exportable {
    private String uid;

    public Preconditions() {
        // no-op
    }

    public Preconditions(final String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Preconditions)) {
            return false;
        }
        final Preconditions __otherCasted = (Preconditions) __other;
        return Objects.equals(uid, __otherCasted.uid);
    }

    public Preconditions uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public Preconditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
