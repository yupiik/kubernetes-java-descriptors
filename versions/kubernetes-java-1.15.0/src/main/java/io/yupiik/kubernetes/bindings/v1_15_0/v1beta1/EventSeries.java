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
package io.yupiik.kubernetes.bindings.v1_15_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_0.Validable;
import io.yupiik.kubernetes.bindings.v1_15_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EventSeries implements Validable<EventSeries>, Exportable {
    private int count;
    private String lastObservedTime;
    private String state;

    public EventSeries() {
        // no-op
    }

    public EventSeries(final int count,
                       final String lastObservedTime,
                       final String state) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count,
                lastObservedTime,
                state);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventSeries)) {
            return false;
        }
        final EventSeries __otherCasted = (EventSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime) &&
            Objects.equals(state, __otherCasted.state);
    }

    public EventSeries count(final int count) {
        this.count = count;
        return this;
    }

    public EventSeries lastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    public EventSeries state(final String state) {
        this.state = state;
        return this;
    }

    @Override
    public EventSeries validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (lastObservedTime == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "lastObservedTime", "lastObservedTime",
                "Missing 'lastObservedTime' attribute.", true));
        }
        if (state == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "state", "state",
                "Missing 'state' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"count\":" + count,
                    (lastObservedTime != null ? "\"lastObservedTime\":\"" +  JsonStrings.escapeJson(lastObservedTime) + "\"" : ""),
                    (state != null ? "\"state\":\"" +  JsonStrings.escapeJson(state) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
