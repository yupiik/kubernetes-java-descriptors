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
package io.yupiik.kubernetes.bindings.v1_10_8.v1beta2;

import io.yupiik.kubernetes.bindings.v1_10_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Lifecycle implements Validable<Lifecycle>, Exportable {
    private Handler postStart;
    private Handler preStop;

    public Lifecycle() {
        // no-op
    }

    public Lifecycle(final Handler postStart,
                     final Handler preStop) {
        this.postStart = postStart;
        this.preStop = preStop;
    }

    public Handler getPostStart() {
        return postStart;
    }

    public void setPostStart(final Handler postStart) {
        this.postStart = postStart;
    }

    public Handler getPreStop() {
        return preStop;
    }

    public void setPreStop(final Handler preStop) {
        this.preStop = preStop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Lifecycle)) {
            return false;
        }
        final Lifecycle __otherCasted = (Lifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }

    public Lifecycle postStart(final Handler postStart) {
        this.postStart = postStart;
        return this;
    }

    public Lifecycle preStop(final Handler preStop) {
        this.preStop = preStop;
        return this;
    }

    @Override
    public Lifecycle validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (postStart != null ? "\"postStart\":" + postStart.asJson() : ""),
                    (preStop != null ? "\"preStop\":" + preStop.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
