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
package io.yupiik.kubernetes.bindings.v1_24_17.v1beta2;

import io.yupiik.kubernetes.bindings.v1_24_17.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_17.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class QueuingConfiguration implements Validable<QueuingConfiguration>, Exportable {
    private Integer handSize;
    private Integer queueLengthLimit;
    private Integer queues;

    public QueuingConfiguration() {
        // no-op
    }

    public QueuingConfiguration(final Integer handSize,
                                final Integer queueLengthLimit,
                                final Integer queues) {
        this.handSize = handSize;
        this.queueLengthLimit = queueLengthLimit;
        this.queues = queues;
    }

    public Integer getHandSize() {
        return handSize;
    }

    public void setHandSize(final Integer handSize) {
        this.handSize = handSize;
    }

    public Integer getQueueLengthLimit() {
        return queueLengthLimit;
    }

    public void setQueueLengthLimit(final Integer queueLengthLimit) {
        this.queueLengthLimit = queueLengthLimit;
    }

    public Integer getQueues() {
        return queues;
    }

    public void setQueues(final Integer queues) {
        this.queues = queues;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                handSize,
                queueLengthLimit,
                queues);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof QueuingConfiguration)) {
            return false;
        }
        final QueuingConfiguration __otherCasted = (QueuingConfiguration) __other;
        return Objects.equals(handSize, __otherCasted.handSize) &&
            Objects.equals(queueLengthLimit, __otherCasted.queueLengthLimit) &&
            Objects.equals(queues, __otherCasted.queues);
    }

    public QueuingConfiguration handSize(final Integer handSize) {
        this.handSize = handSize;
        return this;
    }

    public QueuingConfiguration queueLengthLimit(final Integer queueLengthLimit) {
        this.queueLengthLimit = queueLengthLimit;
        return this;
    }

    public QueuingConfiguration queues(final Integer queues) {
        this.queues = queues;
        return this;
    }

    @Override
    public QueuingConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (handSize != null ? "\"handSize\":" + handSize : ""),
                    (queueLengthLimit != null ? "\"queueLengthLimit\":" + queueLengthLimit : ""),
                    (queues != null ? "\"queues\":" + queues : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
