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
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import io.yupiik.kubernetes.bindings.v1_35_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodCertificateRequestSpec implements Validable<PodCertificateRequestSpec>, Exportable {
    private Integer maxExpirationSeconds;
    private String nodeName;
    private String nodeUID;
    private String pkixPublicKey;
    private String podName;
    private String podUID;
    private String proofOfPossession;
    private String serviceAccountName;
    private String serviceAccountUID;
    private String signerName;
    private Map<String, String> unverifiedUserAnnotations;

    public PodCertificateRequestSpec() {
        // no-op
    }

    public PodCertificateRequestSpec(final Integer maxExpirationSeconds,
                                     final String nodeName,
                                     final String nodeUID,
                                     final String pkixPublicKey,
                                     final String podName,
                                     final String podUID,
                                     final String proofOfPossession,
                                     final String serviceAccountName,
                                     final String serviceAccountUID,
                                     final String signerName,
                                     final Map<String, String> unverifiedUserAnnotations) {
        this.maxExpirationSeconds = maxExpirationSeconds;
        this.nodeName = nodeName;
        this.nodeUID = nodeUID;
        this.pkixPublicKey = pkixPublicKey;
        this.podName = podName;
        this.podUID = podUID;
        this.proofOfPossession = proofOfPossession;
        this.serviceAccountName = serviceAccountName;
        this.serviceAccountUID = serviceAccountUID;
        this.signerName = signerName;
        this.unverifiedUserAnnotations = unverifiedUserAnnotations;
    }

    public Integer getMaxExpirationSeconds() {
        return maxExpirationSeconds;
    }

    public void setMaxExpirationSeconds(final Integer maxExpirationSeconds) {
        this.maxExpirationSeconds = maxExpirationSeconds;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeUID() {
        return nodeUID;
    }

    public void setNodeUID(final String nodeUID) {
        this.nodeUID = nodeUID;
    }

    public String getPkixPublicKey() {
        return pkixPublicKey;
    }

    public void setPkixPublicKey(final String pkixPublicKey) {
        this.pkixPublicKey = pkixPublicKey;
    }

    public String getPodName() {
        return podName;
    }

    public void setPodName(final String podName) {
        this.podName = podName;
    }

    public String getPodUID() {
        return podUID;
    }

    public void setPodUID(final String podUID) {
        this.podUID = podUID;
    }

    public String getProofOfPossession() {
        return proofOfPossession;
    }

    public void setProofOfPossession(final String proofOfPossession) {
        this.proofOfPossession = proofOfPossession;
    }

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(final String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public String getServiceAccountUID() {
        return serviceAccountUID;
    }

    public void setServiceAccountUID(final String serviceAccountUID) {
        this.serviceAccountUID = serviceAccountUID;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(final String signerName) {
        this.signerName = signerName;
    }

    public Map<String, String> getUnverifiedUserAnnotations() {
        return unverifiedUserAnnotations;
    }

    public void setUnverifiedUserAnnotations(final Map<String, String> unverifiedUserAnnotations) {
        this.unverifiedUserAnnotations = unverifiedUserAnnotations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxExpirationSeconds,
                nodeName,
                nodeUID,
                pkixPublicKey,
                podName,
                podUID,
                proofOfPossession,
                serviceAccountName,
                serviceAccountUID,
                signerName,
                unverifiedUserAnnotations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodCertificateRequestSpec)) {
            return false;
        }
        final PodCertificateRequestSpec __otherCasted = (PodCertificateRequestSpec) __other;
        return Objects.equals(maxExpirationSeconds, __otherCasted.maxExpirationSeconds) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(nodeUID, __otherCasted.nodeUID) &&
            Objects.equals(pkixPublicKey, __otherCasted.pkixPublicKey) &&
            Objects.equals(podName, __otherCasted.podName) &&
            Objects.equals(podUID, __otherCasted.podUID) &&
            Objects.equals(proofOfPossession, __otherCasted.proofOfPossession) &&
            Objects.equals(serviceAccountName, __otherCasted.serviceAccountName) &&
            Objects.equals(serviceAccountUID, __otherCasted.serviceAccountUID) &&
            Objects.equals(signerName, __otherCasted.signerName) &&
            Objects.equals(unverifiedUserAnnotations, __otherCasted.unverifiedUserAnnotations);
    }

    public PodCertificateRequestSpec maxExpirationSeconds(final Integer maxExpirationSeconds) {
        this.maxExpirationSeconds = maxExpirationSeconds;
        return this;
    }

    public PodCertificateRequestSpec nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public PodCertificateRequestSpec nodeUID(final String nodeUID) {
        this.nodeUID = nodeUID;
        return this;
    }

    public PodCertificateRequestSpec pkixPublicKey(final String pkixPublicKey) {
        this.pkixPublicKey = pkixPublicKey;
        return this;
    }

    public PodCertificateRequestSpec podName(final String podName) {
        this.podName = podName;
        return this;
    }

    public PodCertificateRequestSpec podUID(final String podUID) {
        this.podUID = podUID;
        return this;
    }

    public PodCertificateRequestSpec proofOfPossession(final String proofOfPossession) {
        this.proofOfPossession = proofOfPossession;
        return this;
    }

    public PodCertificateRequestSpec serviceAccountName(final String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    public PodCertificateRequestSpec serviceAccountUID(final String serviceAccountUID) {
        this.serviceAccountUID = serviceAccountUID;
        return this;
    }

    public PodCertificateRequestSpec signerName(final String signerName) {
        this.signerName = signerName;
        return this;
    }

    public PodCertificateRequestSpec unverifiedUserAnnotations(final Map<String, String> unverifiedUserAnnotations) {
        this.unverifiedUserAnnotations = unverifiedUserAnnotations;
        return this;
    }

    @Override
    public PodCertificateRequestSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (nodeName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nodeName", "nodeName",
                "Missing 'nodeName' attribute.", true));
        }
        if (nodeUID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nodeUID", "nodeUID",
                "Missing 'nodeUID' attribute.", true));
        }
        if (pkixPublicKey == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pkixPublicKey", "pkixPublicKey",
                "Missing 'pkixPublicKey' attribute.", true));
        }
        if (podName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "podName", "podName",
                "Missing 'podName' attribute.", true));
        }
        if (podUID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "podUID", "podUID",
                "Missing 'podUID' attribute.", true));
        }
        if (proofOfPossession == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "proofOfPossession", "proofOfPossession",
                "Missing 'proofOfPossession' attribute.", true));
        }
        if (serviceAccountName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serviceAccountName", "serviceAccountName",
                "Missing 'serviceAccountName' attribute.", true));
        }
        if (serviceAccountUID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serviceAccountUID", "serviceAccountUID",
                "Missing 'serviceAccountUID' attribute.", true));
        }
        if (signerName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "signerName", "signerName",
                "Missing 'signerName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (maxExpirationSeconds != null ? "\"maxExpirationSeconds\":" + maxExpirationSeconds : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (nodeUID != null ? "\"nodeUID\":\"" +  JsonStrings.escapeJson(nodeUID) + "\"" : ""),
                    (pkixPublicKey != null ? "\"pkixPublicKey\":\"" +  JsonStrings.escapeJson(pkixPublicKey) + "\"" : ""),
                    (podName != null ? "\"podName\":\"" +  JsonStrings.escapeJson(podName) + "\"" : ""),
                    (podUID != null ? "\"podUID\":\"" +  JsonStrings.escapeJson(podUID) + "\"" : ""),
                    (proofOfPossession != null ? "\"proofOfPossession\":\"" +  JsonStrings.escapeJson(proofOfPossession) + "\"" : ""),
                    (serviceAccountName != null ? "\"serviceAccountName\":\"" +  JsonStrings.escapeJson(serviceAccountName) + "\"" : ""),
                    (serviceAccountUID != null ? "\"serviceAccountUID\":\"" +  JsonStrings.escapeJson(serviceAccountUID) + "\"" : ""),
                    (signerName != null ? "\"signerName\":\"" +  JsonStrings.escapeJson(signerName) + "\"" : ""),
                    (unverifiedUserAnnotations != null ? "\"unverifiedUserAnnotations\":" + unverifiedUserAnnotations.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
