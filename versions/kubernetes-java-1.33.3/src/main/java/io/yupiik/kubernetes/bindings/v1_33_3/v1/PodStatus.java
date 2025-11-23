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
package io.yupiik.kubernetes.bindings.v1_33_3.v1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodStatus implements Validable<PodStatus>, Exportable {
    private List<PodCondition> conditions;
    private List<ContainerStatus> containerStatuses;
    private List<ContainerStatus> ephemeralContainerStatuses;
    private String hostIP;
    private List<HostIP> hostIPs;
    private List<ContainerStatus> initContainerStatuses;
    private String message;
    private String nominatedNodeName;
    private Integer observedGeneration;
    private String phase;
    private String podIP;
    private List<PodIP> podIPs;
    private String qosClass;
    private String reason;
    private String resize;
    private List<PodResourceClaimStatus> resourceClaimStatuses;
    private String startTime;

    public PodStatus() {
        // no-op
    }

    public PodStatus(final List<PodCondition> conditions,
                     final List<ContainerStatus> containerStatuses,
                     final List<ContainerStatus> ephemeralContainerStatuses,
                     final String hostIP,
                     final List<HostIP> hostIPs,
                     final List<ContainerStatus> initContainerStatuses,
                     final String message,
                     final String nominatedNodeName,
                     final Integer observedGeneration,
                     final String phase,
                     final String podIP,
                     final List<PodIP> podIPs,
                     final String qosClass,
                     final String reason,
                     final String resize,
                     final List<PodResourceClaimStatus> resourceClaimStatuses,
                     final String startTime) {
        this.conditions = conditions;
        this.containerStatuses = containerStatuses;
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
        this.hostIP = hostIP;
        this.hostIPs = hostIPs;
        this.initContainerStatuses = initContainerStatuses;
        this.message = message;
        this.nominatedNodeName = nominatedNodeName;
        this.observedGeneration = observedGeneration;
        this.phase = phase;
        this.podIP = podIP;
        this.podIPs = podIPs;
        this.qosClass = qosClass;
        this.reason = reason;
        this.resize = resize;
        this.resourceClaimStatuses = resourceClaimStatuses;
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

    public List<ContainerStatus> getEphemeralContainerStatuses() {
        return ephemeralContainerStatuses;
    }

    public void setEphemeralContainerStatuses(final List<ContainerStatus> ephemeralContainerStatuses) {
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public List<HostIP> getHostIPs() {
        return hostIPs;
    }

    public void setHostIPs(final List<HostIP> hostIPs) {
        this.hostIPs = hostIPs;
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

    public String getNominatedNodeName() {
        return nominatedNodeName;
    }

    public void setNominatedNodeName(final String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
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

    public List<PodIP> getPodIPs() {
        return podIPs;
    }

    public void setPodIPs(final List<PodIP> podIPs) {
        this.podIPs = podIPs;
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

    public String getResize() {
        return resize;
    }

    public void setResize(final String resize) {
        this.resize = resize;
    }

    public List<PodResourceClaimStatus> getResourceClaimStatuses() {
        return resourceClaimStatuses;
    }

    public void setResourceClaimStatuses(final List<PodResourceClaimStatus> resourceClaimStatuses) {
        this.resourceClaimStatuses = resourceClaimStatuses;
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
                ephemeralContainerStatuses,
                hostIP,
                hostIPs,
                initContainerStatuses,
                message,
                nominatedNodeName,
                observedGeneration,
                phase,
                podIP,
                podIPs,
                qosClass,
                reason,
                resize,
                resourceClaimStatuses,
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
            Objects.equals(ephemeralContainerStatuses, __otherCasted.ephemeralContainerStatuses) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(hostIPs, __otherCasted.hostIPs) &&
            Objects.equals(initContainerStatuses, __otherCasted.initContainerStatuses) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(nominatedNodeName, __otherCasted.nominatedNodeName) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(podIP, __otherCasted.podIP) &&
            Objects.equals(podIPs, __otherCasted.podIPs) &&
            Objects.equals(qosClass, __otherCasted.qosClass) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(resize, __otherCasted.resize) &&
            Objects.equals(resourceClaimStatuses, __otherCasted.resourceClaimStatuses) &&
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

    public PodStatus ephemeralContainerStatuses(final List<ContainerStatus> ephemeralContainerStatuses) {
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
        return this;
    }

    public PodStatus hostIP(final String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public PodStatus hostIPs(final List<HostIP> hostIPs) {
        this.hostIPs = hostIPs;
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

    public PodStatus nominatedNodeName(final String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
        return this;
    }

    public PodStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
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

    public PodStatus podIPs(final List<PodIP> podIPs) {
        this.podIPs = podIPs;
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

    public PodStatus resize(final String resize) {
        this.resize = resize;
        return this;
    }

    public PodStatus resourceClaimStatuses(final List<PodResourceClaimStatus> resourceClaimStatuses) {
        this.resourceClaimStatuses = resourceClaimStatuses;
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
                    (ephemeralContainerStatuses != null ? "\"ephemeralContainerStatuses\":" + ephemeralContainerStatuses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (hostIP != null ? "\"hostIP\":\"" +  JsonStrings.escapeJson(hostIP) + "\"" : ""),
                    (hostIPs != null ? "\"hostIPs\":" + hostIPs.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (initContainerStatuses != null ? "\"initContainerStatuses\":" + initContainerStatuses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (nominatedNodeName != null ? "\"nominatedNodeName\":\"" +  JsonStrings.escapeJson(nominatedNodeName) + "\"" : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""),
                    (podIP != null ? "\"podIP\":\"" +  JsonStrings.escapeJson(podIP) + "\"" : ""),
                    (podIPs != null ? "\"podIPs\":" + podIPs.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (qosClass != null ? "\"qosClass\":\"" +  JsonStrings.escapeJson(qosClass) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (resize != null ? "\"resize\":\"" +  JsonStrings.escapeJson(resize) + "\"" : ""),
                    (resourceClaimStatuses != null ? "\"resourceClaimStatuses\":" + resourceClaimStatuses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (startTime != null ? "\"startTime\":\"" +  JsonStrings.escapeJson(startTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
