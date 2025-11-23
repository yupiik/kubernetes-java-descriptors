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
package io.yupiik.kubernetes.bindings.v1_24_17.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_17.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_17.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointConditions implements Validable<EndpointConditions>, Exportable {
    private Boolean ready;
    private Boolean serving;
    private Boolean terminating;

    public EndpointConditions() {
        // no-op
    }

    public EndpointConditions(final Boolean ready,
                              final Boolean serving,
                              final Boolean terminating) {
        this.ready = ready;
        this.serving = serving;
        this.terminating = terminating;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(final Boolean ready) {
        this.ready = ready;
    }

    public Boolean getServing() {
        return serving;
    }

    public void setServing(final Boolean serving) {
        this.serving = serving;
    }

    public Boolean getTerminating() {
        return terminating;
    }

    public void setTerminating(final Boolean terminating) {
        this.terminating = terminating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ready,
                serving,
                terminating);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointConditions)) {
            return false;
        }
        final EndpointConditions __otherCasted = (EndpointConditions) __other;
        return Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(serving, __otherCasted.serving) &&
            Objects.equals(terminating, __otherCasted.terminating);
    }

    public EndpointConditions ready(final Boolean ready) {
        this.ready = ready;
        return this;
    }

    public EndpointConditions serving(final Boolean serving) {
        this.serving = serving;
        return this;
    }

    public EndpointConditions terminating(final Boolean terminating) {
        this.terminating = terminating;
        return this;
    }

    @Override
    public EndpointConditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ready != null ? "\"ready\":" + ready : ""),
                    (serving != null ? "\"serving\":" + serving : ""),
                    (terminating != null ? "\"terminating\":" + terminating : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
