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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.authorization.v1.SubjectAccessReviewStatus implements Validable<io.k8s.api.authorization.v1.SubjectAccessReviewStatus>, Exportable {
    private boolean allowed;
    private Boolean denied;
    private String evaluationError;
    private String reason;

    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus() {
        // no-op
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus(final boolean allowed,
                                                                 final Boolean denied,
                                                                 final String evaluationError,
                                                                 final String reason) {
        this.allowed = allowed;
        this.denied = denied;
        this.evaluationError = evaluationError;
        this.reason = reason;
    }

    public boolean getAllowed() {
        return allowed;
    }

    public void setAllowed(final boolean allowed) {
        this.allowed = allowed;
    }

    public Boolean getDenied() {
        return denied;
    }

    public void setDenied(final Boolean denied) {
        this.denied = denied;
    }

    public String getEvaluationError() {
        return evaluationError;
    }

    public void setEvaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowed,
                denied,
                evaluationError,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.authorization.v1.SubjectAccessReviewStatus)) {
            return false;
        }
        final io.k8s.api.authorization.v1.SubjectAccessReviewStatus __otherCasted = (io.k8s.api.authorization.v1.SubjectAccessReviewStatus) __other;
        return Objects.equals(allowed, __otherCasted.allowed) &&
            Objects.equals(denied, __otherCasted.denied) &&
            Objects.equals(evaluationError, __otherCasted.evaluationError) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus allowed(final boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus denied(final Boolean denied) {
        this.denied = denied;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus evaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public io.k8s.api.authorization.v1.SubjectAccessReviewStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"allowed\":" + allowed,
                    (denied != null ? "\"denied\":" + denied : ""),
                    (evaluationError != null ? "\"evaluationError\":\"" +  JsonStrings.escapeJson(evaluationError) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
