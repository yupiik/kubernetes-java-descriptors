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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.batch.v1.CronJobStatus implements Validable<io.k8s.api.batch.v1.CronJobStatus>, Exportable {
    private List<ObjectReference> active;
    private String lastScheduleTime;
    private String lastSuccessfulTime;

    public io.k8s.api.batch.v1.CronJobStatus() {
        // no-op
    }

    public io.k8s.api.batch.v1.CronJobStatus(final List<ObjectReference> active,
                                             final String lastScheduleTime,
                                             final String lastSuccessfulTime) {
        this.active = active;
        this.lastScheduleTime = lastScheduleTime;
        this.lastSuccessfulTime = lastSuccessfulTime;
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

    public String getLastSuccessfulTime() {
        return lastSuccessfulTime;
    }

    public void setLastSuccessfulTime(final String lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                lastScheduleTime,
                lastSuccessfulTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.batch.v1.CronJobStatus)) {
            return false;
        }
        final io.k8s.api.batch.v1.CronJobStatus __otherCasted = (io.k8s.api.batch.v1.CronJobStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(lastScheduleTime, __otherCasted.lastScheduleTime) &&
            Objects.equals(lastSuccessfulTime, __otherCasted.lastSuccessfulTime);
    }

    public io.k8s.api.batch.v1.CronJobStatus active(final List<ObjectReference> active) {
        this.active = active;
        return this;
    }

    public io.k8s.api.batch.v1.CronJobStatus lastScheduleTime(final String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    public io.k8s.api.batch.v1.CronJobStatus lastSuccessfulTime(final String lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
        return this;
    }

    @Override
    public io.k8s.api.batch.v1.CronJobStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (active != null ? "\"active\":" + active.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (lastScheduleTime != null ? "\"lastScheduleTime\":\"" +  JsonStrings.escapeJson(lastScheduleTime) + "\"" : ""),
                    (lastSuccessfulTime != null ? "\"lastSuccessfulTime\":\"" +  JsonStrings.escapeJson(lastSuccessfulTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
