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
package io.yupiik.kubernetes.bindings.v1_31_2.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_31_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_2.Validable;
import io.yupiik.kubernetes.bindings.v1_31_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LeaseCandidateSpec implements Validable<LeaseCandidateSpec>, Exportable {
    private String binaryVersion;
    private String emulationVersion;
    private String leaseName;
    private String pingTime;
    private List<String> preferredStrategies;
    private String renewTime;

    public LeaseCandidateSpec() {
        // no-op
    }

    public LeaseCandidateSpec(final String binaryVersion,
                              final String emulationVersion,
                              final String leaseName,
                              final String pingTime,
                              final List<String> preferredStrategies,
                              final String renewTime) {
        this.binaryVersion = binaryVersion;
        this.emulationVersion = emulationVersion;
        this.leaseName = leaseName;
        this.pingTime = pingTime;
        this.preferredStrategies = preferredStrategies;
        this.renewTime = renewTime;
    }

    public String getBinaryVersion() {
        return binaryVersion;
    }

    public void setBinaryVersion(final String binaryVersion) {
        this.binaryVersion = binaryVersion;
    }

    public String getEmulationVersion() {
        return emulationVersion;
    }

    public void setEmulationVersion(final String emulationVersion) {
        this.emulationVersion = emulationVersion;
    }

    public String getLeaseName() {
        return leaseName;
    }

    public void setLeaseName(final String leaseName) {
        this.leaseName = leaseName;
    }

    public String getPingTime() {
        return pingTime;
    }

    public void setPingTime(final String pingTime) {
        this.pingTime = pingTime;
    }

    public List<String> getPreferredStrategies() {
        return preferredStrategies;
    }

    public void setPreferredStrategies(final List<String> preferredStrategies) {
        this.preferredStrategies = preferredStrategies;
    }

    public String getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(final String renewTime) {
        this.renewTime = renewTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                binaryVersion,
                emulationVersion,
                leaseName,
                pingTime,
                preferredStrategies,
                renewTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LeaseCandidateSpec)) {
            return false;
        }
        final LeaseCandidateSpec __otherCasted = (LeaseCandidateSpec) __other;
        return Objects.equals(binaryVersion, __otherCasted.binaryVersion) &&
            Objects.equals(emulationVersion, __otherCasted.emulationVersion) &&
            Objects.equals(leaseName, __otherCasted.leaseName) &&
            Objects.equals(pingTime, __otherCasted.pingTime) &&
            Objects.equals(preferredStrategies, __otherCasted.preferredStrategies) &&
            Objects.equals(renewTime, __otherCasted.renewTime);
    }

    public LeaseCandidateSpec binaryVersion(final String binaryVersion) {
        this.binaryVersion = binaryVersion;
        return this;
    }

    public LeaseCandidateSpec emulationVersion(final String emulationVersion) {
        this.emulationVersion = emulationVersion;
        return this;
    }

    public LeaseCandidateSpec leaseName(final String leaseName) {
        this.leaseName = leaseName;
        return this;
    }

    public LeaseCandidateSpec pingTime(final String pingTime) {
        this.pingTime = pingTime;
        return this;
    }

    public LeaseCandidateSpec preferredStrategies(final List<String> preferredStrategies) {
        this.preferredStrategies = preferredStrategies;
        return this;
    }

    public LeaseCandidateSpec renewTime(final String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    @Override
    public LeaseCandidateSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (leaseName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "leaseName", "leaseName",
                "Missing 'leaseName' attribute.", true));
        }
        if (preferredStrategies == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "preferredStrategies", "preferredStrategies",
                "Missing 'preferredStrategies' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (binaryVersion != null ? "\"binaryVersion\":\"" +  JsonStrings.escapeJson(binaryVersion) + "\"" : ""),
                    (emulationVersion != null ? "\"emulationVersion\":\"" +  JsonStrings.escapeJson(emulationVersion) + "\"" : ""),
                    (leaseName != null ? "\"leaseName\":\"" +  JsonStrings.escapeJson(leaseName) + "\"" : ""),
                    (pingTime != null ? "\"pingTime\":\"" +  JsonStrings.escapeJson(pingTime) + "\"" : ""),
                    (preferredStrategies != null ? "\"preferredStrategies\":" + preferredStrategies.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (renewTime != null ? "\"renewTime\":\"" +  JsonStrings.escapeJson(renewTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
