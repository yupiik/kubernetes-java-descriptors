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
package io.yupiik.kubernetes.bindings.v1_34_x.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodCertificateRequestStatus implements Validable<PodCertificateRequestStatus>, Exportable {
    private String beginRefreshAt;
    private String certificateChain;
    private List<Condition> conditions;
    private String notAfter;
    private String notBefore;

    public PodCertificateRequestStatus() {
        // no-op
    }

    public PodCertificateRequestStatus(final String beginRefreshAt,
                                       final String certificateChain,
                                       final List<Condition> conditions,
                                       final String notAfter,
                                       final String notBefore) {
        this.beginRefreshAt = beginRefreshAt;
        this.certificateChain = certificateChain;
        this.conditions = conditions;
        this.notAfter = notAfter;
        this.notBefore = notBefore;
    }

    public String getBeginRefreshAt() {
        return beginRefreshAt;
    }

    public void setBeginRefreshAt(final String beginRefreshAt) {
        this.beginRefreshAt = beginRefreshAt;
    }

    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(final String certificateChain) {
        this.certificateChain = certificateChain;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(final String notAfter) {
        this.notAfter = notAfter;
    }

    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(final String notBefore) {
        this.notBefore = notBefore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                beginRefreshAt,
                certificateChain,
                conditions,
                notAfter,
                notBefore);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodCertificateRequestStatus)) {
            return false;
        }
        final PodCertificateRequestStatus __otherCasted = (PodCertificateRequestStatus) __other;
        return Objects.equals(beginRefreshAt, __otherCasted.beginRefreshAt) &&
            Objects.equals(certificateChain, __otherCasted.certificateChain) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(notAfter, __otherCasted.notAfter) &&
            Objects.equals(notBefore, __otherCasted.notBefore);
    }

    public PodCertificateRequestStatus beginRefreshAt(final String beginRefreshAt) {
        this.beginRefreshAt = beginRefreshAt;
        return this;
    }

    public PodCertificateRequestStatus certificateChain(final String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    public PodCertificateRequestStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PodCertificateRequestStatus notAfter(final String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    public PodCertificateRequestStatus notBefore(final String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    @Override
    public PodCertificateRequestStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (beginRefreshAt != null ? "\"beginRefreshAt\":\"" +  JsonStrings.escapeJson(beginRefreshAt) + "\"" : ""),
                    (certificateChain != null ? "\"certificateChain\":\"" +  JsonStrings.escapeJson(certificateChain) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (notAfter != null ? "\"notAfter\":\"" +  JsonStrings.escapeJson(notAfter) + "\"" : ""),
                    (notBefore != null ? "\"notBefore\":\"" +  JsonStrings.escapeJson(notBefore) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
