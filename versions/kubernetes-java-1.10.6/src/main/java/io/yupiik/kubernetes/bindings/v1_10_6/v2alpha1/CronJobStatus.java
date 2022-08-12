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
package io.yupiik.kubernetes.bindings.v1_10_6.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_10_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_6.Validable;
import io.yupiik.kubernetes.bindings.v1_10_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CronJobStatus implements Validable<CronJobStatus>, Exportable {
    private List<ObjectReference> active;
    private String lastScheduleTime;

    public CronJobStatus() {
        // no-op
    }

    public CronJobStatus(final List<ObjectReference> active,
                         final String lastScheduleTime) {
        // no-op
    }

    public List<ObjectReference> getActive() {
        return active;
    }

    public void setActive(final List<ObjectReference> active) {
        this.active = active;
    }

    public String getLastScheduleTime() {
        return lastScheduleTime;
    }

    public void setLastScheduleTime(final String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                lastScheduleTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobStatus)) {
            return false;
        }
        final CronJobStatus __otherCasted = (CronJobStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(lastScheduleTime, __otherCasted.lastScheduleTime);
    }

    public CronJobStatus active(final List<ObjectReference> active) {
        this.active = active;
        return this;
    }

    public CronJobStatus lastScheduleTime(final String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    @Override
    public CronJobStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (active != null ? "\"active\":" + active.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (lastScheduleTime != null ? "\"lastScheduleTime\":\"" +  JsonStrings.escapeJson(lastScheduleTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
