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
package io.yupiik.kubernetes.bindings.v1_17_8.v1;

import io.yupiik.kubernetes.bindings.v1_17_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LeaseSpec implements Validable<LeaseSpec>, Exportable {
    private String acquireTime;
    private String holderIdentity;
    private Integer leaseDurationSeconds;
    private Integer leaseTransitions;
    private String renewTime;

    public LeaseSpec() {
        // no-op
    }

    public LeaseSpec(final String acquireTime,
                     final String holderIdentity,
                     final Integer leaseDurationSeconds,
                     final Integer leaseTransitions,
                     final String renewTime) {
        this.acquireTime = acquireTime;
        this.holderIdentity = holderIdentity;
        this.leaseDurationSeconds = leaseDurationSeconds;
        this.leaseTransitions = leaseTransitions;
        this.renewTime = renewTime;
    }

    public String getAcquireTime() {
        return acquireTime;
    }

    public void setAcquireTime(final String acquireTime) {
        this.acquireTime = acquireTime;
    }

    public String getHolderIdentity() {
        return holderIdentity;
    }

    public void setHolderIdentity(final String holderIdentity) {
        this.holderIdentity = holderIdentity;
    }

    public Integer getLeaseDurationSeconds() {
        return leaseDurationSeconds;
    }

    public void setLeaseDurationSeconds(final Integer leaseDurationSeconds) {
        this.leaseDurationSeconds = leaseDurationSeconds;
    }

    public Integer getLeaseTransitions() {
        return leaseTransitions;
    }

    public void setLeaseTransitions(final Integer leaseTransitions) {
        this.leaseTransitions = leaseTransitions;
    }

    public String getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(final String renewTime) {
        this.renewTime = renewTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acquireTime,
                holderIdentity,
                leaseDurationSeconds,
                leaseTransitions,
                renewTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LeaseSpec)) {
            return false;
        }
        final LeaseSpec __otherCasted = (LeaseSpec) __other;
        return Objects.equals(acquireTime, __otherCasted.acquireTime) &&
            Objects.equals(holderIdentity, __otherCasted.holderIdentity) &&
            Objects.equals(leaseDurationSeconds, __otherCasted.leaseDurationSeconds) &&
            Objects.equals(leaseTransitions, __otherCasted.leaseTransitions) &&
            Objects.equals(renewTime, __otherCasted.renewTime);
    }

    public LeaseSpec acquireTime(final String acquireTime) {
        this.acquireTime = acquireTime;
        return this;
    }

    public LeaseSpec holderIdentity(final String holderIdentity) {
        this.holderIdentity = holderIdentity;
        return this;
    }

    public LeaseSpec leaseDurationSeconds(final Integer leaseDurationSeconds) {
        this.leaseDurationSeconds = leaseDurationSeconds;
        return this;
    }

    public LeaseSpec leaseTransitions(final Integer leaseTransitions) {
        this.leaseTransitions = leaseTransitions;
        return this;
    }

    public LeaseSpec renewTime(final String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    @Override
    public LeaseSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (acquireTime != null ? "\"acquireTime\":\"" +  JsonStrings.escapeJson(acquireTime) + "\"" : ""),
                    (holderIdentity != null ? "\"holderIdentity\":\"" +  JsonStrings.escapeJson(holderIdentity) + "\"" : ""),
                    (leaseDurationSeconds != null ? "\"leaseDurationSeconds\":" + leaseDurationSeconds : ""),
                    (leaseTransitions != null ? "\"leaseTransitions\":" + leaseTransitions : ""),
                    (renewTime != null ? "\"renewTime\":\"" +  JsonStrings.escapeJson(renewTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
