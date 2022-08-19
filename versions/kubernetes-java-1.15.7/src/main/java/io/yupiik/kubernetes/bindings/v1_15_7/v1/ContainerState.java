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
package io.yupiik.kubernetes.bindings.v1_15_7.v1;

import io.yupiik.kubernetes.bindings.v1_15_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_7.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerState implements Validable<ContainerState>, Exportable {
    private ContainerStateRunning running;
    private ContainerStateTerminated terminated;
    private ContainerStateWaiting waiting;

    public ContainerState() {
        // no-op
    }

    public ContainerState(final ContainerStateRunning running,
                          final ContainerStateTerminated terminated,
                          final ContainerStateWaiting waiting) {
        this.running = running;
        this.terminated = terminated;
        this.waiting = waiting;
    }

    public ContainerStateRunning getRunning() {
        return running;
    }

    public void setRunning(final ContainerStateRunning running) {
        this.running = running;
    }

    public ContainerStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final ContainerStateTerminated terminated) {
        this.terminated = terminated;
    }

    public ContainerStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final ContainerStateWaiting waiting) {
        this.waiting = waiting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                running,
                terminated,
                waiting);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerState)) {
            return false;
        }
        final ContainerState __otherCasted = (ContainerState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }

    public ContainerState running(final ContainerStateRunning running) {
        this.running = running;
        return this;
    }

    public ContainerState terminated(final ContainerStateTerminated terminated) {
        this.terminated = terminated;
        return this;
    }

    public ContainerState waiting(final ContainerStateWaiting waiting) {
        this.waiting = waiting;
        return this;
    }

    @Override
    public ContainerState validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (running != null ? "\"running\":" + running.asJson() : ""),
                    (terminated != null ? "\"terminated\":" + terminated.asJson() : ""),
                    (waiting != null ? "\"waiting\":" + waiting.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
