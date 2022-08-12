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
package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import io.yupiik.kubernetes.bindings.v1_22_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_4.Validable;
import io.yupiik.kubernetes.bindings.v1_22_4.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceQuotaStatus implements Validable<ResourceQuotaStatus>, Exportable {
    private JsonObject hard;
    private JsonObject used;

    public ResourceQuotaStatus() {
        // no-op
    }

    public ResourceQuotaStatus(final JsonObject hard,
                               final JsonObject used) {
        // no-op
    }

    public JsonObject getHard() {
        return hard;
    }

    public void setHard(final JsonObject hard) {
        this.hard = hard;
    }

    public JsonObject getUsed() {
        return used;
    }

    public void setUsed(final JsonObject used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hard,
                used);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaStatus)) {
            return false;
        }
        final ResourceQuotaStatus __otherCasted = (ResourceQuotaStatus) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(used, __otherCasted.used);
    }

    public ResourceQuotaStatus hard(final JsonObject hard) {
        this.hard = hard;
        return this;
    }

    public ResourceQuotaStatus used(final JsonObject used) {
        this.used = used;
        return this;
    }

    @Override
    public ResourceQuotaStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hard != null ? "\"hard\":" + hard : ""),
                    (used != null ? "\"used\":" + used : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
