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
import io.yupiik.kubernetes.bindings.v1_32_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.events.v1.EventSeries implements Validable<io.k8s.api.events.v1.EventSeries>, Exportable {
    private int count;
    private String lastObservedTime;

    public io.k8s.api.events.v1.EventSeries() {
        // no-op
    }

    public io.k8s.api.events.v1.EventSeries(final int count,
                                            final String lastObservedTime) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                count,
                lastObservedTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.events.v1.EventSeries)) {
            return false;
        }
        final io.k8s.api.events.v1.EventSeries __otherCasted = (io.k8s.api.events.v1.EventSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime);
    }

    public io.k8s.api.events.v1.EventSeries count(final int count) {
        this.count = count;
        return this;
    }

    public io.k8s.api.events.v1.EventSeries lastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    @Override
    public io.k8s.api.events.v1.EventSeries validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (lastObservedTime == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "lastObservedTime", "lastObservedTime",
                "Missing 'lastObservedTime' attribute.", true));
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
                    (lastObservedTime != null ? "\"lastObservedTime\":\"" +  JsonStrings.escapeJson(lastObservedTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
