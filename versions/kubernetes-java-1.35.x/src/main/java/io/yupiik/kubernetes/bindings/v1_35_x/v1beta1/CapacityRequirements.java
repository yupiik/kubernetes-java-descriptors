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
package io.yupiik.kubernetes.bindings.v1_35_x.v1beta1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CapacityRequirements implements Validable<CapacityRequirements>, Exportable {
    private JsonObject requests;

    public CapacityRequirements() {
        // no-op
    }

    public CapacityRequirements(final JsonObject requests) {
        this.requests = requests;
    }

    public JsonObject getRequests() {
        return requests;
    }

    public void setRequests(final JsonObject requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CapacityRequirements)) {
            return false;
        }
        final CapacityRequirements __otherCasted = (CapacityRequirements) __other;
        return Objects.equals(requests, __otherCasted.requests);
    }

    public CapacityRequirements requests(final JsonObject requests) {
        this.requests = requests;
        return this;
    }

    @Override
    public CapacityRequirements validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (requests != null ? "\"requests\":" + requests : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    @Override
    public String toString() {
        return asJson();
    }
}
