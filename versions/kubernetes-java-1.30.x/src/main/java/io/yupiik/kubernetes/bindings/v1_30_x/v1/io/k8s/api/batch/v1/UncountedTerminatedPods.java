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
package io.yupiik.kubernetes.bindings.v1_30_x.v1;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.batch.v1.UncountedTerminatedPods implements Validable<io.k8s.api.batch.v1.UncountedTerminatedPods>, Exportable {
    private List<String> failed;
    private List<String> succeeded;

    public io.k8s.api.batch.v1.UncountedTerminatedPods() {
        // no-op
    }

    public io.k8s.api.batch.v1.UncountedTerminatedPods(final List<String> failed,
                                                       final List<String> succeeded) {
        this.failed = failed;
        this.succeeded = succeeded;
    }

    public List<String> getFailed() {
        return failed;
    }

    public void setFailed(final List<String> failed) {
        this.failed = failed;
    }

    public List<String> getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(final List<String> succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                failed,
                succeeded);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.batch.v1.UncountedTerminatedPods)) {
            return false;
        }
        final io.k8s.api.batch.v1.UncountedTerminatedPods __otherCasted = (io.k8s.api.batch.v1.UncountedTerminatedPods) __other;
        return Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(succeeded, __otherCasted.succeeded);
    }

    public io.k8s.api.batch.v1.UncountedTerminatedPods failed(final List<String> failed) {
        this.failed = failed;
        return this;
    }

    public io.k8s.api.batch.v1.UncountedTerminatedPods succeeded(final List<String> succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    @Override
    public io.k8s.api.batch.v1.UncountedTerminatedPods validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (failed != null ? "\"failed\":" + failed.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (succeeded != null ? "\"succeeded\":" + succeeded.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
