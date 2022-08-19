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
package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EventSeries implements Validable<EventSeries>, Exportable {
    private Integer count;
    private String lastObservedTime;

    public EventSeries() {
        // no-op
    }

    public EventSeries(final Integer count,
                       final String lastObservedTime) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count,
                lastObservedTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventSeries)) {
            return false;
        }
        final EventSeries __otherCasted = (EventSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime);
    }

    public EventSeries count(final Integer count) {
        this.count = count;
        return this;
    }

    public EventSeries lastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    @Override
    public EventSeries validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (count != null ? "\"count\":" + count : ""),
                    (lastObservedTime != null ? "\"lastObservedTime\":\"" +  JsonStrings.escapeJson(lastObservedTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
