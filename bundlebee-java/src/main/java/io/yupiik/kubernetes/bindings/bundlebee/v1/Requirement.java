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
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Requirement implements Validable<Requirement>, Exportable {
    private List<String> forbiddenVersions;
    private String maxBundlebeeVersion;
    private String minBundlebeeVersion;

    public Requirement() {
        // no-op
    }

    public Requirement(final List<String> forbiddenVersions,
                       final String maxBundlebeeVersion,
                       final String minBundlebeeVersion) {
        this.forbiddenVersions = forbiddenVersions;
        this.maxBundlebeeVersion = maxBundlebeeVersion;
        this.minBundlebeeVersion = minBundlebeeVersion;
    }

    public List<String> getForbiddenVersions() {
        return forbiddenVersions;
    }

    public void setForbiddenVersions(final List<String> forbiddenVersions) {
        this.forbiddenVersions = forbiddenVersions;
    }

    public String getMaxBundlebeeVersion() {
        return maxBundlebeeVersion;
    }

    public void setMaxBundlebeeVersion(final String maxBundlebeeVersion) {
        this.maxBundlebeeVersion = maxBundlebeeVersion;
    }

    public String getMinBundlebeeVersion() {
        return minBundlebeeVersion;
    }

    public void setMinBundlebeeVersion(final String minBundlebeeVersion) {
        this.minBundlebeeVersion = minBundlebeeVersion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forbiddenVersions,
                maxBundlebeeVersion,
                minBundlebeeVersion);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Requirement)) {
            return false;
        }
        final Requirement __otherCasted = (Requirement) __other;
        return Objects.equals(forbiddenVersions, __otherCasted.forbiddenVersions) &&
            Objects.equals(maxBundlebeeVersion, __otherCasted.maxBundlebeeVersion) &&
            Objects.equals(minBundlebeeVersion, __otherCasted.minBundlebeeVersion);
    }

    public Requirement forbiddenVersions(final List<String> forbiddenVersions) {
        this.forbiddenVersions = forbiddenVersions;
        return this;
    }

    public Requirement maxBundlebeeVersion(final String maxBundlebeeVersion) {
        this.maxBundlebeeVersion = maxBundlebeeVersion;
        return this;
    }

    public Requirement minBundlebeeVersion(final String minBundlebeeVersion) {
        this.minBundlebeeVersion = minBundlebeeVersion;
        return this;
    }

    @Override
    public Requirement validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (forbiddenVersions != null ? "\"forbiddenVersions\":" + forbiddenVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (maxBundlebeeVersion != null ? "\"maxBundlebeeVersion\":\"" +  JsonStrings.escapeJson(maxBundlebeeVersion) + "\"" : ""),
                    (minBundlebeeVersion != null ? "\"minBundlebeeVersion\":\"" +  JsonStrings.escapeJson(minBundlebeeVersion) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
