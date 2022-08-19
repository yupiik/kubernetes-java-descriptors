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
package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollingUpdateDeployment implements Validable<RollingUpdateDeployment>, Exportable {
    private String maxSurge;
    private String maxUnavailable;

    public RollingUpdateDeployment() {
        // no-op
    }

    public RollingUpdateDeployment(final String maxSurge,
                                   final String maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    public String getMaxSurge() {
        return maxSurge;
    }

    public void setMaxSurge(final String maxSurge) {
        this.maxSurge = maxSurge;
    }

    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxSurge,
                maxUnavailable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollingUpdateDeployment)) {
            return false;
        }
        final RollingUpdateDeployment __otherCasted = (RollingUpdateDeployment) __other;
        return Objects.equals(maxSurge, __otherCasted.maxSurge) &&
            Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }

    public RollingUpdateDeployment maxSurge(final String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

    public RollingUpdateDeployment maxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    @Override
    public RollingUpdateDeployment validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (maxSurge != null ? "\"maxSurge\":\"" +  JsonStrings.escapeJson(maxSurge) + "\"" : ""),
                    (maxUnavailable != null ? "\"maxUnavailable\":\"" +  JsonStrings.escapeJson(maxUnavailable) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
