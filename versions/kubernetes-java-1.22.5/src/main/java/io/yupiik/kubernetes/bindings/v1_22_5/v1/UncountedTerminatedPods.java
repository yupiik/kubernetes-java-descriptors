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
package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import io.yupiik.kubernetes.bindings.v1_22_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_5.Validable;
import io.yupiik.kubernetes.bindings.v1_22_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class UncountedTerminatedPods implements Validable<UncountedTerminatedPods>, Exportable {
    private List<String> failed;
    private List<String> succeeded;

    public UncountedTerminatedPods() {
        // no-op
    }

    public UncountedTerminatedPods(final List<String> failed,
                                   final List<String> succeeded) {
        // no-op
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
        if (!(__other instanceof UncountedTerminatedPods)) {
            return false;
        }
        final UncountedTerminatedPods __otherCasted = (UncountedTerminatedPods) __other;
        return Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(succeeded, __otherCasted.succeeded);
    }

    public UncountedTerminatedPods failed(final List<String> failed) {
        this.failed = failed;
        return this;
    }

    public UncountedTerminatedPods succeeded(final List<String> succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    @Override
    public UncountedTerminatedPods validate() {
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
