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
package io.yupiik.kubernetes.bindings.v1_35_x.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodGroupPolicy implements Validable<PodGroupPolicy>, Exportable {
    private JsonObject basic;
    private GangSchedulingPolicy gang;

    public PodGroupPolicy() {
        // no-op
    }

    public PodGroupPolicy(final JsonObject basic,
                          final GangSchedulingPolicy gang) {
        this.basic = basic;
        this.gang = gang;
    }

    public JsonObject getBasic() {
        return basic;
    }

    public void setBasic(final JsonObject basic) {
        this.basic = basic;
    }

    public GangSchedulingPolicy getGang() {
        return gang;
    }

    public void setGang(final GangSchedulingPolicy gang) {
        this.gang = gang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                basic,
                gang);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodGroupPolicy)) {
            return false;
        }
        final PodGroupPolicy __otherCasted = (PodGroupPolicy) __other;
        return Objects.equals(basic, __otherCasted.basic) &&
            Objects.equals(gang, __otherCasted.gang);
    }

    public PodGroupPolicy basic(final JsonObject basic) {
        this.basic = basic;
        return this;
    }

    public PodGroupPolicy gang(final GangSchedulingPolicy gang) {
        this.gang = gang;
        return this;
    }

    @Override
    public PodGroupPolicy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (basic != null ? "\"basic\":" + basic : ""),
                    (gang != null ? "\"gang\":" + gang.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
