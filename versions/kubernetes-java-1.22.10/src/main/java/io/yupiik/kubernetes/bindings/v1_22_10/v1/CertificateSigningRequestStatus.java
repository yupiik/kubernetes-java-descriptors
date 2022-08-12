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
package io.yupiik.kubernetes.bindings.v1_22_10.v1;

import io.yupiik.kubernetes.bindings.v1_22_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_10.Validable;
import io.yupiik.kubernetes.bindings.v1_22_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CertificateSigningRequestStatus implements Validable<CertificateSigningRequestStatus>, Exportable {
    private String certificate;
    private List<CertificateSigningRequestCondition> conditions;

    public CertificateSigningRequestStatus() {
        // no-op
    }

    public CertificateSigningRequestStatus(final String certificate,
                                           final List<CertificateSigningRequestCondition> conditions) {
        // no-op
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    public List<CertificateSigningRequestCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CertificateSigningRequestCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                certificate,
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestStatus)) {
            return false;
        }
        final CertificateSigningRequestStatus __otherCasted = (CertificateSigningRequestStatus) __other;
        return Objects.equals(certificate, __otherCasted.certificate) &&
            Objects.equals(conditions, __otherCasted.conditions);
    }

    public CertificateSigningRequestStatus certificate(final String certificate) {
        this.certificate = certificate;
        return this;
    }

    public CertificateSigningRequestStatus conditions(final List<CertificateSigningRequestCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public CertificateSigningRequestStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (certificate != null ? "\"certificate\":\"" +  JsonStrings.escapeJson(certificate) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
