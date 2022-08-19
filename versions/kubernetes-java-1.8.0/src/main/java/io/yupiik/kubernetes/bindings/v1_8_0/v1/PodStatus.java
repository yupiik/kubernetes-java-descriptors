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
package io.yupiik.kubernetes.bindings.v1_8_0.v1;

import io.yupiik.kubernetes.bindings.v1_8_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodStatus implements Validable<PodStatus>, Exportable {
    private List<PodCondition> conditions;
    private List<ContainerStatus> containerStatuses;
    private String hostIP;
    private List<ContainerStatus> initContainerStatuses;
    private String message;
    private String phase;
    private String podIP;
    private String qosClass;
    private String reason;
    private String startTime;

    public PodStatus() {
        // no-op
    }

    public PodStatus(final List<PodCondition> conditions,
                     final List<ContainerStatus> containerStatuses,
                     final String hostIP,
                     final List<ContainerStatus> initContainerStatuses,
                     final String message,
                     final String phase,
                     final String podIP,
                     final String qosClass,
                     final String reason,
                     final String startTime) {
        this.conditions = conditions;
        this.containerStatuses = containerStatuses;
        this.hostIP = hostIP;
        this.initContainerStatuses = initContainerStatuses;
        this.message = message;
        this.phase = phase;
        this.podIP = podIP;
        this.qosClass = qosClass;
        this.reason = reason;
        this.startTime = startTime;
    }

    public List<PodCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PodCondition> conditions) {
        this.conditions = conditions;
    }

    public List<ContainerStatus> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(final List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public List<ContainerStatus> getInitContainerStatuses() {
        return initContainerStatuses;
    }

    public void setInitContainerStatuses(final List<ContainerStatus> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    public String getPodIP() {
        return podIP;
    }

    public void setPodIP(final String podIP) {
        this.podIP = podIP;
    }

    public String getQosClass() {
        return qosClass;
    }

    public void setQosClass(final String qosClass) {
        this.qosClass = qosClass;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(final String startTime) {
        this.startTime = startTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                containerStatuses,
                hostIP,
                initContainerStatuses,
                message,
                phase,
                podIP,
                qosClass,
                reason,
                startTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodStatus)) {
            return false;
        }
        final PodStatus __otherCasted = (PodStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(containerStatuses, __otherCasted.containerStatuses) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(initContainerStatuses, __otherCasted.initContainerStatuses) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(podIP, __otherCasted.podIP) &&
            Objects.equals(qosClass, __otherCasted.qosClass) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(startTime, __otherCasted.startTime);
    }

    public PodStatus conditions(final List<PodCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PodStatus containerStatuses(final List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
        return this;
    }

    public PodStatus hostIP(final String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public PodStatus initContainerStatuses(final List<ContainerStatus> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
        return this;
    }

    public PodStatus message(final String message) {
        this.message = message;
        return this;
    }

    public PodStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    public PodStatus podIP(final String podIP) {
        this.podIP = podIP;
        return this;
    }

    public PodStatus qosClass(final String qosClass) {
        this.qosClass = qosClass;
        return this;
    }

    public PodStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public PodStatus startTime(final String startTime) {
        this.startTime = startTime;
        return this;
    }

    @Override
    public PodStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (containerStatuses != null ? "\"containerStatuses\":" + containerStatuses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (hostIP != null ? "\"hostIP\":\"" +  JsonStrings.escapeJson(hostIP) + "\"" : ""),
                    (initContainerStatuses != null ? "\"initContainerStatuses\":" + initContainerStatuses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""),
                    (podIP != null ? "\"podIP\":\"" +  JsonStrings.escapeJson(podIP) + "\"" : ""),
                    (qosClass != null ? "\"qosClass\":\"" +  JsonStrings.escapeJson(qosClass) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (startTime != null ? "\"startTime\":\"" +  JsonStrings.escapeJson(startTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
