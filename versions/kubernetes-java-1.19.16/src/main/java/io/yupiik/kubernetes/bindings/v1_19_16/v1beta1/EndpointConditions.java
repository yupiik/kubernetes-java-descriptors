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
package io.yupiik.kubernetes.bindings.v1_19_16.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_16.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_16.Validable;
import io.yupiik.kubernetes.bindings.v1_19_16.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointConditions implements Validable<EndpointConditions>, Exportable {
    private Boolean ready;

    public EndpointConditions() {
        // no-op
    }

    public EndpointConditions(final Boolean ready) {
        // no-op
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(final Boolean ready) {
        this.ready = ready;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ready);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointConditions)) {
            return false;
        }
        final EndpointConditions __otherCasted = (EndpointConditions) __other;
        return Objects.equals(ready, __otherCasted.ready);
    }

    public EndpointConditions ready(final Boolean ready) {
        this.ready = ready;
        return this;
    }

    @Override
    public EndpointConditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ready != null ? "\"ready\":" + ready : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
